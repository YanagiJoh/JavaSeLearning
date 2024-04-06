package day25;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {

    @Test
    public void test1(){

        Person p1 = new Person("Tom",12);
        p1.age = 10;
        System.out.println(p1.toString());
        p1.show();

    }

    @Test
    public void test2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Class clazz = Person.class;
        Constructor cons = clazz.getConstructor(String.class,int.class);

        Object obj = cons.newInstance("Tom",12);
        Person p = (Person) obj;
        System.out.println(p.toString());

        Field age = clazz.getDeclaredField("age");
        age.set(p,10);
        System.out.println(p.toString());

        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);
        System.out.println("********************");

        Constructor cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        Person p1 = (Person) cons1.newInstance("Jerry");
        System.out.println(p1.toString());

        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"Yang");
        System.out.println(p1.toString());

        Method showNation = clazz.getDeclaredMethod("showNation",String.class);
        showNation.setAccessible(true);
        String nation = (String) showNation.invoke(p1, "中国");
        System.out.println(nation);

    }

    @Test
    public void test3() throws ClassNotFoundException {

        Class clazz1 = Person.class;
        System.out.println(clazz1);

        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        System.out.println(clazz2);

        Class clazz3 = Class.forName("day25.Person");
        System.out.println(clazz3);

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz1 == clazz3);

        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("day25.Person");
        System.out.println(clazz4);

        System.out.println(clazz1 == clazz4);
    }
}

package day25;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class OtherTest {

    @Test
    public void test1() {

        Class clazz = Person1.class;

        Constructor[] constructors = clazz.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }

        System.out.println();

        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor c : declaredConstructors) {
            System.out.println(c);
        }

    }

    @Test
    public void test2() {

        Class clazz = Person1.class;

        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);

        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);

    }

    @Test
    public void test3() {

        Class clazz = Person1.class;

        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType parametype = (ParameterizedType) genericSuperclass;
        Type[] actualTypeArguments = parametype.getActualTypeArguments();
        //System.out.println(actualTypeArguments[0].getTypeName());
        System.out.println(((Class) actualTypeArguments[0]).getTypeName());

    }

    @Test
    public void test4() {

        Class clazz = Person1.class;

        Class[] interfaces = clazz.getInterfaces();
        for (Class c : interfaces) {
            System.out.println(c);
        }

        System.out.println();

        Class[] interfaces1 = clazz.getSuperclass().getInterfaces();
        for (Class c : interfaces1) {
            System.out.println(c);
        }
    }

    @Test
    public void test5() {

        Class clazz = Person1.class;

        Package pack = clazz.getPackage();
        System.out.println(pack);
    }

    @Test
    public void test6() {

        Class clazz = Person1.class;

        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation anno : annotations) {
            System.out.println(anno);
        }
    }

    @Test
    public void test7() throws Exception {

        Class clazz = Person1.class;

        Person1 p = (Person1) clazz.newInstance();
        Field id = clazz.getField("id");
        id.set(p, 1001);

        int pId = (int) id.get(p);
        System.out.println(pId);
    }

    @Test
    public void test8() throws Exception {

        Class clazz = Person1.class;

        Person1 p = (Person1) clazz.newInstance();
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p, "Tom");

        System.out.println(name.get(p));

    }

    @Test
    public void test9() throws Exception {

        Class clazz = Person1.class;

        Person1 p = (Person1) clazz.newInstance();
        Method show = clazz.getDeclaredMethod("show", String.class);
        show.setAccessible(true);
        Object returnValue = show.invoke(p, "CHN");
        System.out.println(returnValue);

        System.out.println("**********staticのメソッドをコール**********");

        Method showDesc = clazz.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);
        Object returnValue1 = showDesc.invoke(Person1.class);
        System.out.println(returnValue1);

    }

    @Test
    public void test10() throws Exception {

        Class clazz = Person1.class;

        Constructor constructor = clazz.getDeclaredConstructor(String.class);

        constructor.setAccessible(true);

        Person1 per = (Person1) constructor.newInstance("Tom");
        System.out.println(per);

    }

}

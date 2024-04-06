package day25;

import org.junit.Test;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldTest {

    @Test
    public void test1() {
        Class clazz = Person1.class;

        Field[] fields = clazz.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }

        System.out.println();

        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f : declaredFields) {
            System.out.println(f);
        }
    }

    @Test
    public void test2() {

        Class clazz = Person1.class;

        Field[] declaredFields = clazz.getDeclaredFields();

        for (Field f : declaredFields) {

            int modifier = f.getModifiers();
            System.out.print(Modifier.toString(modifier) + "\t");

            Class type = f.getType();
            System.out.print(type.getName() + "\t");

            String fName = f.getName();
            System.out.print(fName);

            System.out.println();

        }

    }

}

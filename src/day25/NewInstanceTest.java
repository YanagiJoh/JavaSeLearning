package day25;

import org.junit.Test;

import java.util.Random;

public class NewInstanceTest {

    @Test
    public void test1() throws InstantiationException, IllegalAccessException {

        Class<Person> clazz = Person.class;
        Person obj = clazz.newInstance();
        System.out.println(obj);

    }

    @Test
    public void test2() {

        for (int i = 0; i < 100; i++) {

            int num = new Random().nextInt(3);
            String classPath = "";
            switch (num) {

                case 0:
                    classPath = "java.util.Date";
                    break;
                case 1:
                    classPath = "java.lang.Object";
                    break;
                case 2:
                    classPath = "day25.Person";
                    break;
            }

            try {
                Object obj = getInstance(classPath);
                System.out.println(obj);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    public Object getInstance(String classPath) throws Exception {

        Class clazz = Class.forName(classPath);
        return clazz.newInstance();

    }

}


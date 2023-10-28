package day19;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Date;

public class AnnotationTest {

    public static void main(String[] args) {

        Person p = new Student();
        p.walk();

        Date date = new Date(2023, 10, 21);
        System.out.println(date);

        @SuppressWarnings("unused")
        int num = 10;

        @SuppressWarnings({"unused", "rawtypes"})
        ArrayList list = new ArrayList();

    }

    @Test
    public void testGetAnnotation() {

        Class clazz = Student.class;
        Annotation[] annotations = clazz.getAnnotations();

        for (int i = 0; i < annotations.length; i++) {
            System.out.println(annotations[i]);
        }
    }

}

@MyAnnotation(value = "hi")
@MyAnnotation(value = "abc")
class Person {

    private String name;
    private int age;

    public Person() {

    }

    @MyAnnotation
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @MyAnnotation
    public void walk() {
        System.out.println("人が歩く");
    }

    public void eat() {
        System.out.println("人が食べる");
    }

}

class Student extends Person implements Info1{

    @Override
    public void walk() {
        System.out.println("学生が歩く");
    }

    @Override
    public void eat() {
        System.out.println("学生が食べる");
    }

    @Override
    public void show() {

    }
}

interface Info1 {
    void show();
}

class Generic<@MyAnnotation T> {

    public void show() throws @MyAnnotation RuntimeException {

        ArrayList<@MyAnnotation String> list = new ArrayList<>();
        int num = (@MyAnnotation int)10L;

    }

}

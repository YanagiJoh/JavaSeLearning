package day10;

import java.sql.SQLOutput;

public class ExtendTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        //p1.age = 20;
        p1.eat();
        System.out.println("********************");

        Student s1 = new Student();
        s1.eat();
        //s1.sleep();
        s1.name = "Tom";
        s1.setAge(20);
        System.out.println(s1.getAge());

        s1.breath();

    }
}

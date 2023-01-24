package day12.review;

import java.util.Objects;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("人：食べる");
    }

    public void walk() {
        System.out.println("人：歩く");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return this.age == p.age && this.name.equals(p.name);
        }
        return false;

    }

}

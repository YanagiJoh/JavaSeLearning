package day14;

public class AbstractTest {

}

abstract class Creature{
    public abstract void breath();
}
abstract class Person extends Creature {
    String name;
    int age;

    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


//    public void eat() {
//        System.out.println("ご飯を食べる");
//    }

    public abstract void  eat();

    public void walk() {
        System.out.println("道を歩く");
    }

}

class Student extends Person{

    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {

    }

    public void eat(){
        System.out.println("学生は営養食を食べるべき");
    }

    public void breath(){
        System.out.println("学生は新鮮な空気を吸うべき");
    }
}



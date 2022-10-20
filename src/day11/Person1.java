package day11;

public class Person1 {

    String name;
    int age;
    int id = 1001;

    public Person1(){
        System.out.println("私は何処にもいるかもしれない");
    }

    public Person1(String name){
        this.name = name;
    }

    public Person1(String name,int age){
        this(name);
        this.age = age;
    }

    public void eat(){
        System.out.println("人：食べる");
    }

    public void walk(){
        System.out.println("人：歩く");
    }
}

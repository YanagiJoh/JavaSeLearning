package day11;

public class Person {

    String name;
    int age;

    public Person(){

    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("食べる");
    }

    public void walk(int distance){
        System.out.println(distance + "歩いた");
        show();
        eat();
    }

    private void show(){
        System.out.println("人です");
    }

    public Object info(){
        return null;
    }

    public double info1(){
        return 1.0;
    }
}

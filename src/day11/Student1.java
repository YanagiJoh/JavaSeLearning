package day11;

public class Student1 extends Person1 {

    String major;
    int id = 1002;

    public Student1(){
        //super();
    }

    public Student1(String major){
        //super();
        this.major = major;
    }

    public Student1(String name,int age,String major){
        //this.name = name;
        //this.age = age;
        super(name,age);
        this.major = major;
    }

    @Override
    public void eat(){
        System.out.println("学生：営養の料理を食べる");
    }

    public void study(){
        System.out.println("学生：勉強する");
        this.eat();
        super.eat();
        super.walk();
    }

    public void show(){
        System.out.println("name = " + this.name + ",age = " + super.age);
        System.out.println("id = " + id);
        System.out.println("id = " + super.id);
    }
}

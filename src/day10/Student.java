package day10;

public class Student extends Person{

//    String name;
//    int age;
    String major;

    public Student(){

    }

    public Student(String name, int age, String major) {
        this.name = name;
        //this.age = age;
        setAge(age);
        this.major = major;
    }

//    public void eat(){
//        System.out.println("食べる");
//    }
//
//    public void sleep(){
//        System.out.println("寝る");
//    }

    public void study(){
        System.out.println("勉強する");
    }

    public void show(){
        System.out.println("名前：" + name + ",年齢：" + getAge());
    }
}

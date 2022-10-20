package day11;

public class Student extends Person{

    String major;

    public Student(){

    }

    public Student(String major){
        this.major = major;
    }

    public void study(){
        System.out.println(major + "を専攻する");
    }

    public void eat(){
        System.out.println("営業の料理を食べる");
    }

    public void show(){
        System.out.println("学生です");
    }

    public String info(){
        return null;
    }

//    public int info1(){
//        return 1;
//    }

    public void walk(int distance){
        System.out.println("オーバーライドのメソッドです。");
    }

}

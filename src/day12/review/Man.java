package day12.review;

public class Man extends Person {

    public Man(String name, int age) {
        super(name, age);
    }

    public void earnMoney(){
        System.out.println("男は金を稼いで家族を養う");
    }

    public void eat(){
        System.out.println("男：いっぱい食う");
    }

    public void walk(){
        System.out.println("男：覇気的に歩く");
    }
}

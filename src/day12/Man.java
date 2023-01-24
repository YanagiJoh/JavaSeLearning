package day12;

public class Man extends Person{

    boolean isSmoking;

    int id = 1002;

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

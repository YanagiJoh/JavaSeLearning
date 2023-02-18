package day13;

public class StaticTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        c1.name = "楊";
        c1.age = 31;

        Chinese c2 = new Chinese();
        c2.name = "李";
        c2.age = 40;

        c1.nation = "CHN";
        System.out.println(c2.nation);

        c1.eat();
        Chinese.show();
    }
}

class Chinese{

    String name;
    int age;
    static String nation;

    public void eat(){
        System.out.println("中国人は中華料理を食べる。");
        this.info();
        System.out.println("name: " + name);
        walk();
        System.out.println("nation: " + nation);
    }

    public static void show(){
        System.out.println("私は中国人です。");
        //eat();
        //name = "Tom";
        System.out.println(Chinese.nation);
        //System.out.println(this.nation);
        walk();
    }

    public void info(){
        System.out.println("name: " + name + ",age: " + age);
    }

    public static void walk(){

    }
}

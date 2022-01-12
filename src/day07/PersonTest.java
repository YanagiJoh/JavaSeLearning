package day07;

public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();

        p1.name = "Tom";
        p1.isMale = true;

        System.out.println(p1.name);

        p1.eat();
        p1.sleep();
        p1.talk("日本語");

        Person p2 = new Person();
        System.out.println(p2.name);//null
        System.out.println(p2.isMale);//false

        Person p3 = p1;
        System.out.println(p3.name);//Tom

        p3.age = 10;
        System.out.println(p1.age);//10

    }
}

class Person{

    //属性
    String name;
    int age;
    boolean isMale;

    //メソッド
    public void eat(){
        System.out.println("人は飯を食える");
    }

    public void sleep(){
        System.out.println("人は寝れる");
    }

    public void talk(String language){
        System.out.println("人は" + language + "が喋れる");
    }
}

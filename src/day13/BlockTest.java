package day13;

public class BlockTest {
    public static void main(String[] args) {
        String name = Person.desc;
        System.out.println(name);
        Person p1 = new Person();
        Person p2 = new Person();
        Person.info();
        System.out.println(p1.age);
    }
}

class Person{
    String name;
    int age;
    static String desc = "私は人です。";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(){

    }

    static{
        System.out.println("hello,static block-1");
        desc = "私は勉強が好きな人です。";
        info();
    }

    static{
        System.out.println("hello,static block-2");
    }

    {
        System.out.println("hello,block-1");
        eat();
        age = 1;
        info();
    }

    {
        System.out.println("hello,block-2");
    }

    public void eat(){
        System.out.println("飯を食う。");
    }

    public static void info(){
        System.out.println("hello,info");
    }
    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

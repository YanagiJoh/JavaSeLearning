package day10;

public class Person extends Creature {

    String name;
    private int age;

    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("食べる");
        sleep();
    }

    private void sleep(){
        System.out.println("寝る");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
package day09;

public class AnimalTest {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.name = "柴犬";
        //a.age = 1;
        //a.legs = 4;

        a.show();
        a.setAge(1);
        a.setLegs(4);
        a.show();
    }
}

class Animal {

    String name;
    private int age;
    private int legs;

    public void setLegs(int legs) {
        if (legs >= 0 && legs % 2 == 0) {
            this.legs = legs;
        } else {
            this.legs = 0;
        }
    }

    public int getLegs(){
        return legs;
    }

    public void eat() {
        System.out.print("動物が食べる");
    }

    public void show() {
        System.out.println("name = " + name + ",age = " + age + ",legs = " + legs);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

}
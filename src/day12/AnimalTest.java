package day12;

public class AnimalTest {

    public static void main(String[] args) {

        AnimalTest test = new AnimalTest();
        test.func(new Dog());
    }

    public void func(Animal animal){
        animal.eat();
        animal.shout();
    }
}

class Animal{

    public void eat(){
        System.out.println("動物:食べる");
    }

    public void shout(){
        System.out.println("動物:叫ぶ");
    }

}

class Dog extends Animal{

    public void eat(){
        System.out.println("犬:骨を食べる");
    }

    public void shout(){
        System.out.println("犬:ワン!ワン!ワン!");
    }

}

class Cat extends Animal{

    public void eat(){
        System.out.println("猫:魚を食べる");
    }

    public void shout(){
        System.out.println("猫:ニャー!ニャー!ニャー!");
    }

}

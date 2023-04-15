package day14;

public class InnerClassTest {
    public static void main(String[] args) {

        Human.Dog dog = new Human.Dog();
        dog.show();

        Human h = new Human();
        Human.Bird bird = h.new Bird();
        bird.sing();

        System.out.println();

        bird.display("ラー");

    }
}

class Human{

    String name = "Yang";
    int age;

    public void eat(){
        System.out.println("人：飯を食う");
    }

    static class Dog{
        String name;
        int age;

        public void show(){
            System.out.println("赤丸はワンちゃんです");
        }
    }

    class Bird{
        String name = "ピー";

        public Bird(){

        }

        public void sing(){
            System.out.println("僕は小さな鳥です");
            Human.this.eat();
            System.out.println(age);
        }

        public void display(String name){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Human.this.name);
        }
    }

    public void method(){
        class AA{

        }
    }

    {
        class BB{

        }
    }

    public Human(){
        class CC{

        }
    }

}

package day14;

public class PersonTest {
    public static void main(String[] args) {
        method(new Student());

        Worker worker = new Worker();
        method1(worker);
        method1(new Worker());

        System.out.println("********************");

        Person p = new Person(){

            @Override
            public void eat() {
                System.out.println("食べる");
            }

            @Override
            public void breath() {
                System.out.println("呼吸する");
            }

        };

        method1(p);

        System.out.println("********************");

        method1(new Person() {
            @Override
            public void eat() {
                System.out.println("美味しい料理を食べる");
            }

            @Override
            public void breath() {
                System.out.println("深呼吸をする");
            }
        });
    }

    public static void method(Student s){

    }

    public static void method1(Person p){
        p.breath();
        p.eat();
    }
}

class Worker extends Person{

    @Override
    public void breath() {

    }

    @Override
    public void eat() {

    }
}

package day12;

import java.util.Date;

public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();

        System.out.println("*********************");

        Person p2 = new Man();
        p2.eat();
        p2.walk();

        //p2.earnMoney();

        System.out.println(p2.id);

        Man m1 = (Man)p2;
        m1.earnMoney();
        m1.isSmoking = true;

//        Women w1 = (Women) p2;
//        w1.goShopping();
//        w1.isBeauty = true;

        if(p2 instanceof Women){
            Women w1 = (Women) p2;
            w1.goShopping();
            System.out.println("*****Woman*****");
        }

        if(p2 instanceof Man){
            Man m2 = (Man) p2;
            m1.earnMoney();
            System.out.println("*****Man*****");
        }

        if(p2 instanceof Person){
            System.out.println("*****Person*****");
        }

        if(p2 instanceof Object){
            System.out.println("*****Object*****");
        }

        Person p3 = new Women();
        Man m3 = (Man) p3;

        Person p4 = new Person();
        Man m4 = (Man) p4;

        Object obj = new Women();
        Person p = (Person) obj;

        //Man m5 = new Women();
        //String str = new Date();

        //Object obj1 = new Date();
        //String str1 = (String) obj1;

    }
}

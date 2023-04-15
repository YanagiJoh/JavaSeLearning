package day14;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);

    }
}

interface Flyable {

    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1;

    public abstract void fly();

    void stop();
}

interface Attackable {

    void attack();

}

class Plane implements Flyable {

    @Override
    public void fly() {
        System.out.println("エンジンで飛びます");
    }

    @Override
    public void stop() {
        System.out.println("パイロットが減速して停止する");
    }
}

abstract class Kite implements Flyable {
    @Override
    public void fly() {

    }
}

class Bullet extends Object implements Flyable,Attackable,CC{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

interface AA {
    void method1();
}

interface BB {
    void method2();
}

interface CC extends AA,BB{

}

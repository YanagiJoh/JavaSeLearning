package day14;

public class SubClassTest {
    public static void main(String[] args) {
        SubClass s = new SubClass();

        //s.method1;
        //SubClass.method1;
        CompareA.method1();
        s.method2();
        s.method3();
        //SubClass.method2();
    }
}

class SubClass extends SuperClass implements CompareA,CompareB{
    public void method2(){
        System.out.println("SubClass:大阪");
    }

    public void method3(){
        System.out.println("SubClass:横浜");
    }

    public void myMethod(){
        method3();
        super.method3();
        CompareA.super.method3();
        CompareB.super.method3();
    }
}

package day12.exer;

public class InterviewTest {

    public static void main(String[] args) {
        Base base = new Sub();
        base.add(1,2,3);//sub

        Sub s = (Sub) base;
        s.add(1,2,3);//sub1
    }
}

class Base{
    public void add(int a,int... arr){
        System.out.println("base");
    }
}
class Sub extends Base{
    public void add(int a,int[] arr){
        System.out.println("sub");
    }
    public void add(int a,int b,int c){
        System.out.println("sub1");
    }
}


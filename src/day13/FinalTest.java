package day13;

public class FinalTest {

    final int WIDTH = 10;
    final int LEFT;
    final int RIGHT;
    //final int DOWN;

    {
        LEFT = 1;
    }

    public FinalTest() {
        RIGHT = 2;
    }

    public FinalTest(int n) {
        RIGHT = n;
    }

//    public void setDown(int down){
//        this.DOWN = down;
//    }

    public void doWidth() {
        // width = 20;
    }

    public void show() {
        final int NUM = 10;
        //NUM += 20;
    }
    public void show(final int num) {
        //num = 20;
        System.out.println(num);
    }


    public static void main(String[] args) {

        int num = 5;
        num += 5;

        FinalTest test = new FinalTest();
        test.show(10);

    }
}

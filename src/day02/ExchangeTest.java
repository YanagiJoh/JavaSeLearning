package day02;

public class ExchangeTest {
    public static void main(String[] args) {
        //二つの変数の値を交換する
        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 = " + num1 + ",num2 = " + num2);

        //方法1：臨時変数
        //int temp = num1;
        //num1 = num2;
        //num2 = temp;

        //方法2
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num1 = " + num1 + ",num2 = " + num2);


    }

}

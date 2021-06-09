package day02;

public class AriTest {
    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 5;
        int result1 = num1 / num2;
        System.out.println(result1);//2

        int result2 = num1 / num2 * num2;
        System.out.println(result2);//10

        double result3 = num1 / num2;
        System.out.println(result3);//2.0

        double result4 = num1 / num2 + 0.0;//2.0
        double result5 = num1 / (num2 + 0.0);//2.4
        System.out.println(result5);

        double result6 = (double) num1 / num2;//2,4
        System.out.println(result6);

        double result7 = (double)(num1 /num2);//2.0
        System.out.println(result7);

        //結果の符号はｍ1と同じ
        int m1 = 12;
        int n1 = 5;
        System.out.println("m1 % n1 = " + m1 % n1);//2

        int m2 = -12;
        int n2 = 5;
        System.out.println("m2 % n2 = " + m2 % n2);//-2

        int m3 = 12;
        int n3 = -5;
        System.out.println("m3 % n3 = " + m3 % n3);//2

        int m4 = -12;
        int n4 = -5;
        System.out.println("m4 % n4 = " + m4 % n4);//-2

        int a1 = 10;
        int b1 = ++a1;
        System.out.println("a1 = " + a1 + ",b1 = " + b1);

        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2 = " + a2 + ",b2 = " + b2);

        int a3 = 10;
        a3++;
        int b3 = a3;
        System.out.println(a3);//11

        short s1 = 10;
        //s1 = s1 + 1;//NG
        //s1 = (short)(s1 + 1);
        s1++;//コンパイルOK
        System.out.println(s1);

        byte b4 = 127;
        b4++;
        System.out.println(b4);//-128


    }
}

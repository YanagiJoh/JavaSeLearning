package day02;

public class SetValueTest {
    public static void main(String[] args) {

        int i1 = 10;
        int j1 = 10;

        int i2,j2;
        i2 = j2 = 10;

        int i3 = 10,j3 =20;

        int num1 = 10;
        num1 += 2;//num1 = num1 + 2;
        System.out.println(num1);

        int num2 = 12;
        num2 %= 5;//num2 = num2 % 5;
        System.out.println(num2);//2

        short s1 = 10;
        //s1 = s1 +2;//NG
        s1 += 2;//データ型が変わらない
        System.out.println(s1);//12

        int m = 2;
        int n = 3;
        n *= m++;
        System.out.println("m = " + m);//3
        System.out.println("n = " + n);//6

        int n1 = 10;
        n1 += (n1++) + (++n1);//n = n + (n++) + (++n);
        System.out.println(n1);//32
    }
}

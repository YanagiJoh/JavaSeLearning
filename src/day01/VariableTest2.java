package day01;

/**
 * 基本データ型の演算規則
 * 1.値の範囲が広い方に自動転換される
 * 　　byte、char、short-->int-->long-->float-->double
 *    ※byte,char,shortが互いに計算する時にint型になる
 * 2.
 */
public class VariableTest2 {
    public static void main(String[] args) {

        byte b1 = 2;
        int i1 = 129;
        //byte b2 = b1 + i1;//NG
        int i2 = b1 + i1;
        long l1 = b1 + i1;
        System.out.println(i2);
        System.out.println(l1);

        float f1 = b1 + i1;
        System.out.println(f1);//131.0

        short s1 = 123;
        double d1 = s1;
        System.out.println(d1);//123.0

        char c1 = 'a';//97
        int i3 = 10;
        int i4 = c1 + i3;
        System.out.println(i4);

        int i5 = s1 + b1 + c1;
        System.out.println(i5);
    }
}

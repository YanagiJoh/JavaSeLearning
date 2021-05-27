package day01;

/**
 * 強制データ型変換:精度が下がる可能性がある
 */
public class VariableTest3 {
    public static void main(String[] args) {

        double d1 = 12.3;
        int i1 = (int) d1;//キャスト
        System.out.println(i1);

        long l1 = 123;
        short s1 = (short) l1;
        System.out.println(s1);

        int i2 = 128;
        byte b1 = (byte) i2;
        System.out.println(b1);//-128

        long l2 = 123456;//123456はデフォルトでint型なので、自動的にlong型に転換される
        System.out.println(l2);

        //long l3 = 1234567890123456789;//NG、値が大きすぎる
        long l3 = 1234567890123456789L;

        //float f1 = 12.3;//NG、12.3はデフォルトでdouble型になるので、キャストする必要がある
        float f1 = (float) 12.3;

        byte b2 = 12;
        //byte b3 = b2 + 1;//NG
        //float f1 = b2 + 12.3;//NG

    }
}

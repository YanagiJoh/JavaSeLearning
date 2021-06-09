package day02;

/**
 * 三項演算子
 */
public class TernaryOperatorTest {
    public static void main(String[] args) {

        int m = 12;
        int n = 5;
        int max = (m > n)? m : n;
        System.out.println(max);

        String maxStr = (m > n)? "mが大きい" : ((m == n)? "m = n" : "nが大きい");
        System.out.println(maxStr);

        //三つの値の最大値を取得する
        int n1 = 12;
        int n2 = 30;
        int n3 = -43;

        int max1 = (n1 > n2)? n1 : n2;
        int max2 = (max1 > n3)? max1 : n3;
        System.out.println(max2);

    }
}

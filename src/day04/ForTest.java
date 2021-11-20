package day04;

import java.awt.*;
import java.util.Scanner;

/**
 * 最大公約数と最小公倍数を求める
 */
public class ForTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("一つ目の正整数を入力してください：");
        int m = scan.nextInt();

        System.out.println("二つ目の正整数を入力してください：");
        int n = scan.nextInt();

        //mとnの小さい方の数値を格納する
        int min = (m <= n) ? m : n;
        for (int i = min; i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                System.out.println("最大公約数は:" + i);
                break;
            }
        }

        //mとnの大きい方の数値を格納する
        int max = (m >= n) ? m : n;
        for (int i = max; i <= m * n; i++) {
            if (i % n == 0 && i % m == 0) {
                System.out.println("最小公倍数は:" + i);
                break;
            }
        }

    }

}

package day04;

import java.awt.*;
/**
 * 100以内の素数の出力の最適化三
 */
public class PrimeNumberTest2 {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        int count = 0;

        label:
        for (int i = 2; i <= 10000; i++) {

            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue label;
                }
            }

                count++;

        }

        long end = System.currentTimeMillis();
        System.out.println("素数の個数は：" + count);
        System.out.println("実行の時間は：" + (end - start));//最適化三:4ms


    }
}

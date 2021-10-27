package day03;

import java.util.Scanner;

/**
 * if-else練習：数値を小さい順で整列する
 */
public class IfTest2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("一つ目の整数を入力してください：");
        int num1 = scan.nextInt();

        System.out.println("二つ目の整数を入力してください：");
        int num2 = scan.nextInt();

        System.out.println("三つ目の整数を入力してください：");
        int num3 = scan.nextInt();

        if (num1 >= num2) {
            if (num3 >= num1) {
                System.out.println(num2 + "," + num1 + "," + num3);
            } else if (num3 <= num2) {
                System.out.println(num3 + "," + num2 + "," + num1);
            } else {
                System.out.println(num2 + "," + num3 + "," + num1);
            }

        } else {
            if (num3 >= num2) {
                System.out.println(num1 + "," + num2 + "," + num3);
            } else if (num3 <= num1) {
                System.out.println(num3 + "," + num1 + "," + num2);
            } else {
                System.out.println(num1 + "," + num3 + "," + num2);
            }

        }


    }
}

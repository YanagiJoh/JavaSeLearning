package day03;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("名前を入力してください：");
        String name = scan.next();
        System.out.println(name);

        System.out.println("年齢を入力してください：");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("体重を入力してください：");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("私のことが好きですか？");
        boolean isLove = scan.nextBoolean();
        System.out.println(isLove);

        System.out.println("性別を入力してください：");
        String gender = scan.next();
        char genderChar = gender.charAt(0);
        System.out.println(genderChar);
    }
}

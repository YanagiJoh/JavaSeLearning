package day03;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("期末試験の点数を入力してください：");
        int score = scan.nextInt();

        if(score == 100){
            System.out.println("iphoneのプレゼントを致します。");
        }else if (score > 80 && score <= 90){
            System.out.println("高級チョコレートのプレゼントを致します。");
        }else if(score >= 60 && score <=80){
            System.out.println("割引券をプレゼント致します。");
        }else{
            System.out.println("残念ですが...");
        }

    }
}

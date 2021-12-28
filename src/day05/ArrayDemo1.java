package day05;

import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("学生の人数を入力してください: ");
        int number = scan.nextInt();

        int[] scores = new  int[number];
        int maxScore = 0;

        System.out.println(number + "名の学生の成績を入力してください:");
        for (int i = 0; i < scores.length ; i++) {

            scores[i] = scan.nextInt();

            if(maxScore < scores[i]){
                maxScore = scores[i];
            }

        }

//        int maxScore = 0;
//        for (int i = 0; i < scores.length ; i++) {
//
//            if(maxScore < scores[i]){
//                maxScore = scores[i];
//            }
//
//        }

        char level;
        for (int i = 0; i < scores.length ; i++) {

            if(maxScore - scores[i] <= 10){

                level = 'A';

            }else if(maxScore - scores[i] <= 20){

                level = 'B';

            }else if(maxScore - scores[i] <= 30){

                level = 'C';

            }else{

                level = 'D';

            }

            System.out.println("学生" + i + "の成績は" + scores[i] + "、ランクは" + level + "です" );

        }
    }
}

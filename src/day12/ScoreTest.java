package day12;

import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Vector v = new Vector();

        int maxScore = 0;

        for(;;){
            System.out.println("学生成績を入力してください(負数を入力する場合は終了)");
            int score = scan.nextInt();

            if(score < 0){
                break;
            }
            if(score > 100){
                System.out.println("入力したデータが適切な値ではないため、再度入力してください");
                continue;
            }

            Integer inScore = new Integer(score);
            v.addElement(inScore);

            if(maxScore < score){
                maxScore = score;
            }
        }

        char level;
        for (int i = 0; i < v.size() ; i++) {
            Object obj = v.elementAt(i);
            Integer inScore = (Integer) obj;
            int score = inScore.intValue();

            if(maxScore - score <= 10){
                level = 'A';
            }else if(maxScore - score <= 20){
                level = 'B';
            }else if(maxScore - score <= 30){
                level = 'C';
            }else{
                level = 'D';
            }

            System.out.println("student-" + i + " score is " + score + ",level is " + level);
        }


    }
}

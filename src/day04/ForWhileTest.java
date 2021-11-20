package day04;

import java.util.Scanner;

public class ForWhileTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int positivenumber = 0;
        int negativenumber = 0;

        while(true){//for(;;){

            System.out.println("整数を入力してください：");
            int num = scan.nextInt();

            if(num > 0){
                positivenumber++;
            }else if(num < 0){
                negativenumber++;
            }else {
                break;
            }

        }

        System.out.println("正数の個数は：" + positivenumber);
        System.out.println("負数の個数は：" + negativenumber);
    }
}

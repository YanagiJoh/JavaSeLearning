package day03;

import java.util.Scanner;

public class IfExer1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("身長を入力してください：(cm)");
        int height = scan.nextInt();

        System.out.println("財産を入力してください：(千万円)");
        double wealth = scan.nextDouble();

        System.out.println("イケメンですか？(true/false)");
        boolean isHandsome = scan.nextBoolean();

        if(height >= 180 && wealth >=1 && isHandsome){
            System.out.println("絶対に結婚します！");
        }else if(height >= 180 || wealth >=1 || isHandsome){
            System.out.println("まあぁー、結婚して構わない");
        }else{
            System.out.println("結婚しない！");
        }
    }
}

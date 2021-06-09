package day02;

public class LogicTest {
    public static void main(String[] args) {
        //&と&&の演算結果は同じ
        //左側がtrueの場合、両者は全部右側を評価する
        //左側がfalseの場合、&&は右側を評価しない
        boolean b1 = true;
        b1 = false;
        int num1 = 10;
        if(b1 & (num1++ > 0)){
            System.out.println("私は今東京にいます");
        }else{
            System.out.println("私は今横浜にいます");
        }

        System.out.println("num1 = " + num1);

        boolean b2 = true;
        b2 = false;
        int num2 = 10;
        if(b2 && (num2++ > 0)){
            System.out.println("私は今東京にいます");
        }else{
            System.out.println("私は今横浜にいます");
        }

        System.out.println("num2 = " + num2);

        //|と||の演算結果は同じ
        //左側がfalseの場合、両者は全部右側を評価する
        //左側がtrueの場合、&&は右側を評価しない
        boolean b3 = true;
        //b3 = false;
        int num3 = 10;
        if(b3 | (num3++ > 0)){
            System.out.println("私は今東京にいます");
        }else{
            System.out.println("私は今横浜にいます");
        }

        System.out.println("num3 = " + num3);

        boolean b4 = true;
        //b4 = false;
        int num4 = 10;
        if(b4 || (num4++ > 0)){
            System.out.println("私は今東京にいます");
        }else{
            System.out.println("私は今横浜にいます");
        }

        System.out.println("num4 = " + num4);
    }
}

package day04;

public class DoWhileTest {

    public static void main(String[] args) {

        //100以内の全ての偶数の和を計算する
        int num = 0;
        int sum = 0;
        int count = 0;

        do {
            if (num % 2 == 0) {
                System.out.println(num);
                sum += num;
                count++;
            }

            num++;

        } while (num <= 100);

        System.out.println("全ての偶数の和は：" + sum);
        System.out.println("偶数の個数は：" + count);

        //*****************************************
        int number1 = 10;
        while(number1 > 10){
            System.out.println("hello:while");
            number1--;
        }

        int number2 = 10;
        do{
            System.out.println("hello:do-while");
            number1--;
        }while (number2 > 10);


    }
}

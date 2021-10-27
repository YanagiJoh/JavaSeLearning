package day03;

public class ForTest {
    public static void main(String[] args) {

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Hello World!");
        }

        int num = 1;
        for (System.out.print('a'); num <= 3 ; System.out.print('c'),num++) {
            System.out.print('b');
        }
        //出力結果：abcbcbc

        //100以内全ての偶数の和と偶数の個数
        int sum = 0;//偶数の和
        int count = 0;//偶数の個数
        for (int i = 1; i <= 100; i++) {
            if(i % 2 ==0){
                System.out.println(i);
                sum += i;
                count++;
            }
        }

        System.out.println("全ての偶数の和は：" + sum);
        System.out.println("偶数の個数は：" + count);
    }
}

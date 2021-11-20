package day04;
/**
 * 100以内の素数の出力の最適化
 */
public class PrimeNumberTest1 {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        int count = 0;

        for (int i = 2; i <= 10000; i++) {

            boolean isFlag = true;

            //for (int j = 2; j < i; j++) {
            for (int j = 2; j < Math.sqrt(i); j++) {//最適化二:
                if (i % j == 0) {
                    isFlag = false;
                    break;//最適化一
                }
            }

            if (isFlag) {
                System.out.println(i);
                count++;
            }

        }

        long end = System.currentTimeMillis();
        System.out.println("素数の個数は：" + count);
        System.out.println("実行の時間は：" + (end - start));//最適化二:24ms、最適化一:38ms、最適化前:168ms


    }
}

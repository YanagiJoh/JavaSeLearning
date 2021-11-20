package day04;

public class BreakContinueTest {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            if (i % 4 == 0) {
                //break;//123
                continue;//123567910
            }
            System.out.print(i);

        }

        System.out.println("\n");
        //***********************************
        label:
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    //break;//内側のループを抜き出す
                    //continue;

                    //break label;//外側のループを抜き出す
                    continue label;
                }
                System.out.print(j);

            }

            System.out.println();

        }
    }
}

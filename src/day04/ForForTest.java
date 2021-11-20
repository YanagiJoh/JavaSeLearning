package day04;

public class ForForTest {

    public static void main(String[] args) {

        //******
        for (int i = 0; i < 6; i++) {
            System.out.print("*");
        }

        System.out.println("\n");
         /*
         ******
         ******
         ******
         ******
         */

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         *
         **
         ***
         ****
         *****
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         *****
         ****
         ***
         **
         *
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=6 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

package day04;

public class WhileTest {

    public static void main(String[] args) {

        int i = 0;
        while (i <= 100 ){

            if(i % 2 == 0) {
                System.out.println(i);
            }

            i++;
        }

        System.out.println(i);//101
    }
}

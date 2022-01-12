package day07;

public class ExerTest {
    public static void main(String[] args) {

        ExerTest ex1 = new ExerTest();
        ex1.method();
        System.out.println("面積: " + ex1.method1());
        System.out.println("面積: " + ex1.method2(4,5));

    }

    public void method() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public int method1() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
        return 10 * 8;
    }

    public int method2(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }
}

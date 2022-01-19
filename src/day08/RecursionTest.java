package day08;

public class RecursionTest {
    public static void main(String[] args) {

        RecursionTest test = new RecursionTest();

        System.out.println(test.getSum(100));
        System.out.println(test.getSum1(10));
    }

    public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }

    public int getSum1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getSum1(n - 1);
        }
    }

    public int f(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * f(n - 1) + f(n - 2);
        }
    }
}

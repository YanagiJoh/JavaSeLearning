package day02;

public class AriExer {
    public static void main(String[] args) {

        int num = 187;

        int a = num / 100;
        int b = num / 10 % 10;
        int c = num % 10;

        System.out.println("3桁目は" + a);
        System.out.println("2桁目は" + b);
        System.out.println("1桁目は" + c);

    }
}

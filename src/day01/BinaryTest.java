package day01;

/**
 * 二進数：0、1
 * 10進数：0-9
 * 8進数：0-7
 * 16進数：0-9及びA~F
 */
public class BinaryTest {
    public static void main(String[] args) {

        int num1 = 0b110;
        int num2 = 110;
        //int num3 = 0128;//NG
        int num3 = 0127;
        int num4 = 0x110A;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);


    }
}

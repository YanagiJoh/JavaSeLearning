package day15;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyTest {

    @Test
    public void test1() {

        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            int[] arr = new int[10];
            System.out.println(arr[10]);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

    }

    @Test
    public void testmethod() {
        int num = method();
        System.out.println(num);
    }

    public int method() {
        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return 2;
        } finally {
            System.out.println("finally");
            //return 3;
        }
    }

    @Test
    public void test2() {

        File file = new File("C:\\Users\\楊　盛\\Desktop\\hello.txt");
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(file);

            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis != null)
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

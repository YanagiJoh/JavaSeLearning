package day15;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest1 {

    @Test
    public void test1() {
        String str = "123";
        str = "abc";
        int num = 0;

        try {
            num = Integer.parseInt(str);
            System.out.println("hello-----1");
        } catch (NullPointerException e) {
            System.out.println("nullpointer例外が発生しました。");
        } catch (NumberFormatException e) {
            //System.out.println("データ型の変換に例外が発生しました。");
            //System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("例外が発生しました。");
        }

        System.out.println(num);
        System.out.println("hello-----2");
    }

    @Test
    public void test2() {

        try {
            File file = new File("helllo.txt");
            FileInputStream fis = new FileInputStream(file);

            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }

            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

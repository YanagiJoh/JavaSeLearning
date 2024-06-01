package day27;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;

public class Java9Test {

    @Test
    public void test1() {

        try {
            URL url = new URL("https://www.google.co.jp/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() {

        Comparator<Object> com = new Comparator<>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

        ArrayList<String> list = new ArrayList<>();

    }

    public static void main(String[] args) {

        //java8前
//        InputStreamReader reader = null;
//        try {
//            reader = new InputStreamReader(System.in);
//            char[] cbuf = new char[20];
//            int len;
//            if ((len = reader.read(cbuf)) != -1) {
//                String str = new String(cbuf, 0, len);
//                System.out.println(str);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

        //java8
//        try(InputStreamReader reader = new InputStreamReader(System.in)){
//            char[] cbuf = new char[20];
//            int len;
//            if ((len = reader.read(cbuf)) != -1) {
//                String str = new String(cbuf, 0, len);
//                System.out.println(str);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //java9
        InputStreamReader reader = new InputStreamReader(System.in);
        try (reader) {
            char[] cbuf = new char[20];
            int len;
            if ((len = reader.read(cbuf)) != -1) {
                String str = new String(cbuf, 0, len);
                System.out.println(str);
            }

            //reader = null;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

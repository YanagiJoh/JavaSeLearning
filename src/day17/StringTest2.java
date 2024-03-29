package day17;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringTest2 {

    @Test
    public void test1() {
        String str1 = "123";
        int num = Integer.parseInt(str1);
        String str2 = String.valueOf(num);
        String str3 = str2 + "";
        System.out.println(str1 == str3);
    }

    @Test
    public void test2() {
        String str1 = "abc123";
        char[] charArray = str1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        char[] arr = new char[]{'h', 'e', 'l', 'l', 'o'};
        String str2 = new String(arr);
        System.out.println(str2);
    }

    @Test
    public void test3() throws UnsupportedEncodingException {
        String str1 = "abc123日本";
        byte[] bytes = str1.getBytes();
        System.out.println(Arrays.toString(bytes));

        byte[] gbks = str1.getBytes("gbk");
        System.out.println(Arrays.toString(gbks));

        System.out.println("********************");
        String str2 = new String(bytes);
        System.out.println(str2);

        String str3 = new String(gbks);
        System.out.println(str3);

        String str4 = new String(gbks, "gbk");
        System.out.println(str4);
    }

    @Test
    public void test4() {
        String s1 = "javaEEhadoop";
        String s2 = "javaEE";
        String s3 = s2 + "hadoop";
        System.out.println(s1 == s3);

        final String s4 = "javaEE";
        String s5 = s4 + "hadoop";
        System.out.println(s1 == s5);
    }

}

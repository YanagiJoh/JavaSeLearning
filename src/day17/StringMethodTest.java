package day17;

import org.junit.Test;

import java.util.Locale;

public class StringMethodTest {

    @Test
    public void test1() {
        String s1 = "HelloWorld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(9));
        //System.out.println(s1.charAt(10));

        System.out.println(s1.isEmpty());

        String s2 = s1.toLowerCase();
        System.out.println(s1);
        System.out.println(s2);

        String s3 = "  he   llo   world    ";
        String s4 = s3.trim();
        System.out.println("-----" + s3 + "-----");
        System.out.println("-----" + s4 + "-----");

    }

    @Test
    public void test2() {
        String s1 = "HelloWorld";
        String s2 = "helloworld";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = "abc";
        String s4 = s3.concat("def");
        System.out.println(s4);

        String s5 = "abc";
        String s6 = new String("abd");
        System.out.println(s5.compareTo(s6));

        String s7 = "中華人民共和国";
        String s8 = s7.substring(2);
        System.out.println(s7);
        System.out.println(s8);
        String s9 = s7.substring(2, 4);
        System.out.println(s9);
    }

    @Test
    public void test3() {
        String s1 = "helloworld";
        boolean b1 = s1.endsWith("rld");
        System.out.println(b1);

        boolean b2 = s1.startsWith("He");
        System.out.println(b2);

        boolean b3 = s1.startsWith("ll", 2);
        System.out.println(b3);

        String s2 = "wor";
        System.out.println(s1.contains(s2));
        System.out.println(s1.indexOf("lol"));
        System.out.println(s1.indexOf("lo", 5));

        String s3 = "hellorworld";
        System.out.println(s3.lastIndexOf("or"));
        System.out.println(s3.lastIndexOf("or", 6));
    }

    @Test
    public void test4() {
        String s1 = "東京政府";
        String s2 = s1.replace('東', '北');

        System.out.println(s1);
        System.out.println(s2);

        String s3 = s2.replace("北京", "上海");
        System.out.println(s3);

        System.out.println("********************");
        String s4 = "12hello34world5java7891mysql456";
        String s5 = s4.replaceAll("\\d+", ",");
        System.out.println(s5);

        String s6 = "12345";
        boolean matches = s6.matches("\\d+");
        System.out.println(matches);
        String tel = "0571-4534289";
        boolean result = tel.matches("0571-\\d{7,8}");
        System.out.println(result);

        System.out.println("********************");
        String s7 = "hello|world|java";
        String[] strs1 = s7.split("\\|");
        for (int i = 0; i < strs1.length; i++) {
            System.out.println(strs1[i]);
        }
        System.out.println();
        String s8 = "hello.world.java";
        String[] strs2 = s8.split("\\.");
        for (int i = 0; i < strs2.length; i++) {
            System.out.println(strs2[i]);
        }
    }
}

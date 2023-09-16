package day17;

import org.junit.Test;

public class StringTest {

    @Test
    public void test1() {
        String s1 = "abc";
        String s2 = "abc";

        s1 = "hello";
        System.out.println(s1 == s2);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("********************");

        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);
        System.out.println(s2);

        System.out.println("********************");

        String s4 = "abc";
        String s5 = s4.replace('a', 'm');
        System.out.println(s4);
        System.out.println(s5);

    }

    @Test
    public void test2() {
        String s1 = "javaEE";
        String s2 = "javaEE";

        String s3 = new String("javaEE");
        String s4 = new String("javaEE");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);

        System.out.println("********************");

        Person p1 = new Person("Tom", 12);
        Person p2 = new Person("Tom", 12);

        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name == p2.name);

        p1.name = "jerry";
        System.out.println(p2.name);
    }

    @Test
    public void test3(){

        String s1 = "javaEE";
        String s2 = "hadoop";
        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;
        String s8 = s5.intern();

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s3 == s7);
        System.out.println(s5 == s6);
        System.out.println(s5 == s7);
        System.out.println(s6 == s7);
        System.out.println(s3 == s8);

    }
}

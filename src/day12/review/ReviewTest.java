package day12.review;

import org.junit.Test;

public class ReviewTest {

    @Test
    public void test1() {
        int[] arr = new int[]{1, 2, 3};
        print(arr);
        System.out.println(arr.getClass().getSuperclass());
    }

    public void print(Object obj) {
        System.out.println(obj);
    }

    @Test
    public void test2() {
        Person p = new Person("Tom", 20);
        Man m = new Man("Tom", 20);
        System.out.println(p.equals(m));
    }

    @Test
    public void test3(){
        String str = "abc";
        str = null;
        System.out.println(str);
        System.out.println(str.toString());//NullPointerException
    }
}

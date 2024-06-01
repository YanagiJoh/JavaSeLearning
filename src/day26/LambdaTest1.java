package day26;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaTest1 {

    @Test
    public void test1() {

        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        con.accept("噓と誓言の違いは？");

        System.out.println("********************");

        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };

        con1.accept("一つは聞き手は本当だと思い、もう一つは話すほうが本当だと信じてた");
    }

    @Test
    public void test2() {

        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };

        con1.accept("噓と誓言の違いは？");

        System.out.println("********************");

        Consumer<String> con2 = (s) -> {
            System.out.println(s);
        };

        con2.accept("一つは聞き手は本当だと思い、もう一つは話すほうが本当だと信じてた");
    }

    @Test
    public void test3() {

        ArrayList<String> list = new ArrayList<>();

        int[] array = {1, 2, 3};

    }

    @Test
    public void test4() {

        Consumer<String> con1 = (s) -> {
            System.out.println(s);
        };

        con1.accept("噓と誓言の違いは？");

        System.out.println("********************");

        Consumer<String> con2 = s -> {
            System.out.println(s);
        };

        con2.accept("一つは聞き手は本当だと思い、もう一つは話すほうが本当だと信じてた");
    }

    @Test
    public void test5() {

        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };

        System.out.println(com1.compare(12, 21));

        System.out.println("********************");

        Comparator<Integer> com2 = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };

        System.out.println(com2.compare(32, 21));
    }

    @Test
    public void test6() {

        Comparator<Integer> com1 = (o1, o2) -> {
            return o1.compareTo(o2);
        };

        System.out.println(com1.compare(6, 12));

        System.out.println("********************");

        Comparator<Integer> com2 = (o1, o2) -> o1.compareTo(o2);

        System.out.println(com2.compare(32, 21));
    }

    @Test
    public void test7() {

        Consumer<String> con1 = s -> {
            System.out.println(s);
        };

        con1.accept("噓と誓言の違いは？");

        System.out.println("********************");

        Consumer<String> con2 = s -> System.out.println(s);

        con2.accept("一つは聞き手は本当だと思い、もう一つは話すほうが本当だと信じてた");
    }
}

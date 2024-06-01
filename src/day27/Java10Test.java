package day27;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Java10Test {

    @Test
    public void test1() {

        var num = 10;
        var list = new ArrayList<Integer>();
        list.add(123);

        for (var i : list) {
            System.out.println(i);
            System.out.println(i.getClass());
        }

        for (var i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

    @Test
    public void test2() {

        Supplier<Double> sup = () -> Math.random();
        //var sup = () -> Math.random();
        Consumer<String> con = System.out::println;
        //var con = System.out::println;

        int[] arr = new int[]{1, 2, 3, 4};
        //var arr = {1,2,3,4};
    }

    @Test
    public void test3() {

        //var num = null;
//        try {
//
//        } catch (var e) {
//            e.printStackTrace();
//        }

    }

//    public var method1(){
//       return 0;
//    }

//    public void method2(var num) {
//
//    }


//    public Java10Test(var i) {
//
//    }

    //var num = 10;

    @Test
    public void test4() {

        try {
            var url = new URL("https://www.google.co.jp");
            var connection = url.openConnection();
            var reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test5() {

        var list1 = List.of("Java","python","C");
        var copy1 = List.copyOf(list1);
        System.out.println(list1 == copy1);

        var list2 = new ArrayList<String>();
        list2.add("aaa");
        var copy2 = List.copyOf(list2);
        System.out.println(list2 == copy2);

    }
}
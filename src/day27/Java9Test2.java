package day27;

import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

public class Java9Test2 {

    @Test
    public void test1() {

        List<Integer> list = Arrays.asList(12, 23, 34, 45, 56, 67, 78, 89, 90, 33, 44, 55);
        //list.stream().takeWhile(x -> x < 60).forEach(System.out::println);
        list.stream().dropWhile(x -> x < 60).forEach(System.out::println);

    }

    @Test
    public void test2() {

        Stream<Integer> stream1 = Stream.of(1, 2, 3, null);
        stream1.forEach(System.out::println);

//        Stream<Integer> stream2 = Stream.of(null);
//        stream1.forEach(System.out::println);

        Integer i = 10;
        i = null;
        Stream<Integer> stream3 = Stream.ofNullable(i);
        long count = stream3.count();
        System.out.println(count);

    }

    @Test
    public void test3() {

        Stream.iterate(0, x -> x + 1).limit(10).forEach(System.out::println);

        //java9
        Stream.iterate(0, x -> x < 100,x -> x + 1).forEach(System.out::println);

    }

    @Test
    public void test4() {

        List<String> list = new ArrayList<>();
        list.add("Joe");
        list.add("Bob");
        list.add("Bill");

        Optional<List<String>> optional = Optional.ofNullable(list);
        Stream<List<String>> stream = optional.stream();
        //System.out.println(stream.count());
        stream.flatMap(x -> x.stream()).forEach(System.out::println);

    }
}

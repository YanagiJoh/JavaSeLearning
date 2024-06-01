package day27;

import org.junit.Test;

import java.io.*;
import java.util.*;

public class Java9Test1 {

    @Test
    public void test1() {

        List<String> namesList = new ArrayList<>();
        namesList.add("Joe");
        namesList.add("Bob");
        namesList.add("Bill");

        namesList = Collections.unmodifiableList(namesList);
        namesList.add("Tom");

        System.out.println(namesList);
    }

    @Test
    public void test2() {

        //read only
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.add(4);

    }

    @Test
    public void test3() {

        //java9 read only
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        //list.add(6);

        System.out.println(list);

        Set<Integer> set1 = Set.of(12, 34, 56, 78, 90);
        //set1.add(100);

        System.out.println(set1);

        Map<String, Integer> map1 = Map.of("Tom", 23, "Jerry", 54);
        //map1.put("Jack",55);
        System.out.println(map1);

        Map<String, Integer> map2 = Map.ofEntries(Map.entry("Tom", 23), Map.entry("Jerry", 54));
        //map2.put("Jack",55);
        System.out.println(map2);

    }

    @Test
    public void test4() {

        ClassLoader cl = this.getClass().getClassLoader();
        try (InputStream is = cl.getResourceAsStream("day27/hello.txt");
             OutputStream os = new FileOutputStream("src\\hello5.txt")) {
            is.transferTo(os);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

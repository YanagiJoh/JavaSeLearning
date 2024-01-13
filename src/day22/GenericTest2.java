package day22;

import org.junit.Test;

import java.util.*;

public class GenericTest2 {

    @Test
    public void test1() {

        Object obj = null;
        String str = null;
        obj = str;

        Object[] arr1 = null;
        String[] arr2 = null;
        arr1 = arr2;

        List<Object> list1 = null;
        List<String> list2 = new ArrayList<String>();
//        list1 = list2;
//
//        Date date = new Date();
//        str = date;

        show(list1);
        show1(list2);
    }

    public void show1(List<String> list) {

    }

    public void show(List<Object> list) {

    }

    @Test
    public void test2() {

        AbstractList<String> list1 = null;
        List<String> list2 = null;
        ArrayList<String> list3 = null;
        list1 = list3;
        list2 = list3;

        List<String> list4 = new ArrayList<>();
    }

    @Test
    public void test3() {

        List<Object> list1 = null;
        List<String> list2 = null;
        List<?> list = null;

        list = list1;
        list = list2;

//        print(list1);
//        print(list2);

        List<String> list3 = new ArrayList<>();
        list3.add("AA");
        list3.add("BB");
        list3.add("CC");
        list = list3;
//        list.add("DD");
//        list.add("?");

        list.add(null);

        Object o = list.get(0);
        System.out.println(o);

    }

    public void print(List<?> list) {

        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

    }

    @Test
    public void test4() {

        List<? extends Person1> list1 = null;
        List<? super Person1> list2 = null;

        List<Student1> list3 = new ArrayList<>();
        List<Person1> list4 = new ArrayList<>();
        List<Object> list5 = new ArrayList<>();

        list1 = list3;
        list1 = list4;
        //list1 = list5;

        //list2 = list3;
        list2 = list4;
        list2 = list5;

        list1 = list3;
        Person1 p = list1.get(0);
        //Student1 s = list1.get(0);

        list2 = list4;
        //Person1 p1 = list2.get(0);
        Object obj = list2.get(0);

        //list1.add(new Student1());
        list2.add(new Person1());
        list2.add(new Student1());

    }
}

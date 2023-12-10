package day20;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {

    @Test
    public void test1(){

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom",12));
        list.add(456);

        System.out.println(list);

        list.add(1,"BB");
        System.out.println(list);

        List list1 = Arrays.asList(1,2,3);
        list.addAll(list1);
        System.out.println(list.size());
        System.out.println(list.get(0));
    }

    @Test
    public void test2(){

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom",12));
        list.add(456);

        int index = list.indexOf(4567);
        System.out.println(index);

        System.out.println(list.indexOf(456));

        Object obj = list.remove(0);
        System.out.println(obj);
        System.out.println(list);

        list.set(1,"CC");
        System.out.println(list);

        List subList = list.subList(2,4);
        System.out.println(subList);

    }

    @Test
    public void test3(){

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("********************");

        for (Object obj : list) {
            System.out.println(obj);
        }

        System.out.println("********************");

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

    }
}

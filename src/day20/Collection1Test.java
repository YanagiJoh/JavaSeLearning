package day20;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Collection1Test {

    @Test
    public void test1(){

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(343);
        coll.add(343);

        coll.forEach(System.out::println);

    }

    @Test
    public void test2(){

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(5);
        list.add(5);

        List list2 = duplicateList(list);
        for (Object integer : list2) {
            System.out.println(integer);
        }

    }

    public static List duplicateList(List list){
        HashSet set = new HashSet();
        set.addAll(list);
        return new ArrayList(set);
    }

    @Test
    public void test3(){
        HashSet set = new HashSet();
        Person1 p1 = new Person1("AA",20);
        Person1 p2 = new Person1("BB",30);

        set.add(p1);
        set.add(p2);
        System.out.println(set);
        p1.name = "CC";
        set.remove(p1);
        System.out.println(set);
        set.add(new Person1("CC",20));
        System.out.println(set);
        set.add(new Person1("AA",20));
        System.out.println(set);

    }
}

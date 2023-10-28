package day19;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class CollectionTest {

    @Test
    public void test1(){

        Collection coll = new ArrayList();

        coll.add("AA");
        coll.add("BB");
        coll.add(123);
        coll.add(new Date());

        System.out.println(coll.size());

        Collection coll1 = new ArrayList();

        coll.add(456);
        coll.add("Cc");
        coll.addAll(coll1);

        System.out.println(coll.size());
        System.out.println(coll);

        System.out.println(coll.isEmpty());

        coll.clear();
        System.out.println(coll.isEmpty());

    }
}

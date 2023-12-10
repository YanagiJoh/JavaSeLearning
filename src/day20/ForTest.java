package day20;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class ForTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        for(Object obj : coll){
            System.out.println(obj);
        }
    }

    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4,5,6};

        for(int i : arr){
            System.out.println(i);
        }
    }

    @Test
    public void test3(){
        String[] arr = new String[]{"MM","MM","MM"};

//        for (int i = 0; i < arr.length ; i++) {
//            arr[i] = "GG";
//        }

        for (String s : arr) {
            s = "GG";
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}

package day22;

import org.junit.Test;

import java.util.*;

public class GenericTest {

    @Test
    public void test1() {

        ArrayList list = new ArrayList();
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(88);

        //list.add("Tom");

        for (Object score : list) {
            int stuScore = (Integer) score;
            System.out.println(stuScore);
        }
    }

    @Test
    public void test2() {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(88);

        //list.add("Tom");

//        for (Integer score : list) {
//            int stuScore = score;
//            System.out.println(stuScore);
//        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int stuScore = iterator.next();
            System.out.println(stuScore);
        }
    }

    @Test
    public void test3(){
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("Tom",87);
        map.put("Jerry",87);
        map.put("Jack",67);

        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> e = iterator.next();
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key + "----" + value);
        }
    }
}

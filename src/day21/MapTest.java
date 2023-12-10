package day21;

import org.junit.Test;

import java.util.*;

public class MapTest {

    @Test
    public void test1() {

        Map map = new HashMap();
        //map = new Hashtable();
        map.put(null, null);
    }

    @Test
    public void test2() {

        Map map = new HashMap();
        map = new LinkedHashMap();
        map.put(123, "AA");
        map.put(345, "BB");
        map.put(12, "CC");
        System.out.println(map);

    }

    @Test
    public void test3() {

        Map map = new HashMap();
        map.put("AA",123);
        map.put(45, 123);
        map.put("BB", 56);
        map.put("AA",87);
        System.out.println(map);

        Map map1 = new HashMap();
        map1.put("CC",123);
        map1.put("DD",123);

        map.putAll(map1);
        System.out.println(map);

        Object value = map.remove("CC");
        System.out.println(value);
        System.out.println(map);

        map.clear();
        System.out.println(map.size());
        System.out.println(map);

    }

    @Test
    public void test4() {

        Map map = new HashMap();
        map.put("AA",123);
        map.put(45, 123);
        map.put("BB", 56);

        System.out.println(map.get(45));

        boolean isExist = map.containsKey("BB");
        System.out.println(isExist);

        isExist = map.containsValue(123);
        System.out.println(isExist);

        map.clear();

        System.out.println(map.isEmpty());
    }

    @Test
    public void test5() {

        Map map = new HashMap();
        map.put("AA",123);
        map.put(45, 123);
        map.put("BB", 56);

        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Collection values = map.values();
        for(Object obj : values){
            System.out.println(obj);
        }

        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()){
            Object obj = iterator1.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }

        Set ketSet = map.keySet();
        Iterator iterator2 = ketSet.iterator();
        while(iterator2.hasNext()){
            Object key = iterator2.next();
            Object value = map.get(key);
            System.out.println(key + "=====" + value);
        }
    }
}

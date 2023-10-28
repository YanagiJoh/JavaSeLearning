package day18;

import com.sun.source.tree.NewArrayTree;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTest {

    @Test
    public void test1() {

        String[] arr = new String[]{"AA", "CC", "KK", "MM", "GG", "JJ", "DD"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void test2() {

        Good[] arr = new Good[6];
        arr[0] = new Good("lenovo", 34);
        arr[1] = new Good("Dell", 43);
        arr[2] = new Good("xiaomi", 12);
        arr[3] = new Good("huawei", 65);
        arr[4] = new Good("huawei", 43);
        arr[5] = new Good("microsoft", 43);

        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Good && o2 instanceof Good) {
                    Good g1 = (Good) o1;
                    Good g2 = (Good) o1;
                    if (g1.getName().equals(g2.getName())) {
                        return -Double.compare(g1.getPrice(), g2.getPrice());
                    } else {
                        return g1.getName().compareTo(g2.getName());
                    }
                }
                throw new RuntimeException("データタイプが一致してない");
            }
        });

        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test3() {
        String[] arr = new String[]{"AA", "CC", "KK", "MM", "GG", "JJ", "DD"};
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("データタイプが一致してない");
            }
        });
    }
}

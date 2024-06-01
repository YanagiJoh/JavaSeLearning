package day26;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaTest2 {

    @Test
    public void test1() {
        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("コンビニで飲み物を買いました。値段は: " + aDouble);
            }
        });

        System.out.println("********************");

        happyTime(400, money -> System.out.println("コンビニで飲み物を買いました。値段は: " + money));
    }

    public void happyTime(double money, Consumer<Double> con) {
        con.accept(money);
    }

    @Test
    public void test2() {

        List<String> list = Arrays.asList("東京","北京","南京","上海","広州","深圳");
        List<String> filterStrs = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });

        System.out.println(filterStrs);
        System.out.println("********************");

        List<String> filterStrs1 = filterString(list,s -> s.contains("京"));

        System.out.println(filterStrs1);

    }

    public List<String> filterString(List<String> list, Predicate<String> pre) {

        ArrayList<String> filterList = new ArrayList<>();

        for (String s : list) {
            if (pre.test(s)) {
                filterList.add(s);
            }
        }

        return filterList;
    }
}

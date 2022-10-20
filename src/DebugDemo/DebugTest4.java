package DebugDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DebugTest4 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,3,4,4,4,5,6,78));

        List<Integer> collect = list.stream()
                                    .filter(s -> s % 2 ==0 )
                                    .distinct()
                                    .collect(Collectors.toList());

        System.out.println(collect);
    }
}

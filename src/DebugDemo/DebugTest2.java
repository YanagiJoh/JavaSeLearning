package DebugDemo;

import java.util.ArrayList;
import java.util.List;

public class DebugTest2 {
    private static final List<String> LIST = new ArrayList<>();

    public static void main(String[] args) {

        LIST.add("1");
        LIST.add("22");
        LIST.add("333");
        LIST.set(1,null);

        for (String s : LIST) {
            System.out.println(s.length());
        }
    }
}

package day14;

import java.util.concurrent.ForkJoinPool;

public class TemplateTest {
    public static void main(String[] args) {
        Template t = new SubTemplate();
        t.spendTime();
    }
}

abstract class Template {

    public void spendTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("実行掛かる時間は: " + (end - start));
    }

    public abstract void code();

}

class SubTemplate extends Template {

    @Override
    public void code() {

        for (int i = 2; i <= 1000; i++) {
            boolean isFlag = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isFlag = false;
                }
            }
            if (isFlag) {
                System.out.println(i);
            }
        }
    }
}

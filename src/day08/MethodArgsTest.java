package day08;

public class MethodArgsTest {

    public static void main(String[] args) {

        MethodArgsTest test = new MethodArgsTest();

        test.show(12);
        test.show("hello");
        test.show("hello", "world");
        test.show();
        test.show(new String[]{"AA", "BB", "CC"});
    }


    public void show(int i) {

    }


    public void show(String s) {
        System.out.println("show(String)");
    }

    public void show(String... strs) {//可変引数
        System.out.println("show(String...strs)");

        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i] + "\t");
        }
    }

    //NG
//    public void show(String[] strs) {
//        System.out.println("show(String...strs)");
//    }

    public void show(int i, String...strs) {

    }
    //NG
//    public void show(String...strs, int i) {
//
//    }

}

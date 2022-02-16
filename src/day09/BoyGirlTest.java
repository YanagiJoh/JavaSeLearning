package day09;

public class BoyGirlTest {
    public static void main(String[] args) {

        Boy boy = new Boy("碇シンジ", 21);
        boy.shout();

        Girl girl = new Girl("綾波レイ", 18);

        Girl girl1 = new Girl("アスカ", 19);
        int compare = girl.compare(girl1);

        if (compare > 0) {
            System.out.println(girl.getName() + "の年齢が高い。");
        } else if (compare < 0) {
            System.out.println(girl1.getName() + "の年齢が高い。");
        } else {
            System.out.println("同い年です。");
        }
    }
}

package day01;

/**
 * 1.変数の定義：データ型　変数名 ＝ 値；
 * 2.変数は必ず定義と初期化をしてから使う
 * 3.変数は定義される有効スコープ"{}"内のみ有効
 * 4.同じスコープ内で定義する変須名は重複できない
 */
public class VariableTest {
    public static void main(String[] args) {
        int myAge = 29;
        System.out.println(myAge);

        //System.out.println(myNumber);//NG
        int myNumber;
        //System.out.println(myNumber);//NG
        myNumber = 10;
        System.out.println(myNumber);

        //System.out.println(myClass);//NG

        //int myAge = 30;//NG
    }

    public void method() {
        int myClass = 1;
    }
}

package day01;

/**
 * 1.識別子 ⇒ クラス名、変数名、インターフェース名、パッケージ名...
 *
 * 2.識別子の命名規則　⇒　以下の規則を守れないと、コンパイルできない!
 * >英数字と"_"と"$"を使う
 * >数字が頭文字に使うのはNG
 * >キーワードと予約語は使えない
 * >大文字と小文字は区別され、レングスには制限なし
 * >識別子の中には空白スペースを入れるのはダメ
 *
 * 3.Javaでの識別子の命名方法 ⇒　以下の規則を遵守しなくてもコンパイルができる
 * >パッケージ名 ⇒ xxxyyyzzz
 * >クラス名、インターフェース名　⇒　XxxYyyZzz
 * >変数名、メソッド名 ⇒ xxxYyyZzz
 * >定数名 ⇒ XXX_YYY_ZZZ
 */
public class IdentifierTest {
    public static void main(String[] args) {

        //int myNumber = 1001;
        //System.out.println(myNumber);
        int mynumber = 1002;
        System.out.println(mynumber);
    }

}

class Hello1_$ {

}
/*
class 1Hello_${ //NG

}
*/

/*
class static{ //NG

}
*/

class static1{

}

class Static{

}


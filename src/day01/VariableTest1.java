package day01;

/**
 *1.Javaの変数のデータ型：基本型と参照型
 *2.基本型：byte < short < int < long < float < double
 * 　　　　 char
 *        boolean
 *3.参照型：クラス、インターフェース、配列
 */
public class VariableTest1 {
    public static void main(String[] args) {
    //byte(1byte = 8bit)/short(2byte)/int(4byte)/long(8byte)45
    // byte範囲：-128~127
    byte b1 = 127;
    byte b2 = -128;
    //b2 = 128;//NG
    System.out.println(b1);
    System.out.println(b2);

    //Long型変数を定義するときに変数値の最後に"L"か"l"を付ける
    //通常整数型を定義する時にint型を使う
    short s1 = 123;
    int i1 = 1234;
    long l1 = 123456789L;
    System.out.println(l1);

    //float(4byte)/double(8byte)
    //floatの数値の範囲はlongより広い
    double d1 = 123.4;
    System.out.println(d1+1);

    //float型変数を定義するときに変数値の最後に"F"か"f"を付ける
    float f1 = 123.4f;
    System.out.println(f1);

    //3.文字型: char (1文字 = 2byte)
    char c1 ='a';
    //c1 = 'AB';//NG、一文字しか定義できない
    System.out.println(c1);

    char c2 = '\n';//改行
    System.out.print("Hello" + c2);
    System.out.println("World!");
    c2 = '\t';//空白スペース
    System.out.print("Hello" + c2);
    System.out.println("World!");

    char c3 = '\u0123';//unicode値を使って文字を表示できる
    System.out.println(c3);

    //boolean:trueとfalseしかない
    boolean bb1 = true;
    System.out.println(bb1);

    boolean isMarried = true;
    if(isMarried){
        System.out.println("残念ですが、\"単身\"パーティーを参加できないです");
    }else{
        System.out.println("もっとモテるように頑張ろう");
    }


    }
}

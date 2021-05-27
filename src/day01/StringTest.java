package day01;

/**
 * String型 ⇒ 参照型
 * Stringは基本型と"+"で連結でき、結果はString型になる
 */
public class StringTest {
    public static void main(String[] args) {

        String s1 = "Hello World!";

        System.out.println(s1);

        String s2 = "a";
        String s3 = "";

        //char c1 = '';//NG

        int number = 1001;
        String numberStr = "学籍番号：";
        String info = numberStr + number;
        boolean b1 = true;
        String info1 = info + b1;
        System.out.println(info1);

        char c = 'a';//97
        int num = 10;
        String str = "Hello";
        System.out.println(c + num + str);//107Hello
        System.out.println(c + str + num);//aHello10
        System.out.println(c + (num + str));//a10Hello
        System.out.println((c + num) + str);//107Hello
        System.out.println(str + num + c);//Hello10a

        System.out.println("* *");
        System.out.println('*' + '\t' + '*');
        System.out.println('*' + "\t" + '*');
        System.out.println('*' + '\t' + "*");
        System.out.println('*' + ('\t' + "*"));





    }
}

package day07;

public class UserTest {
    public static void main(String[] args) {

        User u1 = new User();
        System.out.println(u1.name);
        System.out.println(u1.age);
        System.out.println(u1.isMale);

        u1.talk("日本語");
        u1.eat();

    }
}

class User {

    //メンバー変数(非static)、ヒープ領域にロードされる
    String name;
    int age;
    boolean isMale;

    public void talk(String language) {
        System.out.println("私たちは" + language + "を使って会話する。");
    }

    public void eat() {
        String food = "寿司";//ロカール変数、修飾子を付けることができない、デフォルトの初期値もない、使う前に必ず明確に初期値を設定する。そしてスタック領域にロードされる
        System.out.println("日本人は" + food + "をよく食べる。");
    }
}

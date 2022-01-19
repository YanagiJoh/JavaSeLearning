package day08;

public class InstanceTest {
    public static void main(String[] args) {

        Phone p = new Phone();
        p.sendEmail();
        p.playGame();

        //匿名インスタンス
        new Phone().sendEmail();
        new Phone().playGame();

        new Phone().price = 100000;
        new Phone().showPrice();//0.0

        PhoneFactory pf = new PhoneFactory();
        pf.show(new Phone());

    }
}

class Phone {

    double price;

    public void sendEmail() {
        System.out.println("メールを送る");
    }

    public void playGame() {
        System.out.println("ゲームをする");
    }

    public void showPrice() {
        System.out.println("携帯の値段は" + price + "円です。");
    }
}

class PhoneFactory {

    public void show(Phone p) {
        p.sendEmail();
        p.playGame();
    }

}
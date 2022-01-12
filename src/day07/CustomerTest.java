package day07;

public class CustomerTest {
    public static void main(String[] args) {

        Customer cust1 = new Customer();

        cust1.eat();
        cust1.sleep(8);


    }
}

class Customer {

    String name;
    int age;
    boolean isMale;

    public void eat() {
        System.out.println("お客さんが食事をしている。");
        return;//returnの後ろは変数や値などを付けることができない
    }

    public void sleep(int hour) {
        System.out.println(hour + "時間を寝ました。");

        eat();
        //sleep(10);//再帰的なコール
    }

    public String getName() {
        if (age < 18) {
            return name;
        } else {
            return "Tom";
        }
    }

    public String getNation(String nation) {
        String info = "私の国籍は:" + nation + "です。";
        return info;
    }

    public void  info(){
        //メソッドの中にはメソッドを定義することができない
//        public void swim(){
//
//        }
    }

}
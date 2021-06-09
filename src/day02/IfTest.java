package day02;

public class IfTest {
    public static void main(String[] args) {

        int heartBeats = 79;
        if(heartBeats < 60 || heartBeats > 100){
            System.out.println("もう一度検査を受けるべき");
        }

        System.out.println("検査終了");

        int age = 23;
        if(age < 20){
            System.out.println("酒を飲むことができない");
        }else{
            System.out.println("酒を飲める");
        }
    }
}

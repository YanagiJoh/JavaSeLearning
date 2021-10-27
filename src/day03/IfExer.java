package day03;

public class IfExer {
    public static void main(String[] args) {

        int x = 4;
        int y = 1;

        if(x > 2)
            if(y > 1)
                System.out.println(x + y);
        else//一番近いif条件文と関連する
                System.out.println("x is:" + x);

        //犬の年齢を人の年齢に換算する
        int dogAge = 6;
        if(dogAge >= 0 && dogAge <=2){
            System.out.println("人類の年齢に換算すると：" + dogAge * 10.5);
        }else if(dogAge > 2){
            System.out.println("人類の年齢に換算すると：" + (2 * 10.5 + (dogAge - 2) * 4));
        }else{
            System.out.println("ワンちゃんはまだ生まれてません。");
        }

        //ランダムに10~99の数値を取得する
        int value = (int) (Math.random() * 90 + 10);//［0.0，1.0)--> ［0.0，90.0) --> ［10.0，100.0) --> ［10，99］
        System.out.println(value);
        //［a，b］ ⇒　(int) (Math.random() * (b - a + 1) + a);

    }
}

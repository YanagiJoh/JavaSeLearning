package day14.exer;

public class ComparableCircleTest {
    public static void main(String[] args) {

        CompareCircle c1 = new CompareCircle(3.4);
        CompareCircle c2 = new CompareCircle(3.6);

        int compareValue = c1.compareto(c2);

        if(compareValue > 0){
            System.out.println("c1が大きい");
        }else if(compareValue < 0){
            System.out.println("c2が大きい");
        }else{
            System.out.println("c1とc2は同じ値です");
        }

        int compareValue1 = c1.compareto(new String("AA"));
        System.out.println(compareValue1);
    }
}

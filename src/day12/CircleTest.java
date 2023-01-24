package day12;

public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle(2.3);
        Circle c2 = new Circle(3.3,"white",2.0);

        System.out.println("色は同じなのか？: " + c1.getColor().equals(c2.getColor()));
        System.out.println("半径は同じなのか？: " + c1.equals(c2));

        System.out.println(c1);
        System.out.println(c2.toString());
    }
}

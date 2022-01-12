package day07;

/**
 * 円の面積を計算する
 */
public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.radius = 2.1;
        System.out.println(c1.findArea());

    }
}

class Circle {

    double radius;

    public double findArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
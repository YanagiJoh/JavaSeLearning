package day13;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(3.4);

        System.out.println("c1のid: " + c1.getId());
        System.out.println("c2のid: " + c2.getId());
        System.out.println("c3のid: " + c3.getId());
        System.out.println("生成した円の個数は： " + Circle.getTotal());
    }
}

class Circle{
    private double radius;
    private int id;

    public double getRadius() {
        return radius;
    }

    public int getId() {
        return id;
    }

    public Circle(){
        id = init++;
        total++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    private static int total;

    public static int getTotal() {
        return total;
    }

    private static int init = 1001;

    public double findArea(){
        return 3.14 * radius * radius;
    }
}

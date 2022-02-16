package day09;

public class TriAngleTest {
    public static void main(String[] args) {

        TriAngle t1 = new TriAngle();
        t1.setBase(2);
        t1.setHeight(3.4);
        System.out.println("base: " + t1.getBase() + ",height: " + t1.getHeight());

        TriAngle t2 = new TriAngle(5.1,5.2);
        System.out.println("base: " + t2.getBase() + ",height: " + t2.getHeight());


    }
}

class TriAngle {

    private double base;
    private double height;

    public TriAngle() {

    }

    public TriAngle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

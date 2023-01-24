package day12.exer;

public class GeometricTest {

    public static void main(String[] args) {

        GeometricTest test = new GeometricTest();

        Circle c1 = new Circle("white",1.0,2.3);
        test.displayGeometricObject(c1);

        Circle c2 = new Circle("white",1.0,3.3);
        test.displayGeometricObject(c2);

        boolean isEqual = test.equalsArea(c1,c2);
        System.out.println("c1とc2の面積は同じですか: " + isEqual);

        MyRectangle rect = new MyRectangle("white",2.0,3.4,2.5);
        test.displayGeometricObject(rect);

    }

    public void displayGeometricObject(GeometricObject o){
        System.out.println("面積: " + o.findArea());
    }

    public boolean equalsArea(GeometricObject o1,GeometricObject o2){
        return o1.findArea() == o2.findArea();
    }
}

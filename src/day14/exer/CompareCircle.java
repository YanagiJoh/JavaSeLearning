package day14.exer;

public class CompareCircle extends Circle implements CompareObject {

    public CompareCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareto(Object o) {
        if (this == o) {
            return 0;
        }

        if (o instanceof CompareCircle) {
            CompareCircle c = (CompareCircle) o;
            //return (int) (this.getRadius() - c.getRadius());

//            if (this.getRadius() > c.getRadius()) {
//                return 1;
//            } else if (this.getRadius() < c.getRadius()) {
//                return -1;
//            } else {
//                return 0;
//            }

            return this.getRadius().compareTo(c.getRadius());

        } else {
            throw new RuntimeException("データ型が一致してない");
        }
    }
}

package day18;

public class Good implements Comparable {

    private String name;
    private double price;

    public Good() {

    }

    public Good(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Good) {
            Good good = (Good) o;
            if (this.price > good.price) {
                return 1;
            } else if (this.price < good.price) {
                return -1;
            } else {
                //return 0;
                return this.name.compareTo(good.name);
            }
            //return Double.compare(this.price,good.price);
        }
        throw new RuntimeException("データタイプが一致してない");
    }
}

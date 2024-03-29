package day12;

public class GeomericObject {
    protected String color;
    protected double weight;

    public GeomericObject() {
        this.color = "white";
        this.weight = 1.0;
    }

    public GeomericObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

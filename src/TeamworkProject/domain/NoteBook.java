package TeamworkProject.domain;

public class NoteBook implements Equipment {

    private String name;
    private double price;

    public NoteBook() {
        super();
    }

    public NoteBook(String name, double price) {
        super();
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
    public String getDescription() {
        return name + "(" + price + ")";
    }
}

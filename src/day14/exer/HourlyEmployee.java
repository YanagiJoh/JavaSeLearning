package day14.exer;

public class HourlyEmployee extends Employee {
    private int wage;
    private int hour;

    public HourlyEmployee(String name, int number, Mydate birthday) {
        super(name, number, birthday);
    }

    public HourlyEmployee(String name, int number, Mydate birthday,int wage,int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                super.toString() +
                '}';
    }
}

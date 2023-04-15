package day14.exer;

public class SalariedEmpolyee extends Employee{

    private int monthlySalary;

    public SalariedEmpolyee(String name, int number, Mydate birthday) {
        super(name, number, birthday);
    }

    public SalariedEmpolyee(String name, int number, Mydate birthday,int monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmpolyee{" +
                super.toString() +
                '}';
    }
}

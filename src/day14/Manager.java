package day14;

public class Manager extends Employee{

    private double bonus;

    public Manager(double bonus){
        super();
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work(){
        System.out.println("従業員を管理して作業の効率を上げる。");
    }
}

package day14;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee manager = new Manager("Yang",0001,200000.0,400000.0);
        manager.work();

        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();

    }
}

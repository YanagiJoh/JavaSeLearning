package day26;

import day20.Employee;
import day20.MyDate;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

    public static List<Employee> getEmployees() {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee("楊", 32, new MyDate(1992, 1, 1)));
        list.add(new Employee("王", 40, new MyDate(1984, 2, 22)));
        list.add(new Employee("劉", 25, new MyDate(1999, 3, 3)));
        list.add(new Employee("李雲龍", 18, new MyDate(2006, 4, 4)));
        list.add(new Employee("沈", 27, new MyDate(1997, 5, 5)));
        list.add(new Employee("鄭", 55, new MyDate(1969, 6, 6)));
        list.add(new Employee("趙", 45, new MyDate(1979, 7, 7)));

        return list;
    }
}

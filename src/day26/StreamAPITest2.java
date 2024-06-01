package day26;

import day20.Employee;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPITest2 {

    @Test
    public void test1() {

        List<Employee> employees = EmployeeData.getEmployees();
        boolean allMatch = employees.stream().allMatch(e -> e.getAge() > 18);
        System.out.println(allMatch);

        boolean anyMatch = employees.stream().anyMatch(e -> e.getBirthday().getYear() > 1990);
        System.out.println(anyMatch);

        boolean noneMatch = employees.stream().noneMatch(e -> e.getName().startsWith("楊"));
        System.out.println(noneMatch);

        Optional<Employee> employee = employees.stream().findFirst();
        System.out.println(employee);

        Optional<Employee> employee1 = employees.parallelStream().findAny();
        System.out.println(employee1);

    }

    @Test
    public void test2() {

        List<Employee> employees = EmployeeData.getEmployees();
        long count = employees.stream().filter(e -> e.getAge() > 25).count();
        System.out.println(count);

        Stream<Integer> yearStream = employees.stream().map(e -> e.getBirthday().getYear());
        Optional<Integer> maxYear = yearStream.max(Integer::compare);
        System.out.println(maxYear);

        Optional<Employee> minYear = employees.stream().min((e1, e2) -> Integer.compare(e1.getBirthday().getYear(), e2.getBirthday().getYear()));
        System.out.println(minYear);

        System.out.println();
        employees.stream().forEach(System.out::println);

        System.out.println();
        employees.forEach(System.out::println);

    }

    @Test
    public void test3() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        List<Employee> employees = EmployeeData.getEmployees();
        Stream<Integer> ageStream = employees.stream().map(Employee::getAge);
        Optional<Integer> sumMoney = ageStream.reduce((d1, d2) -> d1 + d2);
        System.out.println(sumMoney);

    }

    @Test
    public void test4() {

        List<Employee> employees = EmployeeData.getEmployees();
        List<Employee> employeeList = employees.stream().filter(e -> e.getAge() > 25).collect(Collectors.toList());
        employeeList.forEach(System.out::println);

        System.out.println();
        Set<Employee> employeeSet = employees.stream().filter(e -> e.getAge() > 25).collect(Collectors.toSet());
        employeeSet.forEach(System.out::println);

    }
}

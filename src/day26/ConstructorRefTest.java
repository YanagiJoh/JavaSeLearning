package day26;

import day20.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorRefTest {

    @Test
    public void test1() {

        Supplier<Employee> sup = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return new Employee();
            }
        };

        System.out.println(sup.get());

        System.out.println("********************");
        Supplier<Employee> sup1 = () -> new Employee();
        System.out.println(sup1.get());

        System.out.println("********************");
        Supplier<Employee> sup2 = Employee::new;
        System.out.println(sup2.get());

    }

    @Test
    public void test2() {

        Function<Integer, Employee> func1 = age -> new Employee(age);
        Employee employee = func1.apply(23);
        System.out.println(employee);

        System.out.println("********************");
        Function<Integer, Employee> func2 = Employee::new;
        Employee employee1 = func1.apply(32);
        System.out.println(employee1);
    }

    @Test
    public void test3() {

        BiFunction<String, Integer, Employee> func1 = (name, age) -> new Employee(name, age);
        Employee employee = func1.apply("Tom", 23);
        System.out.println(employee);

        System.out.println("********************");
        BiFunction<String, Integer, Employee> func2 = Employee::new;
        Employee employee1 = func1.apply("Jerry", 32);
        System.out.println(employee1);
    }

    @Test
    public void test4() {

        Function<Integer, String[]> func1 = length -> new String[length];
        String[] arr1 = func1.apply(5);
        System.out.println(Arrays.toString(arr1));

        System.out.println("********************");
        Function<Integer, String[]> func2 = String[]::new;
        String[] arr2 = func1.apply(10);
        System.out.println(Arrays.toString(arr2));

    }
}

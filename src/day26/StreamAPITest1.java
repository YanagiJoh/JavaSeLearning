package day26;

import day20.Employee;
import day20.MyDate;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPITest1 {

    @Test
    public void test1() {

        List<Employee> list = EmployeeData.getEmployees();
        Stream<Employee> stream = list.stream();
        stream.filter(e -> e.getAge() > 30).forEach(System.out::println);

        System.out.println();
        list.stream().limit(3).forEach(System.out::println);

        System.out.println();
        list.stream().skip(3).forEach(System.out::println);

        System.out.println();

        Employee employee = new Employee("李雲龍", 20, new MyDate(1000, 1, 1));
        list.add(employee);
        list.add(employee);
        list.add(employee);
        list.add(employee);
        list.add(employee);

        list.stream().distinct().forEach(System.out::println);

    }

    @Test
    public void test2() {

        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);

        List<Employee> employees = EmployeeData.getEmployees();
        Stream<String> namesStream = employees.stream().map(Employee::getName);
        namesStream.filter(name -> name.length() > 2).forEach(System.out::println);

        Stream<Stream<Character>> streamStream = list.stream().map(StreamAPITest1::fromStringToStream);
        streamStream.forEach(s -> s.forEach(System.out::println));

        System.out.println();

        Stream<Character> characterStream = list.stream().flatMap(StreamAPITest1::fromStringToStream);
        characterStream.forEach(System.out::println);

    }

    public static Stream<Character> fromStringToStream(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (Character c : str.toCharArray()) {
            list.add(c);
        }
        return list.stream();
    }


    @Test
    public void test3() {

        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList list2 = new ArrayList();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        //list1.add(list2);
        list1.addAll(list2);
        System.out.println(list1);

    }

    @Test
    public void test4() {

        List<Integer> list = Arrays.asList(12, 43, 65, 34, 87, 0, -98, 7);
        list.stream().sorted().forEach(System.out::println);

        List<Employee> employees = EmployeeData.getEmployees();
        //employees.stream().sorted((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge())).forEach(System.out::println);
        employees.stream().sorted((e1, e2) -> {

                    int ageValue = Integer.compare(e1.getAge(), e2.getAge());
                    if (ageValue != 0) {
                        return ageValue;
                    } else {
                        return Integer.compare(e1.getBirthday().getMonth(), e2.getBirthday().getMonth());
                    }
                }

        ).forEach(System.out::println);

    }
}

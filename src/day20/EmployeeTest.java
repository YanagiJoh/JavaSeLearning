package day20;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTest {

    @Test
    public void test1() {

        TreeSet<Employee> set = new TreeSet<Employee>();

        Employee e1 = new Employee("Tom", 33, new MyDate(1990, 1, 1));
        Employee e2 = new Employee("Jack", 35, new MyDate(1991, 1, 2));
        Employee e3 = new Employee("David", 18, new MyDate(1992, 1, 3));
        Employee e4 = new Employee("Jerry", 28, new MyDate(1992, 1, 4));
        Employee e5 = new Employee("Harry", 23, new MyDate(1993, 1, 5));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test2() {


        TreeSet set = new TreeSet(new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                MyDate b1 = o1.getBirthday();
                MyDate b2 = o2.getBirthday();
                return b1.compareTo(b2);
            }

        });
//            @Override
//            public int compare(Object o1, Object o2) {
//                if (o1 instanceof Employee && o2 instanceof Employee) {
//                    Employee e1 = (Employee) o1;
//                    Employee e2 = (Employee) o2;
//
//                    MyDate b1 = e1.getBirthday();
//                    MyDate b2 = e2.getBirthday();
//
////                    int minusYear = b1.getYear() - b2.getYear();
////                    if (minusYear != 0) {
////                        return minusYear;
////                    }
////
////                    int minusMonth = b1.getMonth() - b2.getMonth();
////                    if (minusMonth != 0) {
////                        return minusMonth;
////                    }
////
////                    return b1.getDay() - b2.getDay();
//                    return b1.compareTo(b2);
//
//                }
//
//                throw new RuntimeException("比較対象のオブジェクトの型が一致してない。");
//            }
//        });

        Employee e1 = new Employee("Tom", 33, new MyDate(1990, 1, 1));
        Employee e2 = new Employee("Jack", 35, new MyDate(1991, 1, 2));
        Employee e3 = new Employee("David", 18, new MyDate(1992, 1, 3));
        Employee e4 = new Employee("Jerry", 28, new MyDate(1992, 1, 4));
        Employee e5 = new Employee("Harry", 23, new MyDate(1993, 1, 5));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

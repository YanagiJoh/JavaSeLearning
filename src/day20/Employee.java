package day20;

public class Employee implements Comparable<Employee> {

    private String name;
    private int age;
    private MyDate birthday;

    public Employee() {
        System.out.println("Employee......");
    }

    public Employee(int age) {
        this.age = age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.getName());
    }

    //    @Override
//    public int compareTo(Object o) {
//
//        if (o instanceof Employee) {
//            Employee e = (Employee) o;
//            return this.name.compareTo(e.getName());
//        }
//
//        throw new RuntimeException("比較対象のオブジェクトの型が一致してない。");
//
//    }
}


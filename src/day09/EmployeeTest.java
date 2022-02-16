package day09;

/**
 * メソッドの引数リストの変数名とクラスの属性名と同じ場合、thisを省略することができない
 */
public class EmployeeTest {
    public static void main(String[] args) {

        Employee e = new Employee();
        e.setAge(25);
        System.out.println(e.getAge());

        e.work();
        System.out.println();

        Employee e1 = new Employee("Jerry", 30);
        System.out.println(e1.getAge());

    }
}

class Employee {

    private String name;
    private int age;

    public Employee() {
        this.rest();
        System.out.println("employee初期化......");
    }

    public Employee(String name, int age) {
        this();//コンストラクタの1行目に記述しないといけない、一つしかコールすることができない
        this.name = name;
        this.age = age;
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

    public void work() {
        System.out.println("従業員が働く");
        rest();
    }

    public void rest() {
        System.out.println("従業員が休憩中");
    }

}

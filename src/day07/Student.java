package day07;

public class Student {

    String name;
    int age;
    /**
     * sex:1⇒男　sex:0⇒女　
     */
    int sex;

    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println("age: " + age);
    }

    public int addAge(int i) {
        age += i;
        return age;
    }
}

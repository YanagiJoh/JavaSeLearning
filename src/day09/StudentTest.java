package day09;

public class StudentTest {
    public static void main(String[] args) {

        Student stu = new Student();
        stu.study();

        Student stu1 = new Student("Tom", 20);
        System.out.println("name = " + stu1.name + ",age = " + stu1.age);

    }
}

class Student {

    String name;
    int age;

    public Student() {
        System.out.println("Student()......");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void study() {
        System.out.println("学生が勉強する。");
    }
}

package day11;

public class SuperTest {
    public static void main(String[] args) {

        Student1 s = new Student1();
        s.show();

        System.out.println();

        s.study();

        Student1 s1 = new Student1("Yang",30,"IT");
        s1.show();

        System.out.println("********************");
        Student1 s2 = new Student1();
    }
}

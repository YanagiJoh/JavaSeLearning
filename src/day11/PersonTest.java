package day11;

public class PersonTest {

    public static void main(String[] args) {

        Student s = new Student("コンピューターサイエンス");
        s.eat();
        s.walk(10);
        System.out.println("********************");
        s.study();

        Person p = new Person();
        p.eat();
    }
}

package day09;

public class UserTest {
    public static void main(String[] args) {

        User u = new User();

        System.out.println(u.age);

        User u1 = new User(20);

        u1.setAge(30);

        System.out.println(u1.age);
    }
}

class User {

    String name;
    int age = 1;

    public User() {

    }

    public User(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

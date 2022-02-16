package day09;

public class Person {

    private int age;

    public  Person(){
        age = 18;
    }

    public void setAge(int age) {

        if (age < 0 || age > 130) {
            System.out.println("入力のデータが間違っています。");
            return;
        }

        this.age = age;

    }

    public int getAge() {
        return age;
    }
}

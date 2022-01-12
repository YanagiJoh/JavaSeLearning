package day07;

public class StudentTest {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Tom";
        s1.age = 18;
        s1.sex = 1;

        s1.study();
        s1.showAge();;
        int newAge = s1.addAge(2);
        System.out.println( s1.name + "の新年齢は" + newAge + "歳です。");

        System.out.println(s1.age);//20

        Student s2 = new Student();
        s2.showAge();//0
        s2.addAge(10);
        s2.showAge();//10
    }
}

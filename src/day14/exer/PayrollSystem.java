package day14.exer;

import java.util.Calendar;
import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("当月の月を入力してください:");
//        int month = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);

        Employee[] emps = new Employee[2];

        emps[0] = new SalariedEmpolyee("yang",0001,new Mydate(1992,3,23),10000);
        emps[1] = new HourlyEmployee("shen",0002,new Mydate(1993,6,23),60,240);

        for (int i = 0; i < emps.length ; i++) {
            System.out.println(emps[i]);
            double salary = emps[i].earnings();
            System.out.println("月収：" + salary);

            if((month+1) == emps[i].getBirthday().getMonth()){
                System.out.println("お誕生日おめでとうございます！１万円をプレゼントします");
            }
        }
    }
}

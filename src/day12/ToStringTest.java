package day12;

import java.util.Date;

public class ToStringTest {
    public static void main(String[] args) {

        Customer cust1 = new Customer("Tom",21);
        System.out.println(cust1.toString());
        System.out.println(cust1);

        String str = new String("MM");
        System.out.println(str);//MM

        Date date = new Date(123456789L);
        System.out.println(date.toString());
    }
}

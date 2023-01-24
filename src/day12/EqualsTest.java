package day12;

import java.util.Date;

public class EqualsTest {

    public static void main(String[] args) {

        int i =10;
        int j =10;
        double d =10.0;

        System.out.println(i == j);//true
        System.out.println(i == d);//true

        boolean b = true;
        //System.out.println(i == b);

        char c = 10;
        System.out.println(i == c);//true

        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2);//true

        Customer cust1 = new Customer("Tom",20);
        Customer cust2 = new Customer("Tom",20);
        System.out.println(cust1 == cust2);//false

        String str1 = new String("Java");
        String str2 = new String("Java");
        System.out.println(str1 == str2);//false

        System.out.println("********************");
        System.out.println(cust1.equals(cust2));//false
        System.out.println(str1.equals(str2));//true

        Date date1 = new Date(123456789L);
        Date date2 = new Date(123456789L);
        System.out.println(date1.equals(date2));//true

    }
}

package day17;

import org.junit.Test;

import java.util.Date;

public class DateTimeTest {

    @Test
    public void test1() {
        long time = System.currentTimeMillis();
        System.out.println(time);
    }

    @Test
    public void test2() {
        Date date1 = new Date();
        System.out.println(date1.toString());
        System.out.println(date1.getTime());

        Date date2 = new Date(1550306204104L);
        System.out.println(date2.toString());

        java.sql.Date date3 = new java.sql.Date(34567345674563L);
        System.out.println(date3.toString());

        Date date4 = new Date();
        java.sql.Date date5 = new java.sql.Date(date4.getTime());
    }
}

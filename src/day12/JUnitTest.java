package day12;

import org.junit.Test;

import java.util.Date;

public class JUnitTest {

    int num = 10;

    @Test
    public void testEquals() {
        String str1 = "MM";
        String str2 = "MM";
        System.out.println(str1.equals(str2));

//        Object obj = new String("GG");
//        Date date = (Date) obj;

        System.out.println(num);
        show();

    }

    public void show(){
        num = 20;
        System.out.println("show: " + num);
    }

    @Test
    public void testToString(){
        String str = "MM";
        System.out.println(str.toString());
    }
}

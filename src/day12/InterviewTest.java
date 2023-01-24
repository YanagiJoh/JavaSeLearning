package day12;

import org.junit.Test;

public class InterviewTest {

    @Test
    public void test1(){
        Object obj1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(obj1);
    }

    @Test
    public void test2(){
        Object obj2 ;
        if(true){
           obj2 = new Integer(1);
        }else{
            obj2 = new Double(2.0);
        }
        System.out.println(obj2);
    }

    @Test
    public void test3(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//false

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//true

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//false

    }

}

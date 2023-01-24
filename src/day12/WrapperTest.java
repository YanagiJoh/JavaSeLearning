package day12;

import org.junit.Test;

public class WrapperTest {

    @Test
    public void test1(){

        int num1 = 1;
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());

        Integer in2 = new Integer("123");
        System.out.println(in2.toString());

        //Integer int3 = new Integer("123abc");
        //System.out.println(int3.toString());

        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");
        System.out.println(f1);
        System.out.println(f2);

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("true123");
        Boolean b4 = new Boolean("TrUe");//true
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        Sex s = new Sex();
        System.out.println(s.isMale);//false
        System.out.println(s.isFemale);//null
    }

    @Test
    public void test2(){
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1 + 1);

        Float f1 = new Float(12.3f);
        float f2 = f1.floatValue();
        System.out.println(f2 + 1);
    }

    @Test
    public void test3(){
        int num = 10;
        Integer in1 = num;

        boolean b1 = true;
        Boolean b2 = b1;

        System.out.println(in1.toString());
        int num1 = in1;
    }

    public void method(Object obj){

    }

    @Test
    public void test4(){
        int num = 10;

        String str1 = num + "";

        float f1 = 12.3f;
        String str2 = String.valueOf(f1);//"12.3"

        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);
        System.out.println(str2);
        System.out.println(str3);

    }

    @Test
    public void test5(){
        String str1 = "123";
        int num = Integer.parseInt(str1);
        System.out.println(num + 1);

        String str2 = "true";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);

    }
}

class Sex{
    boolean isMale;
    Boolean isFemale;
}

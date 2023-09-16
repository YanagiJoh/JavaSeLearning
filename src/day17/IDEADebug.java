package day17;

import org.junit.Test;

import javax.print.DocFlavor;

public class IDEADebug {

    @Test
    public void testStringBuffer(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        System.out.println(sb.length());//4
        System.out.println(sb);//"null"

        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);
    }
}

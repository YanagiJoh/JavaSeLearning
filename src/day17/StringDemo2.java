package day17;

import org.junit.Test;

import java.util.concurrent.ForkJoinPool;

public class StringDemo2 {

    public String getMaxSameString(String str1, String str2) {

        if (str1 != null && str2 != null) {

            String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
            String minStr = (str1.length() < str2.length()) ? str1 : str2;
            int length = str1.length();
            for (int i = 0; i < length; i++) {
                for (int x = 0, y = length - i; y <= length; x++, y++) {
                    String subStr = minStr.substring(x, y);
                    if (maxStr.contains(subStr)) {
                        return subStr;
                    }
                }
            }
        }

        return null;
    }

    @Test
    public void testMaxSameString(){
        String str1 = "abcwerthelloyuidefadcdef";
        String str2 = "cvhellonm";
        String maxSameString = getMaxSameString(str2,str1);
        System.out.println(maxSameString);
    }
}

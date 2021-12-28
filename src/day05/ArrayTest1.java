package day05;

public class ArrayTest1 {
    public static void main(String[] args) {

        //配列の要素のデフォルト初期値

        //配列の要素の型がintの場合：デフォルト初期値=0
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length ; i++) {

            System.out.println(arr1[i]);

        }

        System.out.println("**********");
        //配列の要素の型がshortの場合：デフォルト初期値=0
        short[] arr2 = new short[5];
        for (int i = 0; i < arr2.length ; i++) {

            System.out.println(arr2[i]);

        }

        System.out.println("**********");
        //配列の要素の型がfloatの場合：デフォルト初期値=0.0
        float[] arr3 = new float[5];
        for (int i = 0; i < arr3.length ; i++) {

            System.out.println(arr3[i]);

        }

        System.out.println("**********");
        //配列の要素の型がcharの場合：デフォルト初期値=0 or '\u0000','0'ではない
        char[] arr4 = new char[5];
        for (int i = 0; i < arr4.length ; i++) {

            System.out.println(arr4[i]);

        }

        if(arr4[0] == 0){
            System.out.println("Hello!");
        }

        System.out.println("**********");
        //配列の要素の型がbooleanの場合：デフォルト初期値=false(0)
        int[] arr5 = new int[5];
        for (int i = 0; i < arr5.length ; i++) {

            System.out.println(arr5[i]);

        }

        System.out.println("**********");
        //配列の要素の型が参照型の場合：デフォルト初期値=null
        String[] arr6 = new String[5];
        for (int i = 0; i < arr6.length ; i++) {

            System.out.println(arr6[i]);

        }

    }
}

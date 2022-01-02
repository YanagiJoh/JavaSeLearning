package day06;

public class ArrayExceptionTest {
    public static void main(String[] args) {

        //配列のインデックスを超える例外:ArrayIndexOutOfBoundsException
        int[] arr = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i <= arr.length; i++) {

            System.out.print(arr[i] + "\t");

        }

        System.out.println(arr[-2]);

        //NullPointerException
        int[] arr1 = {1, 2, 3};
        arr1 = null;
        System.out.println(arr1[0]);

        int[][] arr2 = new int[4][];
        System.out.println(arr2[0][0]);

        String[] arr3 = new String[]{"AA", "BB", "CC"};
        arr3[0] = null;
        System.out.println(arr3[0].toString());


    }
}

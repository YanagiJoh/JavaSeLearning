package day06;

public class ArrayTest2 {
    public static void main(String[] args) {

        String[] arr = new String[]{"AA", "BB", "CC", "DD", "EE", "FF"};

        //配列要素の反転
        //方法一:
        for (int i = 0; i < arr.length / 2; i++) {

            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }

        for (int i = 0; i < arr.length ; i++) {

            System.out.print(arr[i] + "\t");

        }

        System.out.println();

        //方法二:
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {

            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

        for (int i = 0; i < arr.length ; i++) {

            System.out.print(arr[i] + "\t");

        }
    }
}

package day05;

import java.util.Spliterator;

public class ArrayTest2 {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3};

        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};//二次元配列
        int[][] arr4 = {{1, 2, 3}, {4, 5}, {6, 7, 8}};//二次元配列


        String[][] arr2 = new String[3][2];
        String[][] arr3 = new String[3][];

        //NG例
        //int[][] arr3 = new int[][4];
        //int[][] arr4 = new int[3][3]{{1, 2, 3}, {4, 5}, {6, 7, 8}};//二次元配列
        //String[3][2] arr5 = new String[][];

        System.out.println(arr1[0][1]);//2
        System.out.println(arr2[1][1]);//null
        arr3[1] = new String[4];
        System.out.println(arr3[1][0]);//null

        System.out.println(arr4.length);//3
        System.out.println(arr4[0].length);//3
        System.out.println(arr4[1].length);//2

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {

                System.out.print(arr4[i][j] + " " );

            }

            System.out.println();

        }

    }
}

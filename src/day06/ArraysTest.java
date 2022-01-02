package day06;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,3,2,4};

        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[]{-23,12,34,56,78,90};
        int index = Arrays.binarySearch(arr3,78);
        System.out.println(index);
    }
}

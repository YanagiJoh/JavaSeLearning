package day06;

public class BubbleSortTest {
    public static void main(String[] args) {

        int[] arr = new int[]{23, -38, 29, 33, 45, 58, 123, -78, 99, 144};

        //バブルソート
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }

        }

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + "\t");

        }
    }
}

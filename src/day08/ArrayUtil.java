package day08;

public class ArrayUtil {

    //最大値
    public int getMax(int[] arr) {
        int maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }

        return maxValue;
    }

    //最小値
    public int getMin(int[] arr) {
        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }

        return minValue;
    }

    //和
    public int getSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    //平均値
    public int getAvg(int[] arr) {

        return getSum(arr) / arr.length;

    }

    //反転
    public void reverse(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

    }

    //複製
    public int[] copy(int[] arr) {

        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr1.length; i++) {

            arr1[i] = arr[i];

        }

        return arr1;

    }

    //ソート
    public void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    //出力
    public void print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println();

    }

    //探索
    public int search(int[] arr, int dest) {

        for (int i = 0; i < arr.length; i++) {
            if (dest == arr[i]) {
                return i;
            }
        }

        return -1;
    }

}

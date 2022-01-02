package day06;

public class ArrayTest1 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int) (Math.random() * 90 + 10);

        }

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + "\t");

        }
        System.out.println();

        //最大値
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }

        }
        System.out.println("配列の最大値は: " + maxValue);

        //最小値
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (minValue > arr[i]) {
                minValue = arr[i];
            }

        }
        System.out.println("配列の最小値は: " + minValue);

        //配列の和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

        }
        System.out.println("配列の和は: " + sum);

        //配列の平均数
        int avgValue = 0;
        avgValue = sum/arr.length;
        System.out.println("平均数は: " + avgValue);
    }
}

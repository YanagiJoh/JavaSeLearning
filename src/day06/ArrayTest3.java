package day06;

public class ArrayTest3 {
    public static void main(String[] args) {

        String[] arr = new String[]{"AA", "BB", "CC", "DD", "EE", "FF"};

        //線形探索
        String dest = "EE";
        boolean isFlag = true;

        for (int i = 0; i < arr.length; i++) {

            if (dest.equals(arr[i])) {
                System.out.println("指定の要素が見つかりました。インデックスは: " + i);
                isFlag = false;
                break;
            }

        }

        if (isFlag) {

            System.out.println("残念ですが、指定の要素が見つかりませんでした。");

        }

        //二分探索
        //前提:配列の要素は必ず順序がある
        int[] arr1 = new int[]{-34, 1, 55, 137, 255, 335, 678, 1004};

        int dest1 = 55;

        int head = 0;
        int end = arr1.length - 1;

        boolean isFlag1 = true;

        while (head <= end) {

            int middle = (head + end) / 2;
            if (dest1 == arr1[middle]) {

                System.out.println("指定の要素が見つかりました。インデックスは: " + middle);
                isFlag1 = false;
                break;

            } else if (dest1 < arr1[middle]) {

                end = middle - 1;

            } else {//dest1 > arr1[middle]

                head = middle + 1;
            }

        }

        if (isFlag1) {

            System.out.println("残念ですが、指定の要素が見つかりませんでした。");

        }

    }
}

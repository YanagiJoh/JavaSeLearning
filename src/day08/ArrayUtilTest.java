package day08;

public class ArrayUtilTest {
    public static void main(String[] args) {

        int[] arr = {-55, 67, 0, 99, 109, -145, 43};

        ArrayUtil util = new ArrayUtil();

        System.out.println("探索:");
        int index = util.search(arr, 99);
        if (index >= 0) {
            System.out.println("指定要素のインデックスは: " + index);
        } else {
            System.out.println("指定の要素が見つかりませんでした。");
        }

        int max = util.getMax(arr);
        System.out.println("配列の最大値は: " + max);

        System.out.println("ソート前");
        util.print(arr);

        util.sort(arr);

        System.out.println("ソート後");
        util.print(arr);
    }
}

package day05;

public class ArrayTest {
    public static void main(String[] args) {

        int[] ids;
        ids = new int[]{1001,1002,1003,1004};

        String[] names = new String[5];

        //NG例：
        //int[] ids = new int[];
        //int[5] ids = new int[];
        //int[] ids = new int[3]{1,2,3};

        //配列の初期化が終わった時点で長さも確定されてる
        //配列のインデックスは０から始め、レングス-1まで終わり
        names[0] = "田中";
        names[1] = "佐藤";
        names[2] = "中村";
        names[3] = "松田";
        names[4] = "林";

        //配列の長さを取得
        System.out.println(names.length);//5

        for (int i = 0; i < names.length ; i++) {

            System.out.println(names[i]);

        }

    }
}

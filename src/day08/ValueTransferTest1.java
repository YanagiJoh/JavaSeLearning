package day08;

public class ValueTransferTest1 {
    public static void main(String[] args) {


        int m = 10;
        int n = 20;

        System.out.println("m = " + m + ",n = " + n);

//        int temp = m;
//        m = n;
//        n = temp;
        ValueTransferTest1 test = new ValueTransferTest1();
        test.swap(m, n);
        //引数が基本型の場合、値が交換されない
        System.out.println("m = " + m + ",n = " + n);


    }

    public void swap(int m, int n) {
        int temp = m;
        n = m;
        m = temp;
    }
}



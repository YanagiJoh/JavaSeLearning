package day08;

public class ValueTransferTest {
    public static void main(String[] args) {

        System.out.println("**********基本型**********");

        int m = 10;
        int n = m;

        System.out.println("m = " + m + ",n = " + n);

        n = 20;

        System.out.println("m = " + m + ",n = " + n);

        System.out.println("**********参照型**********");

        Order o1 = new Order();
        o1.orderId = 1001;

        Order o2 = o1;

        System.out.println("o1.order = " + o1.orderId + ",o2.orderId = " + o2.orderId);

        o2.orderId = 1002;

        System.out.println("o1.order = " + o1.orderId + ",o2.orderId = " + o2.orderId);

    }
}

class  Order{
    int orderId;
}

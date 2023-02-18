package day13;

public class OrderTest {
    public static void main(String[] args) {
        Order1 order = new Order1();
        System.out.println(order.orderId);
    }
}

class Order1 {
    int orderId = 3;
    {
        orderId = 4;
    }
}

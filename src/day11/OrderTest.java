package day11;

public class OrderTest {
    public static void main(String[] args) {

        Order order = new Order();
        order.orderDefault = 1;
        order.orderProtected = 2;
        order.orderPublic = 3;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();

        //order.orderPrivate = 4;
        //order.methodPrivate();
    }
}

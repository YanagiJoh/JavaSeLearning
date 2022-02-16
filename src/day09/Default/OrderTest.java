package day09.Default;

import day09.Order;

public class OrderTest {
    public static void main(String[] args) {

        Order order = new Order();

        order.orderPublic = 1;
        //order.orderDefault = 2;
        //order.orderPrivate = 3;

        //order.methodDefault();
        order.methodPublic();
        //order.methodPrivate();
    }
}

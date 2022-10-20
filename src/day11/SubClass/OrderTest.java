package day11.SubClass;

import day11.Order;

public class OrderTest {
    public static void main(String[] args) {

        Order order = new Order();
        order.orderPublic = 1;
        order.methodPublic();

        //order.orderPrivate = 2;
        //order.orderDefault = 3;
        //order.orderProtected = 4;

        //order.methodPrivate();
        //order.methodDefault();
        //order.methodProtected();
    }

    public void show(Order order){

        order.orderPublic = 1;
        order.methodPublic();

        //order.orderPrivate = 2;
        //order.orderDefault = 3;
        //order.orderProtected = 4;

        //order.methodPrivate();
        //order.methodDefault();
        //order.methodProtected();
    }
}

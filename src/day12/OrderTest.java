package day12;

import java.util.Objects;

public class OrderTest {

    public static void main(String[] args) {

        Order1 obj1 = new Order1(1001,"AA");
        Order1 obj2 = new Order1(1001,"BB");

        System.out.println(obj1.equals(obj2));

        Order1 obj3 = new Order1(1001,"BB");

        System.out.println(obj2.equals(obj3));
    }

}

class Order1 {

    private int orderId;
    private String orderName;

    public Order1(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Order1) {
            Order1 order = (Order1) obj;
            return this.orderId == order.orderId && this.orderName.equals(order.orderName);
        }
        return false;
    }

}

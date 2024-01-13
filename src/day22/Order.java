package day22;

import java.util.ArrayList;
import java.util.List;

public class Order<T> {

    String orderName;
    int orderId;

    T orderT;

    public Order(String orderName, int orderId, T orderT) {
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    public Order() {
        T[] arr = (T[]) new Object[10];
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }

//    public static  void show(T orderT){
//        System.out.println(orderT);
//    }

    public static <E>  List<E> copyFromArrayToList(E[] arr){

        ArrayList<E> list = new ArrayList<>();

        for(E e: arr){
            list.add(e);
        }

        return list;
    }
}

package day11.SubClass;

import day11.Order;

public class SubOrder extends Order {

    public void method(){
        orderProtected = 1;
        orderPublic = 2;

        methodProtected();
        methodPublic();

        //orderDefailt = 3;
        //orderPrivate = 4;

        //methodDefault();
        //methodPrivate();

    }
}

package day16;

public class WindowTest2 {
    public static void main(String[] args) {
        Window2 t1 = new Window2();
        Window2 t2 = new Window2();
        Window2 t3 = new Window2();

        t1.setName("窓口1");
        t2.setName("窓口2");
        t3.setName("窓口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Window2 extends Thread {

    private static int ticket = 100;
    //private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //synchronized (obj) {
            synchronized (Window2.class) {

                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(getName() + "が受付、チケット番号: " + ticket);
                    ticket--;
                } else {
                    break;
                }

            }

        }
    }
}


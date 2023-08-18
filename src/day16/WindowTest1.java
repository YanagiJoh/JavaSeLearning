package day16;

public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w = new Window1();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窓口1");
        t2.setName("窓口2");
        t3.setName("窓口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Window1 implements Runnable {

    private int ticket = 100;
    //Object obj = new Object();

    @Override
    public void run() {

        while (true) {
            synchronized (this) {

                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "が受付、チケット番号: " + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

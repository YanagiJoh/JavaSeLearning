package day16;

public class WindowTest3 {
    public static void main(String[] args) {
        Window3 w = new Window3();

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

class Window3 implements Runnable {

    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {

            show();

        }

    }

    private synchronized void show() {
        //synchronized(this) {
        if (ticket > 0) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "が受付、チケット番号: " + ticket);
            ticket--;
        }
        //}

    }

}

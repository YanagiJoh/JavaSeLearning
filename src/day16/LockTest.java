package day16;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    public static void main(String[] args) {
        Window5 w = new Window5();

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

class Window5 implements Runnable {

    private int ticket = 100;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {

            try{

                lock.lock();

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
            }finally {
                lock.unlock();
            }

        }
    }
}

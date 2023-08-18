package day16;

public class WindowTest4 {
    public static void main(String[] args) {
        Window4 t1 = new Window4();
        Window4 t2 = new Window4();
        Window4 t3 = new Window4();

        t1.setName("窓口1");
        t2.setName("窓口2");
        t3.setName("窓口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Window4 extends Thread {

    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {

            show();

        }
    }

    private static synchronized void show() {

            if (ticket > 0) {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "が受付、チケット番号: " + ticket);
                ticket--;
            }

    }
}

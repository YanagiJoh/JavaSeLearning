package day16;

public class WindowTest {
    public static void main(String[] args) {
        Window t1 = new Window();
        Window t2 = new Window();
        Window t3 = new Window();

        t1.setName("窓口1");
        t2.setName("窓口2");
        t3.setName("窓口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Window extends Thread {

    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(getName() + "が受付、チケット番号: " + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}

package day16;

public class ProductTest {
    public static void main(String[] args) {

        Clerk clerk = new Clerk();

        Producer p1 = new Producer(clerk);
        p1.setName("生産者1");

        Consumer c1 = new Consumer(clerk);
        c1.setName("消費者1");

        Consumer c2 = new Consumer(clerk);
        c2.setName("消費者2");

        p1.start();
        c1.start();
        c2.start();
    }
}

class Clerk{

    private int productCount = 0;

    public synchronized void produceProduct() {
        if(productCount < 20){
            productCount++;
            System.out.println(Thread.currentThread().getName() + ":第" + productCount + "個の商品の生産を開始する。");
            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumeProduct() {
        if(productCount > 0){
            System.out.println(Thread.currentThread().getName() + ":第" + productCount + "個の商品を消費する。");
            productCount--;
            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer extends Thread{
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + ":商品を生産する......");

        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}

class Consumer extends Thread{
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + ":商品を消費する......");

        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }
    }
}


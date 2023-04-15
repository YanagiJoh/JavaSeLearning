package day14;

public class USBTest {
    public static void main(String[] args) {

        Computer com = new Computer();
        Flash flash = new Flash();
        com.transferData(flash);
        com.transferData(new Printer());

        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("スマホが起動する");
            }

            @Override
            public void stop() {
                System.out.println("スマホがシャットダウンする");
            }
        };

        com.transferData(phone);

        com.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("MP3が起動する");
            }

            @Override
            public void stop() {
                System.out.println("MP3がシャットダウンする");
            }
        });
    }
}

interface USB{

    void start();
    void stop();
}

class Flash implements USB{

    @Override
    public void start() {
        System.out.println("USBが起動する");
    }

    @Override
    public void stop() {
        System.out.println("USBが終了する");
    }
}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("プリンターが起動する");
    }

    @Override
    public void stop() {
        System.out.println("プリンターが停止する");
    }
}

class Computer{

    public void transferData(USB usb){
        usb.start();

        System.out.println("具体的なデータを伝送する");

        usb.stop();
    }
}

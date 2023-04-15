package day14;

public class NetWorkTest {

    public static void main(String[] args) {
        Sever sever = new Sever();
        ProxySever proxysever = new ProxySever(sever);
        proxysever.browse();
    }

}

interface NetWork {

    public void browse();

}

class Sever implements NetWork {

    @Override
    public void browse() {
        System.out.println("サーバがネットワークにアクセスする");
    }

}

class ProxySever implements NetWork {

    private NetWork network;

    public ProxySever(NetWork network) {
        this.network = network;
    }

    public void check() {
        System.out.println("ネットワークに接続する前に検査する");
    }

    @Override
    public void browse() {
        check();
        network.browse();
    }

}
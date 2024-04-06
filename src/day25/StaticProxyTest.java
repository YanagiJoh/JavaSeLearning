package day25;

public class StaticProxyTest {
    public static void main(String[] args) {

        ClothFactory nike = new NikeClothFactory();

        ClothFactory proxyClothFactory = new ProxyClothFactory(nike);

        proxyClothFactory.produceCloth();

    }
}

interface ClothFactory {
    void produceCloth();
}

class ProxyClothFactory implements ClothFactory {

    private ClothFactory factory;

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void produceCloth() {

        System.out.println("代理工場が準備作業をしている");

        factory.produceCloth();

        System.out.println("代理工場が最後片付け作業をする");
    }
}

class NikeClothFactory implements ClothFactory {

    @Override
    public void produceCloth() {
        System.out.println("Nike工場が服を生産している");
    }
}

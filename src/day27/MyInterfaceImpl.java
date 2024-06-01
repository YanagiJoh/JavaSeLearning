package day27;

public class MyInterfaceImpl implements MyInterface {


    @Override
    public void methodAbstract() {
        System.out.println("実装クラスでmethodAbstractメソッドをオーバーロードした");
    }

    public static void main(String[] args) {

        MyInterface.methodStatic();

        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.methodDefault();

        //impl.methodPrivate();

    }
}

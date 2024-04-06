package day25;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        Human proxyInstance = (Human) ProxyFactory.getInstance(superMan);
        String belief = proxyInstance.getBelief();
        System.out.println(belief);
        proxyInstance.eat("四川麻辣燙");

        System.out.println("********************");

        NikeClothFactory nikeClothFactory = new NikeClothFactory();
        ClothFactory proxyClothFactory = (ClothFactory) ProxyFactory.getInstance(nikeClothFactory);
        proxyClothFactory.produceCloth();

    }

}

interface Human {

    String getBelief();

    void eat(String food);

}

class SuperMan implements Human {

    @Override
    public String getBelief() {
        return "I believe I can fly!";
    }

    @Override
    public void eat(String food) {
        System.out.println(food + "を食べるのが好き");
    }
}

class ProxyFactory {

    public static Object getInstance(Object obj) {

        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);

    }
}

class MyInvocationHandler implements InvocationHandler {

    private Object obj;

    public void bind(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        HumanUtil util = new HumanUtil();
        util.method1();

        Object returnValue = method.invoke(obj, args);

        util.method2();

        return returnValue;
    }

}

class HumanUtil {

    public void method1() {
        System.out.println("**********共通処理1**********");
    }

    public void method2() {
        System.out.println("**********共通処理2**********");
    }

}

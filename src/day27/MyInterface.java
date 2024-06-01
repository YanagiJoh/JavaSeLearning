package day27;

public interface MyInterface {

    void methodAbstract();

    static void methodStatic(){
        System.out.println("インターフェースの中のstaticなメソッド");
    }

    default void methodDefault(){
        System.out.println("インターフェースの中のデフォルトなメソッド");
    }

    //JDK 9の新機能：privateなメソッドを定義できる
    private void methodPrivate(){
        System.out.println("インターフェースの中のプライベートなメソッド");
    }
}

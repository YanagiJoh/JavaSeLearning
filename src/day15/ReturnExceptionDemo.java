package day15;

public class ReturnExceptionDemo {
    public static void main(String[] args) {
        try {
            methodA();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        methodB();
    }

    static void methodA(){
        try {
            System.out.println("メソッドAに入る");
            throw new RuntimeException("例外が発生する");
        }finally {
            System.out.println("メソッドAのFinally");
        }
    }

    static void methodB(){
        try {
            System.out.println("メソッドBに入る");
            return;
        }finally {
            System.out.println("メソッドBのFinally");
        }
    }
}

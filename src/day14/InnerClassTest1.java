package day14;

public class InnerClassTest1 {

    public void method(){

        class AA{

        }

    }

    public Comparable getComparable(){

//        class MyComparable implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//
//        return new MyComparable();

        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}

package day07;

/**
 * Exertest2.javaの最適化
 */
public class Exertest2 {
    public static void main(String[] args) {

        Students1[] stus = new Students1[20];

        for (int i = 0; i < stus.length; i++) {

            stus[i] = new Students1();
            stus[i].number = i + 1;
            stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            stus[i].score = (int) (Math.random() * (100 - 0 + 1));

        }

        Exertest2 ex2 = new Exertest2();

        ex2.print(stus);

        System.out.println("********************");

        ex2.searchState(stus,3);

        System.out.println("********************");

        ex2.sort(stus);

        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].info());
        }

    }

    public void print(Students1[] stus) {
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].info());
        }
    }

    /**
     * @param stus  　対象の配列
     * @param state 学年
     */
    public void searchState(Students1[] stus, int state) {
        for (int i = 0; i < stus.length; i++) {
            if (stus[i].state == state) {
                System.out.println(stus[i].info());
            }
        }
    }

    //Students1配列をソートする機能
    public void sort(Students1[] stus) {
        for (int i = 0; i < stus.length - 1; i++) {
            for (int j = 0; j < stus.length - 1 - i; j++) {
                if (stus[j].score > stus[j + 1].score) {
                    Students1 temp = stus[j + 1];
                    stus[j + 1] = stus[j];
                    stus[j] = temp;
                }
            }
        }
    }

}

class Students1 {

    int number;
    int state;
    int score;

    public String info() {
        return "学籍番号: " + number + ",学年: " + state + ",点数: " + score;
    }

}
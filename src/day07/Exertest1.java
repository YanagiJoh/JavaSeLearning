package day07;

public class Exertest1 {
    public static void main(String[] args) {

        Students[] stus = new Students[20];

        for (int i = 0; i < stus.length; i++) {

            stus[i] = new Students();
            stus[i].number = i + 1;
            stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            stus[i].score = (int) (Math.random() * (100 - 0 + 1));

        }

        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].info());
        }

        System.out.println("********************");

        for (int i = 0; i < stus.length; i++) {
            if (stus[i].state == 3) {
                System.out.println(stus[i].info());
            }
        }

        System.out.println("********************");

        for (int i = 0; i < stus.length - 1; i++) {
            for (int j = 0; j < stus.length - 1 - i; j++) {
                if (stus[j].score > stus[j + 1].score) {
                    Students temp = stus[j + 1];
                    stus[j + 1] = stus[j];
                    stus[j] = temp;
                }
            }
        }

        for (int i = 0; i < stus.length ; i++) {
            System.out.println(stus[i].info());
        }

    }
}

class Students {

    int number;
    int state;
    int score;

    public String info() {
        return "学籍番号: " + number + ",学年: " + state + ",点数: " + score;
    }

}
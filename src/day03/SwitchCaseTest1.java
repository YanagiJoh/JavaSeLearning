package day03;

public class SwitchCaseTest1 {
    public static void main(String[] args) {

        int score = 78;
        switch (score / 10) {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不合格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("合格");
                break;

        }
    }
}

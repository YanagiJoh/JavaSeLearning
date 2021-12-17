package FamilyAccountDemo;

import java.util.Scanner;

/**
 * Utilityｹ､ｾﾟﾀ爛ｺ
 * ｽｫｲｻﾍｬｵﾄｹｦﾄﾜｷ籏ｰﾎｪｷｽｷｨ｣ｬｾﾍﾊﾇｿﾉﾒﾔﾖｱｽﾓﾍｨｹｵﾃｷｽｷｨﾊｹﾓﾃﾋ・ﾄｹｦﾄﾜ｣ｬｶﾞﾐ霑ｼﾂﾇｾﾟﾌ蠏ﾄｹｦﾄﾜﾊｵﾏﾖﾏｸｽﾚ｡｣
 */
public class Utility {
    private static Scanner scanner = new Scanner(System.in);

    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.print("選択間違えた、再度入力してください：　");
            } else break;
        }
        return c;
    }

    public static int readNumber() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(4);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字を入力してください： ");
            }
        }
        return n;
    }

    public static String readString() {
        String str = readKeyBoard(8);
        return str;
    }

    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("YかNを入力してください： ");
            }
        }
        return c;
    }


    private static String readKeyBoard(int limit) {
        String line = "";

        while (scanner.hasNext()) {
            line = scanner.nextLine();
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("入力した値のレングスは" + limit + "より大きい、再度入力してください：");
                continue;
            }
            break;
        }

        return line;
    }
}

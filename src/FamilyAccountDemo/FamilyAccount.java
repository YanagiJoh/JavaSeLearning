package FamilyAccountDemo;

public class FamilyAccount {
    public static void main(String[] args) {

        boolean isFlag = true;

        String details = "";

        int balance = 10000;

        while(isFlag){

            System.out.println("----------家庭収支記録システム----------\n");
            System.out.println("          1　収支明細");
            System.out.println("          2　収入登録");
            System.out.println("          3　支出登録");
            System.out.println("          4　退出\n");
            System.out.print("          (1-4)を選択してください： ");
            //ユーザーの選択した番号を取得
            char selection = Utility.readMenuSelection();

            switch(selection){

                case '1':
                    System.out.println("----------現在収支明細----------");
                    System.out.println("収支\t残高\t金額\t備考\n");
                    System.out.println(details);
                    break;
                case '2':
                    System.out.print("今回の収入金額: ");
                    int addmoney = Utility.readNumber();
                    System.out.print("今回の収入の備考: ");
                    String addinfo = Utility.readString();

                    balance += addmoney;

                    details += ("収入\t" + balance + "\t" + addmoney + "\t" + addinfo + "\n");
                    System.out.println("収入登録完了\n");
                    break;
                case '3':
                    System.out.print("今回の支出金額: ");
                    int minusmoney = Utility.readNumber();
                    System.out.print("今回の支出の備考: ");
                    String minusinfo = Utility.readString();

                    if(balance >= minusmoney){
                        balance -= minusmoney;
                        details += ("支出\t" + balance + "\t" + minusmoney + "\t" + minusinfo + "\n");
                    }else{
                        System.out.println("支出が残高を超えてる");
                    }
                    System.out.println("支出登録完了\n");
                    break;
                case '4':
                    System.out.println("4　(Y/N)退出しますか？");
                    char isExit = Utility.readConfirmSelection();
                    if(isExit == 'Y'){
                        isFlag = false;
                    }
                    break;

            }


        }
    }
}

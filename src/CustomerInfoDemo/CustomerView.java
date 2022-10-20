package CustomerInfoDemo;

public class CustomerView {

    private  CustomerList customerList = new CustomerList(10);

    public CustomerView(){
        Customer cust = new Customer("孫悟空",'男',30,"1234567890","songoku@dragonball.com");
        customerList.addCustomer(cust);
    }

    public void enterMainMenu(){

        boolean isFlag = true;

        while (isFlag){

            System.out.println("\n--------------------顧客情報管理システム--------------------");
            System.out.println("                      1顧客追加");
            System.out.println("                      2顧客修正");
            System.out.println("                      3顧客削除");
            System.out.println("                      4顧客リスト");
            System.out.println("                      5退出\n");
            System.out.print("                      (1~5)から選択してください：");

            char menu = CMUtility.readMenuSelection();

            switch (menu){

                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("退出しますか(Y/N):");

                    char isExit = CMUtility.readConfirmSelection();

                    if(isExit == 'Y'){
                        isFlag = false;
                    }

            }

        }

    }

    private void listAllCustomers() {

        System.out.println("--------------------顧客リスト--------------------");

        int total = customerList.getTotal();
        if(total == 0){
            System.out.println("顧客の記録がありません!");
        }else{
            System.out.println("番号\t名前\t性別\t年齢\t電話番号\tメールアドレス");
            Customer[] custs = customerList.getAllCustomers();
            for (int i = 0; i < custs.length; i++) {

                System.out.println((i+1)+"\t"+custs[i].getName()+"\t"+custs[i].getGender()+"\t"+custs[i].getAge()+"\t"+custs[i].getPhone()+"\t"+custs[i].getEmail());
                
            }
        }

        System.out.println("--------------------顧客リスト完成--------------------");
    }

    private void modifyCustomer() {

        System.out.println("--------------------顧客修正--------------------");

        Customer cust;
        int number;

        for(;;){
            System.out.print("修正したい顧客番号を入力してください(-1退出): ");

            number = CMUtility.readInt();

            if(number == -1){
                return;
            }

             cust = customerList.getCustomer(number-1);

            if(cust == null){
                System.out.println("ご指定の顧客を見つけませんでした。");
            }else{
                break;
            }


        }

        System.out.print("名前(" + cust.getName() + "): ");
        String name = CMUtility.readString(10,cust.getName());
        System.out.print("性別(" + cust.getGender() + "): ");
        char gender = CMUtility.readChar(cust.getGender());
        System.out.print("年齢(" + cust.getAge() + "): ");
        int age = CMUtility.readInt(cust.getAge());
        System.out.print("電話番号(" + cust.getPhone() + "): ");
        String phone = CMUtility.readString(13,cust.getPhone());
        System.out.print("メールアドレス(" + cust.getEmail() + "): ");
        String email = CMUtility.readString(30,cust.getEmail());

        Customer newCust = new Customer(name,gender,age,phone,email);

        boolean isReplaced = customerList.replaceCustomer(number-1,newCust);
        if(isReplaced){
            System.out.println("--------------------顧客修正完了--------------------");
        }else{
            System.out.println("--------------------顧客修正失敗--------------------");
        }
    }

    private void deleteCustomer() {

        System.out.println("--------------------顧客削除--------------------");
        int number;

        for(;;){
            System.out.print("削除したい顧客番号を入力してください(-1退出): ");
            number = CMUtility.readInt();

            if(number == -1){
                return;
            }

            Customer cust = customerList.getCustomer(number-1);
            if(cust == null){
                System.out.println("ご指定の顧客を見つけませんでした。");
            }else{
                break;
            }
        }

        System.out.print("削除しますか(Y/N)： ");
        char isDelete = CMUtility.readConfirmSelection();
        if(isDelete == 'Y'){

            boolean deleteSuccess = customerList.deleteCustomer(number-1);
            if(deleteSuccess){
                System.out.println("--------------------顧客削除完了--------------------");
            }else{
                System.out.println("--------------------顧客削除失敗--------------------");
            }
        }else{
            return;
        }

    }

    private void addNewCustomer() {
        System.out.println("--------------------顧客追加--------------------");

        System.out.println("名前：");
        String name = CMUtility.readString(10);

        System.out.println("性別：");
        char gender = CMUtility.readChar();

        System.out.println("年齢：");
        int age = CMUtility.readInt();

        System.out.println("電話番号：");
        String phone = CMUtility.readString(13);

        System.out.println("メールアドレス：");
        String email = CMUtility.readString(30);

        Customer customer = new Customer(name,gender,age,phone,email);
        boolean isSuccess = customerList.addCustomer(customer);

        if(isSuccess){
            System.out.println("--------------------顧客追加完成--------------------");
        }else{
            System.out.println("--------------------顧客追加失敗--------------------");
        }

    }
}

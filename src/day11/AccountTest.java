package day11;

public class AccountTest {
    public static void main(String[] args) {

        Account acct = new Account(1122,20000,0.045);

        acct.withdraw(30000);
        System.out.println("取引後の残高は: " + acct.getBalance());

        acct.withdraw(2500);
        System.out.println("取引後の残高は: " + acct.getBalance());

        acct.deposit(3000);
        System.out.println("取引後の残高は: " + acct.getBalance());

        System.out.println("月利率は: " + (acct.getMonthlyInterest() * 100 + "%"));
    }
}

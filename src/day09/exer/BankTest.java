package day09.exer;

public class BankTest {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addCustomer("Jane", "Smith");

        bank.getCustomer(0).setAccount(new Account(2000));

        bank.getCustomer(0).getAccount().withdraw(500);

        double balance = bank.getCustomer(0).getAccount().getBalance();
        System.out.println("顧客" + bank.getCustomer(0).getFirstname() + "の口座残高は: " + balance);

        System.out.println("********************");

        bank.addCustomer("Jonathon", "Smith");

        System.out.println("銀行顧客の数は: " + bank.getNumberOfCustomers());

    }
}

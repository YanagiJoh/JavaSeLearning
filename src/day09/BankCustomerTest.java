package day09;

public class BankCustomerTest {
    public static void main(String[] args) {

        BankCustomer cust = new BankCustomer("Jane", "Smith");

        Account acct = new Account(1000, 2000, 0.0123);

        cust.setAccount(acct);

        cust.getAccount().withdraw(100);
        cust.getAccount().deposit(960);
        cust.getAccount().deposit(2000);

        System.out.println("Customer[" + cust.getLastname() + "," + cust.getFirstname() + "] has a account : id is " +
                cust.getAccount().getId() + ",annualInterestRate is " + cust.getAccount().getAnnualInterestRate() * 100 +
                "%,balance is " + cust.getAccount().getBalance());

    }
}

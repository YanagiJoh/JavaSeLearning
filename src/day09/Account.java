package day09;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount) {

        if (balance < amount) {
            System.out.println("残高不足");
            return;
        }

        balance -= amount;
        System.out.println("引き出し金額: " + amount);

    }

    public void deposit(double amount) {

        if(amount>0) {
            balance += amount;
            System.out.println("預け入れ金額: " + amount);
        }
    }
}

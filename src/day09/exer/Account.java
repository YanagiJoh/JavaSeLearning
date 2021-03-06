package day09.exer;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("預け入れ成功");
        }
    }

    public void withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
            System.out.println("引落し成功");
        } else {
            System.out.println("残高不足");
        }
    }
}

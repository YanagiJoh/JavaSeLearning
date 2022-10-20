package day11;

public class CheckAccount extends Account {

    private double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate,double overdraft){
        super(id,balance,annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    @Override
    public void withdraw(double amount){
        if(getBalance() >= amount){
            //setBalance(getBalance() - amount);
            super.withdraw(amount);
        }else if(overdraft >= amount - getBalance()){

            overdraft -= (amount - getBalance());
            //setBalance(0);
            super.withdraw(getBalance());
        }else{
            System.out.println("借越可能な金額を超えました。");
        }

    }
}

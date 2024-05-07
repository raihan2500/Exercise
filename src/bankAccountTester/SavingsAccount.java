package bankAccountTester;

public class SavingsAccount {
    private double balance, interest;

    public SavingsAccount(){
        balance = 0;
        interest = 0;
    }

    public SavingsAccount(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void addInterest(){
        balance = balance + balance * (interest / 100);
    }

    public double getBalance() {
        return balance;
    }
}

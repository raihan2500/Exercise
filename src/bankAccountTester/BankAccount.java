package bankAccountTester;

public class BankAccount {
    private double balance;

    public BankAccount(){
        balance = 0;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double deposit){
        balance = balance + deposit;
    }

    public void withdraw(double withdrawAmount){
        if(withdrawAmount <= balance){
            System.out.println("Successfully withdraw " + withdrawAmount);
            balance = balance - withdrawAmount;
            return ;
        }
        System.out.println("Insufficient balance");
    }

    public void addInterest(double rate){
        balance = balance + balance * (rate / 100);
    }

    public double getBalance() {
        return balance;
    }
}

package bankAccountTester;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount person1 = new BankAccount();
        BankAccount momSavings = new BankAccount(1000);


        person1.deposit(1000);
        System.out.println(person1.getBalance());

        person1.withdraw(5000000);

        person1.withdraw(500);
        System.out.println(person1.getBalance());

        person1.withdraw(400);
        System.out.println(person1.getBalance());

        person1.withdraw(53.3424);
        System.out.println(person1.getBalance());

        momSavings.addInterest(10);
        System.out.println(momSavings.getBalance());

    }
}

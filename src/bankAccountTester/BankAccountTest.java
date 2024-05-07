package bankAccountTester;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount momSavings = new BankAccount(1000);
    SavingsAccount person = new SavingsAccount(1000,10);

    @Test
    void checkMomBalance(){
        assertEquals(1000, momSavings.getBalance());
    }

    @Test
    void checkMomBalanceAfterAddingInterest(){
        momSavings.addInterest(10);
        assertEquals(1100, momSavings.getBalance());
    }

    @Test
    void checkPersonBalance(){
        person.addInterest();
        assertEquals(1100, person.getBalance());
    }
}
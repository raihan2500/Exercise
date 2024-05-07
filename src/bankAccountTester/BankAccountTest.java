package bankAccountTester;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount momSavings = new BankAccount(1000);

    @Test
    void checkMomBalance(){
        assertEquals(1000, momSavings.getBalance());
    }

    void checkMomBalanceAfterAddingInterest(){
        momSavings.addInterest(10);
        assertEquals(1100, momSavings.getBalance());
    }
}
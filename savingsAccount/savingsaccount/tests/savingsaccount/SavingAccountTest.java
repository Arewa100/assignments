package savingsaccount;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavingAccountTest {
    @Test
    public void testThatSavingAccountExist() {
        assertNotNull(new SavingAccount());
    }
    @Test
    public void testThatSavingsAccountBalanceIsZero() {
        SavingAccount savingAccount = new SavingAccount();
        assertEquals(0, savingAccount.getBalance());
    }
    @Test
    public void testThatSavingsAccountCanDeposit_2000_and_Savings_Will_Be_2k() {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.deposit(2000);
        assertEquals(2000, savingAccount.getBalance());
    }
}

package savingsaccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    @Test
    public void testThatDepositCanDepositAnotherAmountAfterInitialDeposit_2000_and_Savings_Will_Be_2k() {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.deposit(2000);
        savingAccount.deposit(2000);
        assertEquals(4000, savingAccount.getBalance());
    }
    @Test
    public void testThatANegativeAmountCannotBeDeposited() {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.deposit(2000);
        assertEquals(2000, savingAccount.getBalance());
        savingAccount.deposit(-2000);
        assertEquals(2000, savingAccount.getBalance());
    }
    @Test
    public void testThatAnnualInterestRateCanBeSetTo_4_Percent() {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.modifyInterestRate(4);
        assertEquals(4, savingAccount.getInterestRate());
    }
    @Test
    public void testThatNegativeInterestRateCannotBeSet() {
        SavingAccount savingAccount = new SavingAccount();
        assertThrows(IllegalArgumentException.class, ()-> savingAccount.modifyInterestRate(-1));
    }

    @Test
    public void testThatMonthlyInterestRateCanBeCalculated() {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.modifyInterestRate(4);
        savingAccount.deposit(2000);
        savingAccount.calculateMonthlyInterestRate();
        assertEquals(2666.6666666666665, savingAccount.getBalance());
        savingAccount.calculateMonthlyInterestRate();
        assertEquals(3555.555555555555, savingAccount.getBalance());
    }
}

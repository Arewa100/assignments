package bank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AccountTest {
    private Account account;

    @BeforeEach
    public void setUp() {
        account = new Account(1, "Folashade", "Idowu", "correctPin");
    }

    @Test
    public void testingToConfirmAccountExists() {
        assertEquals(0, account.getBalance(1, "correctPin"));
    }
    @Test
    public void testToDepositTwoThousandAndGetTwoThousandAsAccountBalance() {
        account.deposit(1, 2_000, "correctPin");
        assertEquals(2_000, account.getBalance(1, "correctPin"));
    }
    @Test
    public void testToConfirmIfDepositCanBeDoneWhenTheWrongPinIsUsed() {
        account.deposit(1, 2_000, "correctPin");
        assertEquals(2_000, account.getBalance(1, "correctPin"));
        account.deposit(1, 1000, "wrongPin");
        assertEquals(2000, account.getBalance(1, "correctPin"));
    }
    @Test
    public void testToDepositAThousandAndGetTwoThousandAsAccountBalance() {
        account.deposit(1, 2_000, "correctPin");
        assertEquals(2_000, account.getBalance(1, "correctPin"));
        account.deposit(1, 1000, "correctPin");
        assertEquals(3000, account.getBalance(1, "correctPin"));
    }
    @Test
    public void testToDepositMinusTwoThousandAndAccountBalanceRemainsTheSame() {
        account.deposit(1, 2_000, "correctPin");
        assertEquals(2_000, account.getBalance(1, "correctPin"));
        account.deposit(1, -2000, "correctPin");
        assertEquals(2000, account.getBalance(1, "correctPin"));
    }
    @Test
    public void testToDepositTwoThousandAndWithdrawFiveThousandWhenBalanceIsTwoThousand() {
        account.deposit(1, 2_000, "correctPin");
        assertEquals(2000, account.getBalance(1, "correctPin"));
        account.withdraw(1, 5000, "correctPin");
        assertEquals(2000, account.getBalance(1, "correctPin"));
    }
    @Test
    public void testToDepositTwoThousandAndWithdrawOneThousand() {
        account.deposit(1, 2_000, "correctPin");
        assertEquals(2_000, account.getBalance(1, "correctPin"));
        account.withdraw(1, 1000, "correctPin");
        assertEquals(1000, account.getBalance(1, "correctPin"));
    }
    @Test
    public void testToWithdrawANegativeAmount() {
        account.deposit(1, 2_000, "correctPin");
        assertEquals(2_000, account.getBalance(1, "correctPin"));
        account.withdraw(1, -1000, "correctPin");
        assertEquals(2000, account.getBalance(1, "correctPin"));
    }
    @Test
    public void testToWithdrawZeroAmount() {
        account.deposit(1, 2_000, "correctPin");
        assertEquals(2_000, account.getBalance(1, "correctPin"));
        account.withdraw(1, 0, "correctPin");
        assertEquals(2000, account.getBalance(1, "correctPin"));
    }
    @Test
    public void testToWithdrawWithTheWrongPin() {
        account.deposit(1, 2_000, "correctPin");
        assertEquals(2_000, account.getBalance(1, "correctPin"));
        account.withdraw(1, 1000, "wrongPin");
        assertEquals(2000, account.getBalance(1, "correctPin"));
    }
    @Test
    public void testToDepositAndWithdrawWithTheWrongAccountNumber() {
        account.deposit(1, 2_000, "correctPin");
        assertEquals(2_000, account.getBalance(1, "correctPin"));
        account.deposit(2, 1000, "correctPin");
        assertEquals(2000, account.getBalance(1, "correctPin"));
    }
    @Test
    public void testToConfirmIfICanCheckBalanceWithWrongPinAndAccountNumber() {
        account.deposit(1, 2_000, "correctPin");
        assertEquals(2_000, account.getBalance(1, "correctPin"));
        assertEquals(0, account.getBalance(1, "wrongPin"));
    }
    @Test
    public void testToUpdateUserPinAndWithdrawWithTheNewPin() {
        account.deposit(1, 2_000, "correctPin");
        assertEquals(2000, account.getBalance(1, "correctPin"));
        account.updatePin("correctPin", "newPin");
        account.withdraw(1, 1000, "newPin");
        assertEquals(1000, account.getBalance(1, "newPin"));
    }
    @Test
    public void testToConfirmIfNewPinIsUniqueAndNotOldPin() {
        account.deposit(1,2_000,"correctPin");
        assertEquals(2_000, account.getBalance(1, "correctPin"));
        assertThrows(IllegalArgumentException.class, () ->  account.updatePin("correctPin", "correctPin"));
        account.updatePin("correctPin", "newPin");
        account.withdraw(1, 1000, "newPin");
        assertEquals(1000, account.getBalance(1, "newPin"));
    }

}
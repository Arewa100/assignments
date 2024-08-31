package bank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AccountTest {
    private Account account;

    @BeforeEach
    public void setUp() {
        account = new Account("9086112841", "Folashade", "Idowu", "correctPin");
    }

    @Test
    public void testToGetAccountName() {
        assertEquals("Folashade Idowu", account.getAccountName());
    }
    @Test
    public void testToGetAccountNumber() {
        assertEquals("09086112841", account.getAccountNumber());
    }
    @Test
    public void testToConfirmAccountHasBeenCreatedByCheckingItsBalance() {
        assertEquals(0, account.getBalance("9086112841", "correctPin"));
    }
    @Test
    public void testToDepositTwoThousandAndGetTwoThousandAsAccountBalance() {
        account.deposit("9086112841", 2_000);
        assertEquals(2_000, account.getBalance("9086112841", "correctPin"));
    }
    @Test
    public void testToDepositAThousandAndGetTwoThousandAsAccountBalance() {
        account.deposit("9086112841", 2_000);
        assertEquals(2_000, account.getBalance("9086112841", "correctPin"));
        account.deposit("9086112841", 1_000);
        assertEquals(3_000, account.getBalance("9086112841", "correctPin"));
    }
    @Test
    public void testToDepositMinusTwoThousandAndAccountBalanceRemainsTheSame() {
        account.deposit("9086112841", 2_000);
        assertEquals(2_000, account.getBalance("9086112841", "correctPin"));
        account.deposit("9086112841", -2_000);
        assertEquals(2_000, account.getBalance("9086112841", "correctPin"));
    }
    @Test
    public void testToDepositTwoThousandAndWithdrawFiveThousandWhenBalanceIsTwoThousand() {
        account.deposit("9086112841", 2_000);
        assertEquals(2_000, account.getBalance("9086112841", "correctPin"));
        account.withdraw("9086112841", 5_000, "correctPin");
        assertEquals(2_000, account.getBalance("9086112841", "correctPin"));
    }
    @Test
    public void testToDepositTwoThousandAndWithdrawOneThousand() {
        account.deposit("9086112841", 2_000);
        assertEquals(2_000, account.getBalance("9086112841", "correctPin"));
        account.withdraw("9086112841", 1_000, "correctPin");
        assertEquals(1_000, account.getBalance("9086112841", "correctPin"));
    }
    @Test
    public void testToWithdrawANegativeAmount() {
        account.deposit("9086112841", 2_000);
        assertEquals(2_000, account.getBalance("9086112841", "correctPin"));
        account.withdraw("9086112841", -1_000, "correctPin");
        assertEquals(2_000, account.getBalance("9086112841", "correctPin"));
    }
    @Test
    public void testToWithdrawZeroAmount() {
        account.deposit("9086112841", 2_000);
        assertEquals(2_000, account.getBalance("9086112841", "correctPin"));
        account.withdraw("9086112841", 0, "correctPin");
        assertEquals(2_000, account.getBalance("9086112841", "correctPin"));
    }
    @Test
    public void testToWithdrawWithTheWrongPin() {
        account.deposit("9086112841", 2_000);
        assertEquals(2_000, account.getBalance("9086112841", "correctPin"));
        account.withdraw("9086112841", 1_000, "wrongPin");
        assertEquals(2_000, account.getBalance("9086112841", "correctPin"));
    }
    @Test
    public void testToDepositAndWithdrawWithTheWrongAccountNumber() {
        account.deposit("9086112841", 2_000);
        assertEquals(2_000, account.getBalance("9086112841", "correctPin"));
        account.withdraw("9086112843", 1_000, "correctPin");
        assertEquals(2_000, account.getBalance("9086112841", "correctPin"));
    }
    @Test
    public void testToConfirmIfWeCanCheckBalanceWithWrongPinAndAccountNumber() {
        account.deposit("9086112841", 2_000);
        assertEquals(2_000, account.getBalance("9086112841", "correctPin"));
        assertEquals(0, account.getBalance("9086112841", "wrongPin"));
    }
    @Test
    public void testToUpdateUserPinAndWithdrawWithTheNewPin() {
        account.deposit("9086112841", 2_000);
        assertEquals(2000, account.getBalance("9086112841", "correctPin"));
        account.updatePin("correctPin", "newPin");
        account.withdraw("9086112841", 1_000, "newPin");
        assertEquals(1_000, account.getBalance("9086112841", "newPin"));
    }
    @Test
    public void testToConfirmIfNewPinIsUniqueAndNotOldPin() {
        account.deposit("9086112841",2_000);
        assertEquals(2_000, account.getBalance("9086112841", "correctPin"));
        assertThrows(IllegalArgumentException.class, () ->  account.updatePin("correctPin", "correctPin"));
        account.updatePin("correctPin", "newPin");
        account.withdraw("9086112841", 1_000, "newPin");
        assertEquals(1_000, account.getBalance("9086112841", "newPin"));
    }

}
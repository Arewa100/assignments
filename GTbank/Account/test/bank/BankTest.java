package bank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BankTest {
    private Bank bank;
    private Account account;

    @BeforeEach
    public void setUp() {
        bank = new Bank();
        account = bank.createAccount("9086112841", "Folashade", "Wellington", "correctPin");
    }
    @Test
    public void testThatBankExists() {
        Bank bank = new Bank();
    }
    @Test
    public void testToCreateAnAccount() {
        assertEquals("Folashade Wellington", account.getAccountName());
    }
    @Test
    public void testToCheckNumberOfAccountCreated() {
       assertEquals(1, bank.getTotalAccount());
       account = bank.createAccount("9086112844", "Folashade", "Wellington", "correctPin");
       assertEquals(2, bank.getTotalAccount());
       assertEquals("Folashade Wellington", account.getAccountName());
       account = bank.createAccount("3127999995", "Olasoyin", "Miracle", "jeje");
       assertEquals(3, bank.getTotalAccount());
       assertEquals("Olasoyin Miracle", account.getAccountName());
    }
    @Test
    public void testToDepositTwoThousandInACreatedAccount() {
        assertEquals("Folashade Wellington", account.getAccountName());
        assertEquals(1, bank.getTotalAccount());
        bank.deposit("9086112841", 2000);
        assertEquals(2000, bank.checkBalance("9086112841", "correctPin"));
    }
    @Test
    public void testToGetAccountNameByAccountNumber() {
        assertEquals("Folashade Wellington", account.getAccountName());
        assertEquals(1, bank.getTotalAccount());
        assertEquals("Folashade Wellington", bank.getAccountByNumber("9086112841").getAccountName());

    }
    @Test
    public void testToCreateTwoAccountAndGetAccountNamesByAccountNumber() {
        assertEquals("Folashade Wellington", account.getAccountName());
        assertEquals(1, bank.getTotalAccount());
        assertEquals("Folashade Wellington", bank.getAccountByNumber("9086112841").getAccountName());
        bank.createAccount("3127536995","Bolarinwa", "Mystery", "1677");
        assertEquals(2, bank.getTotalAccount());
        assertEquals("Bolarinwa Mystery", bank.getAccountByNumber("3127536995").getAccountName());
    }
    @Test
    public void testToCheckThatSameAccountNumberDoesNotExist() {
        assertEquals("Folashade Wellington", account.getAccountName());
        assertThrows(IllegalArgumentException.class, ()-> bank.createAccount("9086112841", "Olasoyin", "Miracle", "1990"));
        assertEquals(1, bank.getTotalAccount());
    }
    @Test
    public void testToDeposit_5000_AndWithdraw_2000() {
        assertEquals("Folashade Wellington", account.getAccountName());
        bank.deposit("9086112841", 5000);
        assertEquals(5000, bank.checkBalance("9086112841", "correctPin"));
        bank.withdraw("9086112841", 2000, "correctPin");
        assertEquals(3000, bank.checkBalance("9086112841", "correctPin"));
    }
    @Test
    public void testToDeposit_5000_InFirstAccountAndTransfer_2000_ToSecondAccount() {
        assertEquals("Folashade Wellington", account.getAccountName());
        bank.deposit("9086112841", 5000);
        assertEquals(5000, bank.checkBalance("9086112841", "correctPin"));
        account = bank.createAccount("3127539955", "Miracle", "Olasoyin", "1990");
        assertEquals(0, bank.checkBalance("3127539955", "correctPin"));
        assertEquals(2, bank.getTotalAccount());
        bank.transferFrom("9086112841", "3127539955", 2000, "correctPin");
        assertEquals(3000, bank.checkBalance("9086112841", "correctPin"));
        assertEquals(2000, bank.checkBalance("3127539955", "1990"));
        bank.withdraw("3127539955", 1000, "1990");
        assertEquals(1000, bank.checkBalance("3127539955", "1990"));

    }
}
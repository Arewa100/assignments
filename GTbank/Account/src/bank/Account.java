package bank;

public class Account {

    private double balance;
    private String name;
    private String pin;
    private String accountNumber;

    public Account(String accountNumber, String firstName, String lastName, String pin) {
        name = firstName + " " + lastName;
        this.pin = pin;
        this.accountNumber = accountNumber;
    }
    public String getAccountName() {
        return name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void deposit(String accountNumber, int amount) {
        if(this.accountNumber.equals(accountNumber) && amount > 0) balance += amount;
    }
    public double getBalance(String accountNumber, String pin) {
        if(accountAndPinIsValid(accountNumber, pin)) {
            return balance;
        } else {
            return 0.0;
        }
    }

    public void withdraw(String accountNumber, int amount, String pin) {
        boolean accountBalanceIsSufficient = (amount > 0 && amount < balance);
        if(accountAndPinIsValid(accountNumber, pin) && accountBalanceIsSufficient) balance -= amount;
    }
    private boolean accountAndPinIsValid(String accountNumber, String pin) {
        boolean accountIsValidAndPinIsCorrect = (this.pin.equals(pin) && this.accountNumber == accountNumber);
        return accountIsValidAndPinIsCorrect ? true : false;
    }

    public void updatePin(String correctPin, String newPin) {
        if(pin.equals(correctPin) && pin.equals(newPin)) {
            throw new IllegalArgumentException("pin already exists...");
        }else {
            pin = newPin;
        }
    }
}
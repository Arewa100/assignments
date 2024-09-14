package savingsaccount;

public class SavingAccount {
    private double savingsAmount;

    public double getBalance() {
        return savingsAmount;
    }

    public void deposit(double amount) {
        this.savingsAmount = amount;
    }
}

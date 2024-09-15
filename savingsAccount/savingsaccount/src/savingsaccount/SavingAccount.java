package savingsaccount;

public class SavingAccount {
    private double savingsAmount;
    private double annualInterestRate;


    public double getBalance() {
        return savingsAmount;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            this.savingsAmount = this.savingsAmount + amount;
        }
    }

    public void modifyInterestRate(double annualInterestRate) {
        if(annualInterestRate > 0) {
            this.annualInterestRate = annualInterestRate;
        }else {
            throw new IllegalArgumentException("Interest rate must be greater than 0");
        }
    }

    public double getInterestRate() {
        return annualInterestRate;
    }

    public void calculateMonthlyInterestRate() {
        double monthlyIncrement = (savingsAmount * annualInterestRate) /12;
        savingsAmount = savingsAmount + monthlyIncrement;
    }
}

package savingsaccount;

public class SavingAccountMain {
    public static void main(String[] args) {
        System.out.println("\nWelcome to the savings account annual rate calculator");
        SavingAccount savingAccount = new SavingAccount();
        Input inputRequest = new Input();

        double savings;
        double annualInterestRate;
        int numberOfMonth;
        int numberOfYear;

        annualInterestRate = inputRequest.input("Enter the annual Interest Rate");
        savingAccount.modifyInterestRate(annualInterestRate);
        savings = inputRequest.input("enter the savingsAmount");
        savingAccount.deposit(savings);
        numberOfYear = (int)inputRequest.input("Enter the number of years");
        numberOfMonth = numberOfYear * 12;

        for(int count = 1; count <= numberOfMonth; count++) {
            savingAccount.calculateMonthlyInterestRate();
            System.out.printf("the balance at the end of %d month is %.2f %n%n", count, savingAccount.getBalance());
        }
    }
}

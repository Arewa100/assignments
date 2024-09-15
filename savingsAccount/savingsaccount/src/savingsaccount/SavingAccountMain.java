package savingsaccount;

import java.util.Scanner;

public class SavingAccountMain {
    public static void main(String[] args) {
        System.out.println("\nWelcome to the savings account annual rate calculator");
        SavingAccount savingAccount = new SavingAccount();
        Input inputRequest = new Input();
        Scanner input = new Scanner(System.in);

        double savings;
        double annualInterestRate;
        int numberOfMonth;
        int numberOfYear;

        annualInterestRate = inputRequest.input("Enter the annual Interest Rate");
        savingAccount.modifyInterestRate(annualInterestRate);
        savings = inputRequest.input("enter the savingsAmount");
        savingAccount.deposit(savings);

        System.out.println("Enter the number of years");
        numberOfYear = input.nextInt();
        numberOfMonth = numberOfYear * 12;

        int count = 1;
        while (count <= numberOfMonth) {

            savingAccount.calculateMonthlyInterestRate();
            System.out.printf("the balance at the end of %d month is %f %n%n", count, savingAccount.getBalance());

            count++;
        }
    }
}

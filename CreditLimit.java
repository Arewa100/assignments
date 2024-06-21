import java.util.Scanner;

public class CreditLimit {
	public static void main(String[] args) {
		System.out.println("Welcome to my Credit Limit Calculator, we are checking if your spending exceeded our credit limit");

	Scanner input = new Scanner(System.in);
		

		
		int sentinel = 0;

		while(sentinel != -1) {

		int accountNumber;
		int monthlyBalance;
		int itemsCharged;
		int creditApplied;
		int creditLimit;
		int newBalance;

		

		System.out.println("Enter your account number");
			accountNumber = input.nextInt();

		System.out.println("Enter balance at the begining of the month");
			monthlyBalance = input.nextInt();
		
		System.out.println("Enter the items charged for this month");
			itemsCharged = input.nextInt();

		System.out.println("Enter the total credit applied");
			creditApplied = input.nextInt();

		System.out.println("Enter the allowed credit limit");
			creditLimit = input.nextInt();
			
			sentinel = creditLimit;
		
		newBalance = (monthlyBalance + (itemsCharged - creditApplied));

		if(newBalance > creditLimit) {
			System.out.println("Credit limit exceeded\n\n");
}		else {
			System.out.printf("the new balance is %d%n", newBalance);
			System.out.println("Credit limit not exceeded, spend wisely\n\n");
}


}
}
}
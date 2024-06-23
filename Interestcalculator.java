import java.util.Scanner;

public class Interestcalculator {

	public static void main(String[] agrs) {
		System.out.println("Welcome to my interest calculator\n\n");

	Scanner input = new Scanner(System.in);


		float interest;
		float R;
		float balance;
		float result;
		

	System.out.println("Enter your balance: ");
		balance = input.nextFloat();

	System.out.println("Enter the annual interest rate");
		R = input.nextFloat();

		result = (R/1200);
		interest = balance * result;

	System.out.printf("The interest is %.2f\n", interest);
	
}
}

//this is a program to calculate interest written by Olasoyin Miracle
 /*THIS IS THE ALGORITHM
1: program to check the interest
2: take the balance to be "balance"
3: let the annualinterest rate be taken as R
4: to calculate the interest
5: divide the annual interest rate by 1200
6: store the value as "result"
7: multiply the balance by the "result"
8: store the value as out "interest
*/

//starting the code

import java.util.Scanner;

public class Interestcalculator {

	public static void main(String[] agrs) {
		System.out.println("Welcome to my interest calculator\n\n");

	Scanner input = new Scanner(System.in);

	//declaring variables
		float interest;
		float R;
		float balance;
		float result;
		

	//computing the result
	System.out.println("Enter your balance: ");
		balance = input.nextFloat();

	System.out.println("Enter the annual interest rate");
		R = input.nextFloat();

		result = (R/1200);
		interest = balance * result;

	System.out.printf("The interest is %.2f\n", interest);
	
}
}

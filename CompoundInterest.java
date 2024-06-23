//QUESTION 2.13
//this is a program used to calculate the compound interest on a savings account. Written by Olasoyin Miracle

/*THIS IS THE ALGORITHM
1: let the amount saved by taken as "amount"
2: where the annual interest rate is given as 3.75%
3: let the monthly interest rate be 0.0375 divided by 12 
4: the answer for monthly interest be 0.003125
5: use this to generate a formular
6: add 1 to the monthly interest and store its value as constantValue
7: create a variable called "varyingValue" that equates to the total after every month
8: add amount to varyingValue and multiply it by constantValue.
9: store the answer as the new value of the account
*/

//starting the program

import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
		System.out.println("welcome to my salary interest calculator, we are checking the salary after six months\n");

	Scanner input = new Scanner(System.in);

		//declaring the variables
			double amount;
			double constantValue;
			double varyingValue = 0;
			double result;
			String[] month = {"one", "two", "three", "four", "five", "six"}; // this is used to store the month names

		//computing the variables 
			System.out.println("Enter the Amount saved");
				amount = input.nextFloat();
				constantValue = (1 + 0.003125);
					
				//using the for loop
				for(int i = 0; i < 6; i++) {

				result = (amount + varyingValue) * constantValue;
			System.out.printf("the account value after %s month is %f%n", month[i], result);
				varyingValue = result;
				
				
				}
}
}
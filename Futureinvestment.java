// this is a program to calculate future investment, written by Olasoyin Miracle\

/*THIS IS THE ALGORITHM
1: Program to calculate future investment
2: let the amount invested be taken as "FutureInvestementValue"
3: let the interest rate be taken as "InterestRate"
4: add the interest rate with 1 and store its value in "result"
5: number of years is taken as "NumberOfyears"
6: let the  amount intvested be "InvestedAmount"
7: multiply the NumberofYears by 12
8: store the value in E
9: let the result be raised to power of E
10: store the result in "exponent"
11: Multiply the InvestedAmount by exponent
12: store the answer as the FutureInvestementValue
*/

//starting the program

import java.util.Scanner;

public class Futureinvestment {

	 static float power(float result, float E) {
		float i;
		float value = 1;
		for(i = 1; i<=E; ++i) {
			value = value * result;
}
		return value;
}

	public static void main(String[] agrs) {
		System.out.println("Welcome to my future investment calculator");
		
	Scanner input = new Scanner(System.in);
		
		//declaring the variables
			float FutureInvestementValue;
			float InvestedAmount;
			float InterestRate;
			float re;
			float NumberOfyears;
			float W;
			float Q;
			float exponent;

		//COMPUTING THE VARIABLES

	System.out.println("Enter your Investment rate");
		InterestRate = input.nextFloat();

	System.out.println("Enter the number of years");
		NumberOfyears = input.nextFloat();

	System.out.println("Enter your investment Ammount");
		InvestedAmount = input.nextFloat();

		W = (NumberOfyears * 12);
		re = (1 + InterestRate);
		exponent = power(re, W);

	FutureInvestementValue = (InvestedAmount * exponent);

	System.out.printf("Your future investment value is %.3f\n", FutureInvestementValue);


}
}
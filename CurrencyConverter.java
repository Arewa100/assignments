//QUESTION 3.31
//this is a program to convert one currency to another "dollar" to Chinese RMD. Written by Olasoyin Miracle
/*THIS IS THE ALGORITHM
1: Let the currency exchange rate be taken as "exchangeRate"
2: user should enter the exchange rate
3: select the currency you want to exchange by typring "0" or "1"
4: select 0 to convert from USD to RMD
5: enter the amount in USD
6: display the result in RMD
7: select 1 to convert from RMD to USD 
6: enter the amount in RMD
8: display the result in USD
9: if there is no selection, user should restart
*/

//starting the program

import java.util.Scanner;

public class CurrencyConverter {
	public static void main(String[] args) {
		System.out.println("welcome to my currency converter\n");

	Scanner input = new Scanner(System.in);

	//declaring the variables
		float exchangeRate;
		int value;
		float dollar;
		float result; //holds the converted amount
		float rmb;

	//computing the variables, i will be using a switch statement
		System.out.println("Enter the exchange rate from US dollars to Chinese RMB");
			exchangeRate = input.nextFloat();

		System.out.println("select the currency you want to exchange. Enter 0 to convert to USD to RMB or 1 to convert RMD to USD");
			value = input.nextInt();

		//using the switch statement
			switch(value) {
				case 0: 
					//writing the statements to convert dollars to RMB
					System.out.println("Enter ammount in dollars");
						dollar = input.nextFloat();
						result = (dollar * exchangeRate);
					System.out.printf("%.2f dollar is equivalent to %.2f yen", dollar, result); 
					break;

				case 1: 
					//writing the statement to convert RMB to dollar
					System.out.println("Enter the amount in chinese RMD");
					rmb = input.nextFloat();
					result = (rmb / exchangeRate);
					System.out.printf("%.2f yen is equivalent to %.2f dollars", rmb, result);
					break;

				default:
					System.out.println("Please ensure you select either 0 or 1");
				
}

		
}
}
import java.util.Scanner;

public class CurrencyConverter {
	public static void main(String[] args) {
		System.out.println("welcome to my currency converter\n");

	Scanner input = new Scanner(System.in);


		float exchangeRate;
		int value;
		float dollar;
		float result;
		float rmb;


		System.out.println("Enter the exchange rate from US dollars to Chinese RMB");
			exchangeRate = input.nextFloat();

		System.out.println("select the currency you want to exchange. Enter 0 to convert to USD to RMB or 1 to convert RMD to USD");
			value = input.nextInt();


			switch(value) {
				case 0: 

					System.out.println("Enter ammount in dollars");
						dollar = input.nextFloat();
						result = (dollar * exchangeRate);
					System.out.printf("%.2f dollar is equivalent to %.2f yen", dollar, result); 
					break;

				case 1: 
					
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
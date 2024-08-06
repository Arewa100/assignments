import java.util.Scanner;
import java.util.Arrays;
public class CreditCard {
	public static void main(String[] args) {
	
		System.out.println("WELCOME TO THE CREDIT CARD VALIDATOR\n");

	Scanner input = new Scanner(System.in);
	ValidationFunction feedback = new ValidationFunction();
	String cardNumber = "";
	String[] cardData = new String[4];

	String flag = "";
	
	while(!flag.equals("no")) {
	
		System.out.print("Enter your credit card number:  ");
			cardNumber = input.next();

			cardData = feedback.card(cardNumber);
			
			System.out.printf("Credit Card Type: %s %n", cardData[0]);
			System.out.printf("Credit Card Number: %s %n", cardData[1]);
			System.out.printf("Credit Card Digit Length: %s %n", cardData[2]);
			System.out.printf("Credit Card Validity Status: %s %n", cardData[3]);

	
		System.out.print("Enter yes to continue or no to end the app: \n");
			flag = input.next();
	}
}
}
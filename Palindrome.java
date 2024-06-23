import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println("Welcome to my Palindrome number checker");

	Scanner input = new Scanner(System.in);

		
		
			int value1;
			int number;

	System.out.println("Enter any three digit");
			number = input.nextInt();

			value1 = (number % 10);
			number = (number / 100);
			
	if(value1 == number) {
		System.out.print("Your digit is Palindrome");
		
}	else {
		System.out.print("Your digit is not palindrome, enter a new digit");
}

}
}
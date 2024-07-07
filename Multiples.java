import java.util.Scanner;

public class Multiples {
	public static void main(String[] args) {
		System.out.println("Welcome to my multiples code");
	
	Scanner input = new Scanner(System.in);
	
		
	int firstNumber;
	int secondNumber;
	int multipleOfFirstNumber;
	int multipleOfSecondNumber;
	
	int comparisonOfNumbers;

	System.out.println("Enter the first number");
		firstNumber = input.nextInt();
	System.out.println("Enter the second number");
		secondNumber = input.nextInt();
		
	multipleOfFirstNumber = (firstNumber * firstNumber * firstNumber);
	multipleOfSecondNumber = (secondNumber * secondNumber);
	int result = (multipleOfFirstNumber % multipleOfSecondNumber);

	if(result == 0) {	
		System.out.println("the result is true");
}	else {
		System.out.println("the result is false");
}
}
}
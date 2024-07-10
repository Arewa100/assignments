import java.util.Scanner;

public class Mytest {
	public static void main(String[] args) {
		System.out.println("Welcome to my multiplication calculator built without using the \'*\' sign");
	
	Scanner input = new Scanner(System.in);
	MultipliCation calculator = new MultipliCation();
		int firstNumber;
		int secondNumber;

		System.out.print("Enter firsts number: ");
			firstNumber = input.nextInt();
		System.out.print("Enter second number: ");
			secondNumber = input.nextInt();
		
		int result = calculator.multiply(firstNumber, secondNumber);
		System.out.printf("the product of the two numbers is %d%n", result);
		
	
}
}
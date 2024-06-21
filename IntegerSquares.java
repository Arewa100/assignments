import java.util.Scanner;

public class IntegerSquares {
	public static void main(String[] args) {
		System.out.println("Welcome to my integer square caculator");
		
	Scanner input = new Scanner(System.in); 
		
	
		int firstNumber;
		int secondNumber;
		int firstNumberSquare;
		int secondNumberSquare;
		int sum;
		int difference;

	
		System.out.println("Enter the first number");
			firstNumber = input.nextInt();

		System.out.println("Enter the second number");
		        secondNumber = input.nextInt();
	
		firstNumberSquare = (firstNumber * firstNumber);
			System.out.printf("the square of the first number is %d%n", firstNumberSquare);
		secondNumberSquare = (secondNumber * secondNumber);
			System.out.printf("the square of the second number is %d%n", secondNumberSquare);
			
		sum = (firstNumberSquare + secondNumberSquare);
		difference = (firstNumberSquare - secondNumberSquare);
		
		System.out.printf("the sum of the square is %d%n", sum);
		System.out.printf("the difference of the squares is %d", difference);

}
}
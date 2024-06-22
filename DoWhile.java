import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		System.out.println("Welcome to my do while loop code");
		
	Scanner input = new Scanner(System.in);
	
	char continuation;
	do {
		int firstNumber;
		int secondNumber;
		int sum;

		

	System.out.println("Enter a firstNumber");
		firstNumber = input.nextInt();

	System.out.println("Enter the secondNumber");
		secondNumber = input.nextInt();

		sum = (firstNumber + secondNumber);
	System.out.printf("the sum of the two inputs is %d%n", sum);
		
	System.out.println("to continue press c");
		continuation = input.next().charAt(0);
		
			
} while(continuation == 'c');
}
}
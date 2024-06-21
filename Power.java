import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		System.out.println("welcome. we are finding the value of a number raised to the power of another");
	
	Scanner input = new Scanner(System.in);
		
		int firstNumber;
		int secondNumber;
		int counter = 0;
		int power = 1;	

	System.out.println("Enter the first number");
		firstNumber = input.nextInt();

	System.out.println("Enter the second number");
		secondNumber = input.nextInt();

		
		while(counter < secondNumber) {
			
			power = power * firstNumber;
			
			counter = counter + 1;
				
}
	System.out.printf("the value of first number raised to the power of another is %d", power);
}
}
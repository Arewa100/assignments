import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] agrs) {
		System.out.println("Welcome to the arithmetic calculator");

	Scanner input = new Scanner(System.in);

	
		int firstInteger;
		int secondInteger;
		int X; 
		int Y; 
		int ADD; 
		int SUB;


		System.out.println("Enter the first integer");
			firstInteger = input.nextInt();

		System.out.println("Enter the second integer");
			secondInteger = input.nextInt();
		
		X = (firstInteger * firstInteger);
		Y = (secondInteger * secondInteger);

		System.out.printf("The square of the first integer is %d\n", X);
		System.out.printf("The square of the second integer is %d\n", Y);

		ADD = (X + Y);
		SUB = (X - Y);
		
		System.out.printf("The sum of square of the first integer is %d\n", ADD);
		System.out.printf("The difference of square of the second integer is %d\n", SUB);

}
}

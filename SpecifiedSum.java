import java.util.Scanner;

public class SpecifiedSum {
	public static void main(String[] args) {
		System.out.println("Welcome to my number specifier");
		
	Scanner input = new Scanner(System.in);
	

		int integers = 0;
		int sum = 0;
		int number;

	System.out.println("Enter a number value");
		number = input.nextInt();
		
		while(sum != number && sum < number) {

			System.out.println("Enter any integer");
				integers = input.nextInt();

			sum = sum + integers;

		
}
	System.out.printf("the sum %d is greater or equal to the value input at the begining which is %d%n", sum, number);
}
}
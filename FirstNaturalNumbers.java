import java.util.Scanner;

public class FirstNaturalNumbers {
	public static void main(String[] args) {
		System.out.println("Welcome. we are calculatting the sum of the first natural numbers");
	
	Scanner input = new Scanner(System.in);
			

	
		int number;
		int sentinel = 0;
		int sum = 0;

		System.out.println("Enter the the first natural number bettern 1 to 10");
			number = input.nextInt();

		while(number > sentinel && number < 11) {

			sum = sum + number;

		System.out.println("Enter natural number");
			number = input.nextInt();
						
}	
		System.out.printf("the sum of first natural number is %d", sum);
}
}
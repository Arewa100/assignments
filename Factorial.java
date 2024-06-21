import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Welcome to my factorial and exponential calculaor");

	Scanner input = new Scanner(System.in);
	
	//declaing the variables 
		int number;
		int counter = 0;
		int total = 1;
		int factorial = 0;

		System.out.println("Enter the any non negative integer to calcualte the factorial");
			number = input.nextInt();
		
		while(number > 0) {
			int div;
			div = number--;
			
			total = total * div;
		
	
			
}
		System.out.printf(" %d%n", total);
}
}
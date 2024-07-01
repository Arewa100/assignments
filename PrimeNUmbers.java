import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {

		System.out.println("Welcome to task three");
		
	Scanner input = new Scanner(System.in);
	
		int pnumber;
		int result;

			System.out.println("enter any number to check if it is a prime number");
				pnumber = input.nextInt();

		result = (pnumber % 2);
	
		if(result == 1) {
			System.out.println("this is a prime number");
} 		else {
			System.out.println("this is not a prime number");
}
}
}
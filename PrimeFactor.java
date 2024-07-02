import java.util.Scanner;

public class PrimeFactor {
	public static void main(String[] args) {
		System.out.println("Welcome my friend. You are the handicap you must face\n");
	
	Scanner input = new Scanner(System.in);

		int number;
		int counter = 1;
		int factor = 0;
		int numberOffactors = 0;
		
	System.out.println("Enter a number");
		number = input.nextInt();

		while(counter <= number) {
			
			int theArgument = (number % counter);
		
		if(theArgument == 0 && counter != 1) {

			//factor = counter;
			//System.out.println(factor);
			numberOffactors = numberOffactors + 1;
}
		counter = counter + 1;
}
		if(numberOffactors == 1) {
			System.out.printf("%d is a prime number", number);
}		else {
			System.out.printf("%d is not prime number", number);
}
}
}
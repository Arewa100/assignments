import java.util.Scanner;

public class FactorOfNumber {
	public static void main(String[] args) {
		System.out.println("Welcome my friend. You are the handicap you must face\n");
	
	Scanner input = new Scanner(System.in);

		int number;
		String name;
		int counter = 1;
		int factor = 0;
		int numberOffactors = 0;
		
	System.out.println("what is your name?\n");
		name = input.nextLine();
		
	System.out.printf("Welcome %s. Enter a number %n", name);
		number = input.nextInt();

		while(counter <= number) {
			
			int theArgument = (number % counter);
		
		if(theArgument == 0) {

			factor = counter;
			//System.out.println(factor);
			numberOffactors = numberOffactors + 1;
}
		counter = counter + 1;
}
		System.out.printf("the number of factor that can divide %d, is %d %n", number, numberOffactors);
}
}
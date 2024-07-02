import java.util.Scanner;

public class BreakCodeTwo {

	public static void main(String[] args) {
		System.out.println("Welcome. Today must be a very good day haha");
	
	Scanner input = new Scanner(System.in);
		
		int scores = 0;
		int counter;
		int oddNumbers = 0;
			
			

		for(counter = 1; counter <= 10; counter++ ) {

			System.out.println("Enter a score");
				scores = input.nextInt();

				if(scores % 2 == 0) {
					continue;
}
			oddNumbers = oddNumbers + scores;
			
			
}
			System.out.printf("the sum of even numbers is %d", oddNumbers);		
}
}
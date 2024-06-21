import java.util.Scanner;
	
public class Counts {
	public static void main(String[] args) {
		System.out.println("Welcome to postive, negative and zero integer counters");
		
	Scanner input = new Scanner(System.in);
		

		int number;
		int postiveCounter = 0;
		int negativeCounter = 0;
		int zeros = 0;
	
		System.out.println("Enter any postive, negative and zeros numbers");
		number = input.nextInt();

		while(number != 0) {
			
		if(number > 0) {
		postiveCounter += 1;
} 		else if (number < 0) {
		negativeCounter += 1;
}		else {
			zeros = zeros + 1;

}		System.out.println("Enter any postive, negative and zeros numbers");
		number = input.nextInt();
}
	
		System.out.printf(" the amount of postive integers entered is %d%n", postiveCounter);
		System.out.printf(" the amount of negative integers is %d%n", negativeCounter);
		System.out.printf("the number of zeros is %d%n", zeros);
}
}
import java.util.Scanner;

public class ComparingIntegers {
	public static void main(String[] agrs) {
		System.out.println("Welcome to my comparison checker");
		
	Scanner input = new Scanner(System.in);
	
	int number;
	int squareOfNumber;
	
	System.out.println("Enter any integer");
		number = input.nextInt();
	squareOfNumber = (number * number);
	
		if(number > 100 && squareOfNumber > 100) {
			System.out.printf("the number %d and its square %d is greater than 100 %n", number, squareOfNumber);

}		else if(number == 100) {
			System.out.println("the number is equal to 100"); 

}		else if(squareOfNumber == 100) {

			System.out.printf("the squareOfNumber is %d is equal to 100 %n", squareOfNumber);

}
		else if(number < 100 && squareOfNumber < 100) {

			System.out.printf("the number %d and square of it %d is less than 100", number, squareOfNumber);
}		

}
}
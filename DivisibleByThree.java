import java.util.Scanner;

public class DivisibleByThree {
	public static void main(String[] args) {
		System.out.println("welcome to my modulo checker. to check if a number is divisble by 3");

	Scanner input = new Scanner(System.in);

		int number;
		int moduloo;

		System.out.println("Enter an integer");
			number = input.nextInt();
		
		moduloo = (number % 3);
		int division = number / 3;

		if(moduloo == 0) {
			System.out.printf("%d is divisble by 3 and the result is %d", number, division);
}		else {
			System.out.printf("%d is not divisble by 3", number);
}
}
}
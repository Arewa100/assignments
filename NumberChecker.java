import java.util.Scanner;

public class NumberChecker {
	public static void main(String[] args) {
		System.out.println("Welcome to my largest and smallest number checker");
	
	Scanner input = new Scanner(System.in);
	
		int number;
		int value1;
		int value2;
		int value3;
		int value4;
		int value5;
		

		System.out.println("Enter any five digit number");
			number = input.nextInt();

		

		value1 = (number % 10);
		number = (number / 10);
		
		value2 = (number % 10);
		number = (number / 10);

		value3 = (number % 10);
		number = (number / 10);
		
		value4 = (number % 10);
		number = (number / 10);

		value5 = (number % 10);
		number = (number / 10);

		if(value1 > value2 && value1 > value3 && value1 > value4 && value1 > value5) {
			System.out.printf("%d is the largest %n", value1);

}		else if(value1 < value2 && value1 < value3 && value1 < value4 && value1 < value5) {
			System.out.printf("%d is the smallest %n", value1);

}		if(value2 > value1 && value2 > value3 && value2 > value4 && value2 > value5) {
			System.out.printf("%d is the largest %n", value2);

}		else if(value2 < value1 && value2 < value3 && value2 < value4 && value2 < value5) {
			System.out.printf("%d is the smallest %n", value2);

}		if(value3 > value1 && value3 > value2 && value3 > value4 && value3 > value5) {
			System.out.printf("%d is the largest %n", value3);

}		else if(value3 < value1 && value3 < value2 && value3 < value4 && value3 < value5) {
			System.out.printf("%d is the smallest %n", value3);

}		if(value4 > value1 && value4 > value2 && value4 > value3 && value4 > value5) {
			System.out.printf("%d is the largest %n", value4);

}		else if(value4 < value1 && value4 < value2 && value4 < value3 && value4 < value5) {
			System.out.printf("%d is the smallest %n", value4);

}		if(value5 > value1 && value5 > value2 && value5 > value3 && value5 > value4) {
			System.out.printf("%d is the largest %n", value5);

}		else if(value5 < value1 && value5 < value2 && value5 < value3 && value5 < value4) {
			System.out.printf("%d is the smallest", value5);
}


		
}
}
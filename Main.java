import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("welcome friend");
	
	Scanner input = new Scanner(System.in);

		int number;

		System.out.println("enter a number");
			number = input.nextInt();
		
		int ber = Kata.factorOf(number);
		
		
	//System.out.println(primeNumber);
		System.out.println(ber);
}
}
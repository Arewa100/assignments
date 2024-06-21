import java.util.Scanner;

public class TableOfSquaresCubes {
	public static void main(String[] args) {
		System.out.println("Welcome. this program outputs the squares and cube of numbers between 0 and 10");
	
	Scanner input = new Scanner(System.in);

		int number; 
		int square;
		int cube;
		
		int counter = 0;
		System.out.println("input numbers from 0 to 10");

	while(counter < 10) {
		number = input.nextInt();
		square = (number * number);
		cube = (number * number * number);
		
		counter = counter + 1;

		System.out.println("number    square     cube");
		System.out.printf("%d           %d       %d%n", number, square, cube);



}	
}
}
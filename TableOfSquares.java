public class TableOfSquares {
	public static void main(String[] args) {
		System.out.println("Welcome friend. my program prints the square and cube of numbers between 0 and 10 in a table");
	

	
		int number0, number1, number2, number3, number4, number5, number6, number7, number8, number9, number10;

		number0 = 0;
		number1 = 1;
		number2 = 2;
		number3 = 3;
		number4 = 4;
		number5 = 5;
		number6 = 6;
		number7 = 7;
		number8 = 8;
		number9 = 9;
		number10 = 10;
		int square0, square1, square2, square3 , square4 , square5 , square6, square7,square8 ,square9 ,square10;
		int cube0, cube1, cube2, cube3, cube4, cube5, cube6, cube7, cube8, cube9, cube10;
		
		square0 = (number0 * number0);
		cube0 = (number0 * number0 * number0);

		square1 = (number1 * number1);
		cube1 = (number1 * number1 * number1);

		square2 = (number2 * number2);
		cube2 = (number2 * number2 * number2);

		square3 = (number3 * number3);
		cube3 = (number3 * number3 * number3);

		square4 = (number4 * number4);
		cube4 = (number4 * number4 * number4);

		square5 = (number5 * number5);
		cube5 = (number5 * number5 * number5);

		square6 = (number6 * number6);
		cube6 = (number6 * number6 * number6);

		square7 = (number7 * number7);
		cube7 = (number7 * number7 * number7);

		square8 = (number8 * number8);
		cube8 = (number8 * number8 * number8);

		square9 = (number9 * number9);
		cube9 = (number9 * number9 * number9);

		square10 = (number10 * number10);
		cube10 = (number10 * number10 * number10);
		
		System.out.println("number    square    cube");
		System.out.printf("%d		%d	%d%n", number0, square0, cube0);
		System.out.printf("%d		%d	%d%n", number1, square1, cube1);
		System.out.printf("%d		%d	%d%n", number2, square2, cube2);
		System.out.printf("%d		%d	%d%n", number3, square3, cube3);
		System.out.printf("%d		%d	%d%n", number4, square4, cube4);
		System.out.printf("%d		%d	%d%n", number5, square5, cube5);
		System.out.printf("%d		%d	%d%n", number6, square6, cube6);
		System.out.printf("%d		%d	%d%n", number7, square7, cube7);
		System.out.printf("%d		%d	%d%n", number8, square8, cube8);
		System.out.printf("%d		%d	%d%n", number9, square9, cube9);
		System.out.printf("%d		%d	%d%n", number10, square10, cube10);
}
}
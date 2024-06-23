//program to display the square of two integers, sum of their squares and difference by Olasoyin Miracle

/*THIS IS THE ALGORITHM
1: let the first integer be taken as "firstInteger"
2: let the second integer be taken as "secondInteger"
3: multiply the  firstInteger by firstInteger
4: store the value in X	
5: multiply the  secondInteger by secondInteger
6:  store the value in Y
7: diaplay the squares
8: add X and Y 
9: store its result in ADD
10: Substract Y from X
11: store the value in SUB
12: display ADD as the sum of their squares
13: display SUB as difference of their squares
*/

// starting the prodgram

import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] agrs) {
		System.out.println("Welcome to the arithmetic calculator");

	Scanner input = new Scanner(System.in);

	//declaring the variables
		int firstInteger;
		int secondInteger;
		int X; //to store square of the first integer
		int Y; // to store squsre of the second integer
		int ADD; 
		int SUB;

	//computing the variables 
		System.out.println("Enter the first integer");
			firstInteger = input.nextInt();

		System.out.println("Enter the second integer");
			secondInteger = input.nextInt();
		
		X = (firstInteger * firstInteger);
		Y = (secondInteger * secondInteger);

		System.out.printf("The square of the first integer is %d\n", X);
		System.out.printf("The square of the second integer is %d\n", Y);

		ADD = (X + Y);
		SUB = (X - Y);
		
		System.out.printf("The sum of square of the first integer is %d\n", ADD);
		System.out.printf("The difference of square of the second integer is %d\n", SUB);

}
}

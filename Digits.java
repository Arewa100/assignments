//program to read integer between 0 and 1000 and add all the digits of the integer written by Olasoyin Miracle

/* THIS IS THE ALGORITHM
1: To read the integer between 0 and 1000
2: let the integer be taken as "numbers"
3: check if the integer is greater than 0 and lesser than 1000
4: proceed to check the remainder
5: check the  remainder by using the modulo operator % 
6: store the answer in "x"
7: divide the "numbers" by 10 
8: store the result in x
9: add "x" and "y" 
10: store the result in sum
11: this is the sum of digits
*/

//writing the program 
import java.util.Scanner;

	public class Digits {
		public static void main(String[] agrs) {
		System.out.println("Welcome to my world");

	Scanner input = new Scanner(System.in); // creating a scanner object

		//declaring variables
		int numbers;
		int x;
		int y;
		int sum;

	//checking the sum of the integers

	System.out.println("Enter any number between 0 and 1000");
		numbers = input.nextInt(); //extracting the input 

	if(numbers > 0 && numbers < 1000) { //reading the number if it is lesser 1000
		x = numbers/10; 
		y = (numbers % 10); //giving the remainder

		sum = x + y;
		
		System.out.printf("the result is %d\n", sum);
		
	} else {
	System.out.println("Number is Invalid");
}
		
}

}
	
//A program to convert value in feet to meters written by Olasoyin Miracle

/*THIS IS THE ALGORITHM
1: firstly let the value in feet be taken as "x"
2: let the result in meters be "result"
3: let the constant be given as 0.305
4: to convert x to meters 
5: multply x by 0.305
6: store the answer in " result"
*/

//starting the code
import java.util.Scanner;

public class Feetconverter {
	public static void main(String[] agrs) {
		System.out.println("welcome to my converter");
		
	Scanner input = new Scanner(System.in);

	//Declaring variables
	double x;
	double result; // this will be in meters
	
	//CONVERTION
	System.out.println("Enter any number in feet");
	x = input.nextDouble();

	result = (x * 0.305);
	
	System.out.printf("%f is %f meters\n", x, result);
	
	
}
	
}
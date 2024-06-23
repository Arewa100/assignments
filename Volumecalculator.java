//QUESTION 2.2

// this is a program to calculate the volume of a equilateral triangle written by Olasoyin Miracle

/* THIS IS THE ALGORITHM
1: let the area of the triangle be taken as "area" 
2: take the length of sides to be "length"
3: multiply "length" of sides twice
4: find the square root of 3. this is equivalent to 
5: divide the square root by 4
6: store the answer in result
7: multiply the result by square of the sides
8: store the answer in "area"
9: multiply "area" by length
*/

//starting the program

import java.util.Scanner;

public class Volumecalculator {

	public static void main(String[] args) {
		System.out.println("welcome to my equilateral triangle volume calculator");

	Scanner input = new Scanner(System.in); //creating an object instance 

		//declaring the variables
		double area;
		double length;
		double result;
		double volume;
		double root; //storing the answer of square root of 3 divided by

	//computing the variables
		System.out.println("Enter the length of the sides of the triangle");
			length = input.nextFloat();
		
		result = (length * length);
		
		root = (1.7321/4);
		area = (root * result);
		volume = (area * length);

		System.out.printf("the area of the equilateral triangle is %.4f%n", area);
		System.out.printf("the volume of the equilateral prism triange is %.4f%n", volume);
}
}
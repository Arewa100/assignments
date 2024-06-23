//this is a code to calculate the minimum run way length needed by an airplane. Written by Olasoyin Miracle

/*THIS IS THE ALGORITHM
1: program to calculate runway length
2: let the plane acceleration be "acceleration"
3: let the airplane velocity be "velocity"
4: let the square of the velocity be V
5: multiply the acceleration by 2
6: store its result as A
7: divide V by A 
8: store the result as "length" 
9: this is the minimum run way length
*/

//begining of the program

import java.util.Scanner;

public class Runwaylength {
	public static void main(String[] agrs) {
		System.out.println("Welcome to my runway calculator");

	Scanner input = new Scanner(System.in);
		
	//declaring variables
		float acceleration;
		float velocity;
		float V;
		float A;
		float length;

	//computing the calculations
	System.out.println("Enter the acceleration of the airplane");
		acceleration = input.nextFloat();
	System.out.println("Enter the velocity of the airplane");
		velocity = input.nextFloat();

		V = (velocity * velocity);
		A = (acceleration * 2);

		length = (V/A);

	System.out.printf("the minimum runway length for the Airplane is %.3f\n", length);
}
}
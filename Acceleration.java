//this is a code to calculate the average acceleration of a body. Written by Olasoyin Miracle

/* THIS IS THE ALGORITHM
1: program to calculate the average acceleration of a body
2: take the starting velocity as "startVelocity"
3: take the starting velocity as "finalVelocity"
4: let the time taken be "timeTaken"
5; substract the startVelocity from finalVelocity
6: store the answer in "result"
7: average acceleration is equal to result divided by the timetaken
*/

//begining of the code

import java.util.Scanner;

public class Acceleration {
	public static void main(String[] agrs) {
		System.out.println("welcome to my acceleration calculator");

	Scanner input = new Scanner(System.in);  //this is the object instance 

	//DECLARING THE VARIABLES
		float startVelocity;
		float finalVelocity;
		float timeTaken;
		float result;
		float AVG; // this is the average acceleration

		// computing the acceleration
	System.out.println("Enter the start velocity");
		startVelocity = input.nextFloat();

	System.out.println("Enter the final velocity");
		finalVelocity = input.nextFloat();

	System.out.println("Enter the time taken");
		timeTaken = input.nextFloat();

		result = (finalVelocity - startVelocity);
		AVG = (result / timeTaken);

	System.out.printf("the average acceleration is %.3f\n", AVG);
		
	
}
}


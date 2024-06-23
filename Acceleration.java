import java.util.Scanner;

public class Acceleration {
	public static void main(String[] agrs) {
		System.out.println("welcome to my acceleration calculator");

	Scanner input = new Scanner(System.in);  


		float startVelocity;
		float finalVelocity;
		float timeTaken;
		float result;
		float AVG; 


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


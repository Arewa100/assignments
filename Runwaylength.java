import java.util.Scanner;

public class Runwaylength {
	public static void main(String[] agrs) {
		System.out.println("Welcome to my runway calculator");

	Scanner input = new Scanner(System.in);
		
	
		float acceleration;
		float velocity;
		float V;
		float A;
		float length;

	
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
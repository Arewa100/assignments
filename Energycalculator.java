import java.util.Scanner;
public class Energycalculator {
	public static void main(String[] agrs) {
		System.out.println("welcome to my energy calculator");

	Scanner input = new Scanner(System.in); 

	
	float x;
	float initialTemp;
	float finalTemp;
	float sub;
	float Q; 


	
	System.out.println("Enter the amount of water in kilogram");
	x = input.nextFloat();

	System.out.println("Enter the inital temperature" );
	initialTemp = input.nextFloat();

	System.out.println("Enter the final temperature");
	finalTemp = input.nextFloat();
		
		sub = (finalTemp - initialTemp);
		Q = (x * sub * 4184);
		
	System.out.printf("The energy needed is %.3f\n", Q);

}
	
}
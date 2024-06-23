//this is a program to caclulate the energy needed to heat water from initial temp to final temp, written by Olasoyin Miracle

/*THIS IS THE ALGORITHM
1: program to calculate energy
2: let the amount of water in kilograms be "x"
3: let the initial temperature be "initialTemp
4: let the final temperature be "finalTemp
5: let "sub" be the substraction of initialTemp from finalTtemp
6: multiply the "sub" by amount of water in kilogram "x" and by 4184
7: store the answer as 'Q" 
8: this is the energy needed 
*/

//starting the code
import java.util.Scanner;
public class Energycalculator {
	public static void main(String[] agrs) {
		System.out.println("welcome to my energy calculator");

	Scanner input = new Scanner(System.in); //creating the object instance of Scanner

	//Declaring variables
	float x;
	float initialTemp;
	float finalTemp;
	float sub;
	float Q; //energy needed to heat up water

	//CALCULATING THE ENERGY
	
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
// this is a program to calculate BMI , body mass index. Written by Olasoyin Miracle
/* THIS IS THE ALGORITHM
1: program to calculate body mass index
2: let the weight in pounds be Wb
3: let the height in meters be Hm
4: convert the weight in pounds to kilograms
5: store the result as "weight"
6: convert the height in inches to meters
7: store the result as "height"
8: square the height 
9: divide the weight by square of the height
10: Store the result in "BMI"
*/

//begining the program
import java.util.Scanner;

public class Bmicalculator {
	public static void main(String[] agrs) {
		System.out.println("welcome to my BMI calculator");

	Scanner input = new Scanner(System.in);
	//DECLARING THE VARIABLES
	
		double Wb;
		double Hm;
		double weight;
		double height;
		double BMI;

	//computing the bmi
		System.out.println("Enter your weight in pounds");
		Wb = input.nextDouble();
		System.out.println("Enter your height in inches");
		Hm = input.nextDouble();

		//converting weight in pounds to kilogram and height to meters
		weight = ( Wb * 0.45359237);
		height = ( Hm * 0.0254);
		BMI = weight / (height * height);

	System.out.printf("Your body mass index is %.3f\n", BMI);

	
}
}
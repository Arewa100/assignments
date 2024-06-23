import java.util.Scanner;

public class Bmicalculator {
	public static void main(String[] agrs) {
		System.out.println("welcome to my BMI calculator");

	Scanner input = new Scanner(System.in);
	
		double Wb;
		double Hm;
		double weight;
		double height;
		double BMI;


		System.out.println("Enter your weight in pounds");
		Wb = input.nextDouble();
		System.out.println("Enter your height in inches");
		Hm = input.nextDouble();


		weight = ( Wb * 0.45359237);
		height = ( Hm * 0.0254);
		BMI = weight / (height * height);

	System.out.printf("Your body mass index is %.3f\n", BMI);

	
}
}
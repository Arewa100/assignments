import java.util.Scanner;

public class Volumecalculator {

	public static void main(String[] args) {
		System.out.println("welcome to my equilateral triangle volume calculator");

	Scanner input = new Scanner(System.in); 

		
		double area;
		double length;
		double result;
		double volume;
		double root; 

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
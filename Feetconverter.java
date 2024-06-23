import java.util.Scanner;

public class Feetconverter {
	public static void main(String[] agrs) {
		System.out.println("welcome to my converter");
		
	Scanner input = new Scanner(System.in);

	double x;
	double result; 
	
	System.out.println("Enter any number in feet");
	x = input.nextDouble();

	result = (x * 0.305);
	
	System.out.printf("%f is %f meters\n", x, result);
	
	
}
	
}
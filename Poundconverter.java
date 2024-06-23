import java.util.Scanner;

public class Poundconverter {
	public static void main(String[] agrs) {
		System.out.println("welcome to my pound converter");

	Scanner input = new Scanner(System.in);

	
		double pound;
		double kilo;
		
		
	System.out.println("Enter the amount in pound");
		pound = input.nextDouble();

		kilo = (pound * 0.454);

	System.out.printf("%f pound is %.4f kilograms\n", pound, kilo);
}
}
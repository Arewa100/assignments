//this is a program to convert pound to kilograms
/* THIS IS THE ALGORITHM
1: program to convert pounds to kg
2: let the number in pounds be taken as "pound"
3: let the value in kilogranms be taken as "kilo"
4: convert the pounds to kilogram
5: multiply pound by 0.454
6: store the result in "kilo" as the result of pounds in kilogram
*/


//begining of the program 
import java.util.Scanner;

public class Poundconverter {
	public static void main(String[] agrs) {
		System.out.println("welcome to my pound converter");

	Scanner input = new Scanner(System.in);

	//declaring the variables
		double pound;
		double kilo;
		
		//computing the variables
	System.out.println("Enter the amount in pound");
		pound = input.nextDouble();

		kilo = (pound * 0.454);

	System.out.printf("%f pound is %.4f kilograms\n", pound, kilo);
}
}
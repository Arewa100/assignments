//this is a program to display the cost of trip of a car use written by Olasoyin Miracle

/*THIS IS THE ALGORITHM
1: program to display the cost of trip
2: let the distance be taken as "dist"
3: let the miles covered by one gallon be taken as "M"
4: let the price of one gallon be taken as "price_per_gallon"

 //to calculate the cost of trip

5: distance "dist" is divided by "M" to give the total gallon used
6: store the answer in "result"
6; to get the cost, multiply the "result" gotten by price of one gallon
8: the answer is equals to the Cost of trip covered by the user.
*/

//begining of the program

import java.util.Scanner;

public class Costoftrip {


	public static void main(String[] agrs) {
		System.out.println("WELCOME");

	Scanner input = new Scanner(System.in); // creating a scanner object, input
		
		//declaring the variables
		float dist;
		float M;
		float price_per_gallon;
		float result;
		float cost;

		System.out.println("Enter the driving distance: ");
		dist = input.nextFloat();

		System.out.println("Enter the miles covered by one gallon");
		M = input.nextFloat();

		System.out.println("Enter the price for one gallon");
		price_per_gallon = input.nextFloat();

		//calculating the result
		
		result = (dist/M);

		cost = (result * price_per_gallon);

		//displaying the cost
		System.out.printf("the cost of trip is %f\n", cost);
		

}
	
}
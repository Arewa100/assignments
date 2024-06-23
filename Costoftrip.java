import java.util.Scanner;

public class Costoftrip {


	public static void main(String[] agrs) {
		System.out.println("WELCOME");

	Scanner input = new Scanner(System.in);
		
		
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

		
		
		result = (dist/M);

		cost = (result * price_per_gallon);

	
		System.out.printf("the cost of trip is %f\n", cost);
		

}
	
}
import java.util.Scanner;

public class MilesPerGallon {
	public static void main(String[] args) {
		System.out.println("welcome to my mileage analysis ");

	Scanner input = new Scanner(System.in);
	
		
		int gallons;
		int miles;
	
		int counter = 0;
		float totalMilesPerGallon = 0;

		System.out.println("Enter the miles driven");
			miles  = input.nextInt();

		System.out.println("Enter the gallons used");
			gallons = input.nextInt();

		while(miles != -1) {

			float milesPerGallon = (miles / gallons);
			System.out.printf("the miles per gallon is %f%n", milesPerGallon);
			
			totalMilesPerGallon = totalMilesPerGallon + milesPerGallon;

	
			counter = counter + 1;

			System.out.println("Enter the miles driven");
			miles  = input.nextInt();

			System.out.println("Enter the gallons used");
			gallons = input.nextInt();

}
		System.out.printf("the total miles per gallon is %f", totalMilesPerGallon);
}
}
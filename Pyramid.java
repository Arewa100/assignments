import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		System.out.println("welcome to my pyramid calculator");
		
	Scanner input = new Scanner(System.in);
		
		int numOfStones;
		float averageWeight;
		float totalWeight;
		int years;
		float kgPerYear;
		float kgPerDay;
		float kgPerHour;
		float kgPerMinute;

	System.out.println("Enter the estimated number of stones");
		numOfStones = input.nextInt();

	System.out.println("Enter the average weight of each stone");
		averageWeight = input.nextFloat();

	System.out.println("enter the number of years taken to build the pyramid");
		years = input.nextInt();

		 totalWeight = (numOfStones * averageWeight);
		
		 kgPerYear = (totalWeight / years);
			
		 kgPerDay =  (kgPerYear / 365);
		
		 kgPerHour = (kgPerDay / 24);

		 kgPerMinute = (kgPerHour / 60);

	System.out.printf("Below is an estimate of how the pyramid was built for %d years %n%n", years);
	
	System.out.printf("%.2f kg of stones was used to build the pyramid for %d years %n%n", totalWeight, years);

	System.out.printf("%.2f kg of stones was used to build the pyramid per year %n%n", kgPerYear);

	System.out.printf("%.2f kg of stones was used to build the pyramid per day %n%n", kgPerDay);

	System.out.printf("%.2f kg of stones was used to build the pyramid per hour %n%n", kgPerHour);

	System.out.printf("%.2f kg of stones was used to build the pyramid per minute %n%n", kgPerMinute);

}
}
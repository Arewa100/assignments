import java.util.Scanner;
public class WorldPopulation {
	public static void main(String[] args) {
		System.out.println("Welcome to my population growth rate calculator");
		
	Scanner input = new Scanner(System.in);
	
		
		long currentWorldPopulation;
		double growthRate;
		int numberOfYears;
		double sum;
		double result;
		double estmatedPopulation;
	
	
		System.out.println("Enter the current world population");
			currentWorldPopulation = input.nextLong();

		System.out.println("Enter the annual growth rate");
			growthRate = input.nextDouble();
			
		System.out.println("Enter the number of years");
			numberOfYears = input.nextInt();
		
		sum = (1 + (growthRate/100));
			
		result = Math.pow(sum, numberOfYears);

		estmatedPopulation = (currentWorldPopulation * result);
		System.out.printf("the estimated world population after %d years is %.1f%n", numberOfYears, estmatedPopulation);
			
	
}

}
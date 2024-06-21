import java.util.Scanner;

public class CountrySpinner {

	public static void main(String[] args) {
		System.out.println("You are welcome to my country spinner");
	
	Scanner input = new Scanner(System.in);
		
		String countryA;
		String countryB;
		String countryC;
			
		System.out.println("Enter the first country");
		countryA = input.nextLine();
		
		System.out.println("Enter the second country");
		countryB = input.nextLine();

		System.out.println("Enter the third country");
		countryC = input.nextLine();
		
		System.out.printf("%s %s %s", countryC, countryB, countryA);
			
}
}
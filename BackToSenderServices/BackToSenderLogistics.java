import java.util.Scanner;

public class BackToSenderLogistics {
	public static void main(String[] args) {
		System.out.println("Welcome to to BACK TO SENDER LOGISTICS SERVICES");
		
	Scanner input = new Scanner(System.in);

	int successfulDeliveries;
	int paymentInWages;
	String driversName;
	int counter = 1;

		do {
		System.out.println("Enter the drivers name");
			driversName = input.next();

		System.out.printf("Enter the successful delivery made by %s%n", driversName);
			successfulDeliveries = input.nextInt();
		
		paymentInWages = Wage.payment(successfulDeliveries);
		
		System.out.printf("%s is enttitled to %d %n%n", driversName, paymentInWages);
		
		counter = counter + 1;

		} while(counter != -1);
}
}
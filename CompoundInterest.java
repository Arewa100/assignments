import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
		System.out.println("welcome to my salary interest calculator, we are checking the salary after six months\n");

	Scanner input = new Scanner(System.in);


			double amount;
			double constantValue;
			double varyingValue = 0;
			double result;
			String[] month = {"one", "two", "three", "four", "five", "six"};


			System.out.println("Enter the Amount saved");
				amount = input.nextFloat();
				constantValue = (1 + 0.003125);
					
				
				for(int i = 0; i < 6; i++) {

				result = (amount + varyingValue) * constantValue;
			System.out.printf("the account value after %s month is %f%n", month[i], result);
				varyingValue = result;
				
				
				}
}
}
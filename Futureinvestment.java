import java.util.Scanner;

public class Futureinvestment {

	 static float power(float result, float E) {
		float i;
		float value = 1;
		for(i = 1; i<=E; ++i) {
			value = value * result;
}
		return value;
}

	public static void main(String[] agrs) {
		System.out.println("Welcome to my future investment calculator");
		
	Scanner input = new Scanner(System.in);
		
			float FutureInvestementValue;
			float InvestedAmount;
			float InterestRate;
			float re;
			float NumberOfyears;
			float W;
			float Q;
			float exponent;


	System.out.println("Enter your Investment rate");
		InterestRate = input.nextFloat();

	System.out.println("Enter the number of years");
		NumberOfyears = input.nextFloat();

	System.out.println("Enter your investment Ammount");
		InvestedAmount = input.nextFloat();

		W = (NumberOfyears * 12);
		re = (1 + InterestRate);
		exponent = power(re, W);

	FutureInvestementValue = (InvestedAmount * exponent);

	System.out.printf("Your future investment value is %.3f\n", FutureInvestementValue);


}
}
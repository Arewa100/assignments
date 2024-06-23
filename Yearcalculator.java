import java.util.Scanner;

public class Yearcalculator {
	public static void main(String[] agrs){
		System.out.println("welcome to my year calculator");

	Scanner input = new Scanner(System.in);

	
	int M;
	int Xdays;
	int Ydays;
	


		System.out.println("Enter your time in minute");
		M = input.nextInt();
		Xdays = (M/1440); // this gives the number of days
		Ydays = (M/525600); //this gives the number of years

	System.out.printf("%d minutes is equivalent to %d years and %d days \n", M, Ydays, Xdays);
}
}
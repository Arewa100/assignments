import java.util.Scanner;
import java.util.Arrays;
public class MenstrualApp {
	public static void main(String[] args) {
		System.out.println("WELCOME TO THE MENTRUAL WAHALA APP");
		
	Scanner input = new Scanner(System.in);
	
	int month;
	int day;
	int year;
	int periodOfFlow;
	int averageMenstrualCycle;

	System.out.print("Enter the month: ");
		month = input.nextInt();

	System.out.print("Enter the date of begining of flow: ");
		day = input.nextInt();

	System.out.print("Enter the year: ");
		year = input.nextInt();
	
	System.out.print("Enter your average period of flow: ");
		periodOfFlow = input.nextInt();

	System.out.print("Enter the your average mentrual cycle: ");
		averageMenstrualCycle = input.nextInt();

	MenstrualAppFunctions feedback = new MenstrualAppFunctions(month, day, year, periodOfFlow, averageMenstrualCycle);
	
	int ovulationDate = feedback.getOvulationDate();
	int[] flowDates = feedback.getFlowDates();
	int[] unSafeDates = feedback.getUnSafeDates();
	int[] safeDates = feedback.getSafeDates(); 
	
	System.out.printf("OVULATION DATE: %6d%n", ovulationDate);

	System.out.printf("%6s is:  ", "FLOW DATES");	
	for(int counter = 0; counter < flowDates.length; counter++) {
		System.out.printf("%4d ", flowDates[counter]);
	}

	System.out.println(" ");

	System.out.printf("%6s is:  ", "UN-SAFE-DATES");	
	for(int counter = 0; counter < unSafeDates.length; counter++) {
		System.out.printf("%4d ", unSafeDates[counter]);
	}

	System.out.println(" ");

	System.out.printf("%6s is:  ", "SAFE-DATES");	
	for(int counter = 0; counter < safeDates.length; counter++) {
		System.out.printf("%4d ", safeDates[counter]);
	}

	System.out.println(" ");
	System.out.println("stay safe....");

}
}
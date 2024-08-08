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

	System.out.println(ovulationDate);
	System.out.println(flowDates);
	System.out.println(unSafeDates);
	System.out.print(Arrays.toString(safeDates));
}
}
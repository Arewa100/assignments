import java.util.Arrays;
public class MenstrualAppFunctions {
	
	public int[] date(int month, int day, int year) {    //6, 7, 2024)
		
		int[] daysOfEachMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] selectedMonths = new int[2];
		
		final int ARRAY_LENGTH = daysOfEachMonth.length;
			
		for(int count = 0; count < ARRAY_LENGTH; count++) {
			if(month != 0 && count == day && month <= 12) {
				int daySize = daysOfEachMonth[month];
				selectedMonths[0] = daySize;
			} else {
				int nextMonthCounter = (month + 1);
				int daySize = daysOfEachMonth[nextMonthCounter];
				selectedMonths[1] = daySize;
			}
		}

		
		return selectedMonths; 
}
	public int[] calender (int[] numberOfDaysOfTwoMonth) {

		final int TOTAL_MONTH_LENGTH = (numberOfDaysOfTwoMonth[0] + numberOfDaysOfTwoMonth[1]);
		
		int[] calenderDays = new int[TOTAL_MONTH_LENGTH];
		
		int days = 1;
		int counter = 0;
		while (counter < calenderDays.length) {
	
			if(counter != numberOfDaysOfTwoMonth[0]) {
				calenderDays[counter] = days;
				days = days + 1;

			} else  {

				days = 1;
				calenderDays[counter] = days;
				days = days + 1;
			}
			counter = counter + 1;
		}
		System.out.print(Arrays.toString(calenderDays));
		return calenderDays;
}
	public int[] flowDates(int day, int periodOfFlow, int[] calender) { 

		int[] theFlowDates = new int[periodOfFlow];
		
		int counter = (day - 1);  
		
		int indexOfFlowDateArray = 0;

		while(counter <= calender.length) {
			if(indexOfFlowDateArray == periodOfFlow) {
				counter = calender.length;
			} else {
				int datesOfFlow = calender[counter];
				theFlowDates[indexOfFlowDateArray] = datesOfFlow; 
				indexOfFlowDateArray = indexOfFlowDateArray + 1;
			}
			counter = counter + 1;
		}
		System.out.print(Arrays.toString(theFlowDates));
		return theFlowDates;
		
		
		
}
	public int ovulationDate(int averageMenstrualCycle, int[] calender, int day, int periodOfFlow) {
		final int TIME_TAKEN = 14;
		final int TIME_TAKEN_BEFORE_OVULATION = (averageMenstrualCycle - TIME_TAKEN); 

		int endOfPeriodFlow = day + (periodOfFlow - 1); 
		int count = (endOfPeriodFlow - 1); 
		int startCounter = (count + 1);
		int indexOfOvulationDateArray = 0;
		int ovulDate = 0;

		while (startCounter <= calender.length) {
			if(indexOfOvulationDateArray == TIME_TAKEN_BEFORE_OVULATION) {
				startCounter = calender.length;
			} else {
				ovulDate = calender[startCounter];
				indexOfOvulationDateArray = indexOfOvulationDateArray + 1;
				//this is where i am, ovulation dates 
			}
			startCounter = startCounter + 1;
		}
		return ovulDate;
		
		
}
}








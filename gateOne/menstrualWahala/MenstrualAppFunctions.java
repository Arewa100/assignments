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
}








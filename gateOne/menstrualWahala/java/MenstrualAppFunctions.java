import java.util.Arrays;
public class MenstrualAppFunctions {
		
	private int month;
	private int day;
	private int year;
	private int periodOfFlow;
	private int averageMenstrualCycle;
	private int ovulationDate;
	
	public MenstrualAppFunctions(int month, int day, int year, int periodOfFlow, int averageMenstrualCycle) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.periodOfFlow = periodOfFlow;
		this.averageMenstrualCycle = averageMenstrualCycle;
}
	
	public int[] date() {
		
		int leap;
 		if (month == 2 && day == 29) {
			leap = 29;
 		} else {
			leap = 28;
		}
		
		int[] daysOfEachMonth = {0, 31, leap, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] selectedMonths = new int[2];
		
		final int ARRAY_LENGTH = daysOfEachMonth.length;
			
		if(month == 12) {

		int daySize = daysOfEachMonth[month];
		selectedMonths[0] = daySize;
		selectedMonths[1] = daysOfEachMonth[1];

		} else {
	
		for(int count = 0; count < ARRAY_LENGTH; count++) {
			if(month != 0 && count == day && month < 12) {
				int daySize = daysOfEachMonth[month];
				selectedMonths[0] = daySize;
			} else {
				int nextMonthCounter = (month + 1);
				int daySize = daysOfEachMonth[nextMonthCounter];
				selectedMonths[1] = daySize;
			}
		}
		}
		
		return selectedMonths; 
}
	public int[] calender() {

		int[] numberOfDaysOfTwoMonth = date();

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
		return calenderDays;
}

	public int[] getFlowDates() { 
		
		int[] calender = calender();
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
		return theFlowDates;
		
		
		
}
	public int getOvulationDate() {

		int[] calender = calender();
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
			}
			startCounter = startCounter + 1;
		}
		return ovulDate;
		
		
}
	public int[] getUnSafeDates() {
		
		int[] calender = calender();
		int ovulationDate = getOvulationDate();

		final int UNSAFE_DAY_CONSTANT = 8;
		final int UNSAFE_DAY_LENGTH = (UNSAFE_DAY_CONSTANT + 1);

		int lastUnsafeDay = (ovulationDate + 2); 
		int firstUnsafeDay = (lastUnsafeDay - UNSAFE_DAY_CONSTANT); 
		int counter = (firstUnsafeDay - 1); 
		
		int indexOfUnsafeDaysArray = 0;
		int[] theUnSafeDates = new int[UNSAFE_DAY_LENGTH];
		int unsafeDate = 0;

		while(counter <= calender.length) {
			if(indexOfUnsafeDaysArray == UNSAFE_DAY_LENGTH) {
				counter = calender.length;
			}else {
				unsafeDate = calender[counter];
				theUnSafeDates[indexOfUnsafeDaysArray] = unsafeDate;
				indexOfUnsafeDaysArray = indexOfUnsafeDaysArray + 1;
			}
			counter = counter + 1;
		}

		return theUnSafeDates;		
		
}
	public int[] getSafeDates() {

		int ovulationDate = getOvulationDate();
		int[] calender = calender();

		final int UNSAFE_DAY_CONSTANT = 8;
		int lastUnsafeDay = (ovulationDate + 2); 
		int indexOfTheLastDay = (lastUnsafeDay - 1);

		int firstUnsafeDay = (lastUnsafeDay - UNSAFE_DAY_CONSTANT); 
		int counterOfFirstUnsafeDay = (firstUnsafeDay - 1); 
		
		int indexOfTheFirstDay = (day - 1);
		final int UNSAFE_DAY_LENGTH = 9;
		final int SAFEDAY_LENGTH = (averageMenstrualCycle - UNSAFE_DAY_LENGTH);
		
		int[] theSafeDates = new int[SAFEDAY_LENGTH];
	
		int unSafeDate = 0;
		int indexOfsafeDaysArray = 0;
		
		while(indexOfsafeDaysArray < theSafeDates.length) {

			if(indexOfTheFirstDay == counterOfFirstUnsafeDay) {
				indexOfTheFirstDay = (indexOfTheLastDay + 1); 
				unSafeDate = calender[indexOfTheFirstDay];
				theSafeDates[indexOfsafeDaysArray] = unSafeDate;
		
			}
			else {
				unSafeDate = calender[indexOfTheFirstDay];
				theSafeDates[indexOfsafeDaysArray] = unSafeDate;
				
			}

			indexOfsafeDaysArray = indexOfsafeDaysArray +  1;
			indexOfTheFirstDay = indexOfTheFirstDay + 1;
		}
		return theSafeDates;
		
}
}








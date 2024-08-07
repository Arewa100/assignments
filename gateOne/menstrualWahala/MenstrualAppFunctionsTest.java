import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MenstrualAppFunctionsTest {
	
	@Test
	public void testingIfDateFunctionCanReturnTheNumberOfDaysOfFirstMonthAndNumberOfDaysOfSecondMOnth() {
	
		MenstrualAppFunctions feedback = new MenstrualAppFunctions();
	
		int[] numberOfDaysOfTwoMonth = {30, 31};
		int[] result = feedback.date(6, 7, 2024);
	
		assertArrayEquals(numberOfDaysOfTwoMonth, result);
}
	@Test 
	public void testingIfCalenderFunctionCanReturnCalenderOfTwoMonth() {
	
	MenstrualAppFunctions feedback = new MenstrualAppFunctions();
	
		int[] numberOfDaysOfTwoMonth = {30, 31};

		int[] calenderOfTwoMonth = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};

		int[] result = feedback.calender(numberOfDaysOfTwoMonth);
	
		assertArrayEquals(calenderOfTwoMonth, result);
	
}
	@Test
	public void testingIflowDatesFunctionToSeeIfItCAnReturnFlowDates() {

		MenstrualAppFunctions feedback = new MenstrualAppFunctions();

		int[] calenderOfTwoMonth = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};

		int[] flowDays = {7, 8, 9, 10, 11};
		int[] result = feedback.flowDates(7, 5, calenderOfTwoMonth);
		
		assertArrayEquals(flowDays, result);
		
		
}
	@Test
	public void testingIfOvulationDatesFunctionCanReturnOvulationDate() {

		MenstrualAppFunctions feedback = new MenstrualAppFunctions();
		
		int[] calenderOfTwoMonth = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};

		int result = feedback.ovulationDate(28, calenderOfTwoMonth, 7, 5);
		
		assertEquals(25, result);
		
}
	@Test 
	public void testingIfUnSafeDateFunctionCanReturnUnSafeDates() {
		MenstrualAppFunctions feedback = new MenstrualAppFunctions();
	
		int[] calenderOfTwoMonth = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};

		int[] unSafeDays = {19, 20, 21, 22, 23, 24, 25, 26, 27};
		int[] result = feedback.unSafeDates(calenderOfTwoMonth, 25);
		
		assertArrayEquals(unSafeDays, result);
}
	@Test 
	public void testingIfSafeDateFunctionCanReturnSafeDates() {
		MenstrualAppFunctions feedback = new MenstrualAppFunctions();
	
		int[] calenderOfTwoMonth = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};

		int[] SafeDays = {7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 28, 29, 30, 1, 2, 3, 4};

		int[] result = feedback.SafeDates(calenderOfTwoMonth, 25);
		
		assertArrayEquals(SafeDays, result);

}








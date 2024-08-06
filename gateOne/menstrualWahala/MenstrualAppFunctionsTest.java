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
	
}
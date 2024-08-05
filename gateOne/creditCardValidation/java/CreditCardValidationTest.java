import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CreditCardValidationTest {
	
	@Test
	public void testingIfFuctionToDoubleEverySecondDigitFromLeftToRightAndReturnItSum() {
	
	ValidationFunction feedback = new ValidationFunction();
	
	int result = feedback.doubleEverySecondNumber("4388576018402626");
	
	assertEquals(34, result);
}
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class CreditCardValidationTest {
	
	@Test
	public void testingIfFuctionToDoubleEverySecondDigitFromLeftToRightAndReturnItSum() {
	
	ValidationFunction feedback = new ValidationFunction();
	
	int result = feedback.doubleEverySecondNumber("4388576018402626");
	
	assertEquals(37, result);
}
	@Test
	public void testingIfFunctionCanAddAllDigitInTheOddPlaces() {
	
	ValidationFunction feedback = new ValidationFunction();
		
	int result = feedback.sumNumbersInOddPositions("4388576018402626");
	
	assertEquals(38, result);
}
	@Test
	public void testingToCheckTheTypeOfCreditCardIsAVisaCard() {
	
	ValidationFunction feedback = new ValidationFunction();
		
	String result = feedback.cardType("4388576018402626");
	
	assertEquals("VisaCard", result);
	
}
	@Test
	public void testingToCheckTheTypeOfCreditCardIsaMasterCard() {
	
	ValidationFunction feedback = new ValidationFunction();
		
	String result = feedback.cardType("5388576018402626");
	
	assertEquals("MasterCard", result);
	
}
	@Test
	public void testingToCheckTheTypeOfCreditCardIsaAmericanExpressCards() {
	
	ValidationFunction feedback = new ValidationFunction();
		
	String result = feedback.cardType("3788576018402626");
	
	assertEquals("American Express Cards", result);
	
}
	@Test
	public void testingToCheckTheTypeOfCreditCardIsaDiscoverCard() {
	
	ValidationFunction feedback = new ValidationFunction();
		
	String result = feedback.cardType("6788576018402626");
	
	assertEquals("Discover Cards", result);
	
}
	@Test
	public void testingToCheckTheTypeOfCreditCardIfItIsInValid() {
	
	ValidationFunction feedback = new ValidationFunction();
		
	String result = feedback.cardType("2788576018402626");
	
	assertEquals("Invalid Card", result);
	
}
	@Test
	public void testingToSeeIfTheCardNumberIsValid() {
	
	ValidationFunction validate = new ValidationFunction();
	
	String[] feedback = {"VisaCard", "4388576018410707", "16", "Credit Card Is Valid"};
	String[] result = validate.card("4388576018410707");
	
	assertArrayEquals(feedback, result);
	
}
	@Test
	public void testingToSeeIfTheCardNumberIsInValid() {
	
	ValidationFunction validate = new ValidationFunction();
	
	String[] feedback = {"MasterCard", "5388576018402626", "16", "Credit Card Is invalid"};
	String[] result = validate.card("5388576018402626");
	
	assertArrayEquals(feedback, result);
	
}

}
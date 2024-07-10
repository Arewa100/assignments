import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MultipliCationTest {
	
	@Test	
	public void testingIfCalculatorCanMUltiplyTwoNegativeNumbers() {
		MultipliCation calculator = new MultipliCation();
		
		int result = calculator.multiply(-2, -4);
		
		assertEquals(8, result);
	
}
	@Test
	public void testingIfCalculatorCanMultiplyTwoNumbersWithTheFirstBeingNegative() {
		MultipliCation calculator = new MultipliCation();
		
		int result = calculator.multiply(-2, 4);
		
		assertEquals(-8, result);
}
	@Test
	public void testingIfCalculatorCanMultiplyTwoNumbersWithTHeSecondBeingNegative() {
		MultipliCation calculator = new MultipliCation();
	
		int result = calculator.multiply(2, -4);
		
		assertEquals(-8, result);
}	
	@Test
	public void testingIfCalculatorCanMultiplyTwoPositiveNumbers() {
		MultipliCation calculator = new MultipliCation();

		int result = calculator.multiply(2, 4);

		assertEquals(8, result);
}
	@Test 
	public void testingToCheckResultWhenAnyNumberIsZero() {
		MultipliCation calculator = new MultipliCation();
		
		int result = calculator.multiply(2, 0);
			
		assertEquals(0, result);
}
}
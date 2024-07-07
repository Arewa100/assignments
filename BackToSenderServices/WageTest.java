import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WageTest {
	
	@Test 
	public void testingIfWageCalculatorCanCalculateSucessfulDeliveriesLessThanFiftyPercent() {

			int result = Wage.payment(25);
			
			assertEquals(9000, result);
}
	@Test 
	public void testingIfWageCalculatorCanCalculateSucessfuldeliverGreaterThanFiftyPercent() {
			int result = Wage.payment(54);
			
			assertEquals(15800, result);
		
}
	@Test
	public void testingIfWageCalculatorCanCalculateSucessfuldeliveryGreaterThanSixty() {
			int result = Wage.payment(60);
			
			assertEquals(20000, result);
}
	@Test
	public void testingIfWageCalculatorCanCalculateSucessfuldeliveryGreaterAndEqualToSeventyPercent() {
			int result = Wage.payment(80);
			
			assertEquals(45000, result);
}
}
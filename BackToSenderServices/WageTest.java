import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WageTest {
	
	@Test 
	public void testingIfWageCalculatorCanCalculateSucessfulDeliveriesLessThanFiftyPercent() {
			Wage wage = new Wage();

			int result = wage.payment(25);
			
			assertEquals(9000, result);
}
}
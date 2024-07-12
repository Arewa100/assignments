import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CitizenTaxTest {
	@Test
	public void testToSeeIfTaxCalculatorCanCalculateTaxLesserAndEqualToThirtyThousand() {
		Tax tax = new Tax();
		
		double result = tax.calculator(30000);
		
		assertEquals(4500, result);
}
}
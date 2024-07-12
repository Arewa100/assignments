import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CitizenTaxTest {
	@Test
	public void testToCalculateYearlyIncome() {
		CitizenTax citizen = new CitizenTax();
		citizen.setName("Jumoke");
		citizen.setEarnings(30000);
		
		double tax = citizen.getYearlyIncomeTax();
		
		assertEquals(4500, tax);
}
}
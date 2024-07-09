import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasMileageCalculatorTest {

	@Test
	public void testingToCalculateMilesPerGallon() {

		GasMileageCalculator calculator = new GasMileageCalculator();
	
	double numberOfMilesDriven = 10.00;
	double numberOfGallons = 2.00;

	double resultOfMileage = calculator.milesPerGallon(numberOfMilesDriven, numberOfGallons);
		
		assertEquals(5.0, resultOfMileage);
}
	
}
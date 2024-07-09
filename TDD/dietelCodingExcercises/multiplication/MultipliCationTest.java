import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MultipliCationTest {
	
	@Test	
	public void testingIfMutiplicationCalculatorCanWork() {
		MultipliCation calculator = new MultipliCation();
		
		int result = calculator.multiply(2, 4);
		
		assertEquals(8, result);
	
}
}
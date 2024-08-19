import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class PizzaOrderFunctionTest {
	
	@Test
	public void testingIfPizzaMethodCanCalculateForSapaSizePizza() {
		PizzaOrderFunction feedback = new PizzaOrderFunction();
		feedback.getOrder(45, 4);
		int[] possibleFeedback = {4, 3, 16800};
		int[] result = feedback.getEstimate();
		
		assertArrayEquals(possibleFeedback, result);
	}
}
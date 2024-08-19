import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class PizzaOrderFunctionTest {
	
		
	@Test
	public void testingIfpizzaTypeCalculatorFunctionCanReturnResultWhenPizzaTypeIsSapaType() {
		PizzaOrderFunction feedback = new PizzaOrderFunction();
		feedback.getOrder(12, 1);
		int expectedNumberOfBoxes = feedback.pizzaTypeCalculator();
		assertEquals(3, expectedNumberOfBoxes);
	}
	
	@Test
	public void testingIfpizzaTypeCalculatorFunctionCanReturnResultWhenPizzaTypeIsSapaTypeTwo() {
		PizzaOrderFunction feedback = new PizzaOrderFunction();
		feedback.getOrder(13, 1);
		int expectedNumberOfBoxes = feedback.pizzaTypeCalculator();
		assertEquals(4, expectedNumberOfBoxes);
	}

	@Test
	public void testingIfPizzaMethodCanCalculateForSapaSizePizza() {
		PizzaOrderFunction feedback = new PizzaOrderFunction();
		feedback.getOrder(12, 1);
		int[] possibleFeedback = {3, 0, 6000};
		int[] result = feedback.getEstimate();
		
		assertArrayEquals(possibleFeedback, result);
	}
	
	@Test
	public void testingIfPizzaMethodCanCalculateForSmallMoneySizePizza() {
		PizzaOrderFunction feedback = new PizzaOrderFunction();
		feedback.getOrder(12, 2);
		int[] possibleFeedback = {2, 0, 4800};
		int[] result = feedback.getEstimate();
		
		assertArrayEquals(possibleFeedback, result);
	}
	
	@Test
	public void testingIfPizzaMethodCanCalculateForBigBoysSizePizza() {
		PizzaOrderFunction feedback = new PizzaOrderFunction();
		feedback.getOrder(25, 3);
		int[] possibleFeedback = {4, 7, 12000};
		int[] result = feedback.getEstimate();
		
		assertArrayEquals(possibleFeedback, result);
	}

	@Test
	public void testingIfPizzaMethodCanCalculateForOdogwuSizePizza() {
		PizzaOrderFunction feedback = new PizzaOrderFunction();
		feedback.getOrder(45, 4);
		int[] possibleFeedback = {4, 3, 16800};
		int[] result = feedback.getEstimate();
		
		assertArrayEquals(possibleFeedback, result);
	}
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {  


	@Test 
	public void testThatCalculatorCanAddTwoPostiveNumbers() {
		
		//given
		Calculator calculator = new Calculator(); //given we have a calculator

		//when
		int result = calculator.add(2,3);

		//assert
		assertEquals(5, result); 
}
	@Test
	public void testThatCalculatorCanAddTwoNegatveNumbers() {
		Calculator calculator = new Calculator();
		
		int result = calculator.add(-2, -4);
		
		assertEquals(-6, result);
}
	@Test
	public void testIfCalculatorCanSubstractTwoPositiveNumbers() {
		Calculator calculator = new Calculator();
		
		int result = calculator.subtract(4, 2);
		
		assertEquals(2, result);

}	
	@Test
	public void testingIfCalculaorCanSubtractNegativeNumbers() {
		Calculator calculator = new Calculator();
		
		int result = calculator.subtract(-2, 4);
		
		assertEquals(-6, result);
}
	@Test
	public void testingIfCalculatorCanDivideTwoPositiveNumbers() {
		Calculator calculator = new Calculator();
		
		double result = calculator.divide(4, 2);
	
		assertEquals(2, result);
}
	@Test 
	public void testingIfCalculatorCanDivideTwoNegativeNumbers() {
		Calculator calculator = new Calculator();
	
		double result = calculator.divide(-4, -2);
		
		assertEquals(2, result);
}
	@Test
	public void testingIfCalculatorCanDivideTwoNumbersIfOneNumberIsNegative() {
		Calculator calculator = new Calculator();
		
		double result = calculator.divide(-4, 2);
		
		assertEquals(-2, result);
}
	@Test
	public void testingIfCalculatorCanDivideTwoNumbersWheretheSmallestNumberIsTheNumerator() {
		Calculator calculator = new Calculator();
		
		double result = calculator.divide(2, 4);
		
		assertEquals(0.5, result);
}
	@Test
	public void testingWheretheSmallestNumberIsTheNumeratorAndItIsNegatiive() {
		Calculator calculator = new Calculator();
			
		double result = calculator.divide(-2, 4);
		
		assertEquals(-0.5, result);
}
	@Test
	public void testingIfCalculatorCanDivideANumberByZero() {
		Calculator calculator = new Calculator();
		
		//double result = calculator.divide(2, 0);

		assertThrows(ArithmeticException.class, ()-> calculator.divide(2, 0));
}
	@Test
	public void testingIfCalculatorCanMultiplyTtwoPostiveNumbers() {
		Calculator calculator = new Calculator();
		
		int result = calculator.multiply(2, 4);

		assertEquals(8, result);
}
	@Test
	public void testingIfCalculatorCanMultiplyTtwoNegativeNumbers() {
		Calculator calculator = new Calculator();
		
		int result = calculator.multiply(-2, -4);

		assertEquals(8, result);
}
	@Test
	public void testingIfCalculatorCanMultiplyTtwoNumbersWithFirstOneBeingNegative() {
		Calculator calculator = new Calculator();
		
		int result = calculator.multiply(-2, 4);

		assertEquals(-8, result);
}	
	@Test
	public void testingIfCalculatorCanMultiplyTtwoNumbersWithSecondNumberBeingNegative() {
		Calculator calculator = new Calculator();
		
		int result = calculator.multiply(2, -4);

		assertEquals(-8, result);
}
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;

public class ArrayFunctionsTest {
	
	@Test
	public void testingIfFunctionLargestCanReturnLargestElementInTheArray() {
		ArrayFunctions feedback = new ArrayFunctions();
		int[] value = {2, 4, 5, 15, 7, 8};
		int result = feedback.largest(value);
		
		assertEquals(15, result);
}
	@Test
	public void testingIfArrayFunctionReverseCanReverseAnArray() {
		ArrayFunctions feedback = new ArrayFunctions();

		int[] newArray = {8, 7, 6, 5, 4, 3};
		int[] value = {3, 4, 5, 6, 7, 8};
		int[] result = feedback.reverse(value);

		assertArrayEquals(newArray, result);
}
	@Test
	public void testingIfArrayFunctionFindCanCheckWhetherAnElementOccursInAnArray() {
		ArrayFunctions feedback = new ArrayFunctions();
		
		int[] list = {8, 7, 6, 5, 4, 3};
	 	String result = feedback.find(4, list);
		
		assertEquals("element occurs", result);
}
	@Test
	public void testingIfArrayFunctionFindCanCheckWhetherAnElementDoesNotOccurInAnArray() {
		ArrayFunctions feedback = new ArrayFunctions();
		
		int[] list = {8, 7, 6, 5, 4, 3};
	 	String result = feedback.find(10, list);
		
		assertEquals("element does not exist", result);
}
	@Test
	public void testingIfArrayFunctionOddPositionsCanPrintElementInOddPostionsInAnArray() {
		ArrayFunctions feedback = new ArrayFunctions();
		
		int[] list = {8, 7, 6, 5, 4, 3};
		int[] valueAtOddPositions = {0, 7, 0, 5, 0, 3};
	 	int[] result = feedback.oddpositions(list);
		
		assertArrayEquals(valueAtOddPositions, result);
}
	@Test
	public void testingIfArrayFunctionEvenPositionsCanPrintElementInEvenPostionsInAnArray() {
		ArrayFunctions feedback = new ArrayFunctions();
		
		int[] list = {8, 7, 6, 5, 4, 3};
		int[] valueAtOddPositions = {8, 0, 6, 0, 4, 0};
	 	int[] result = feedback.evenpositions(list);
		
		assertArrayEquals(valueAtOddPositions, result);
}

}
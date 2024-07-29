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
		int [] result = feedback.reverse(value);

		assertArrayEquals(newArray, result);
}
}
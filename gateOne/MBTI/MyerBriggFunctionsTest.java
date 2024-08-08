import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class MyerBriggFunctionsTest {
 
	@Test
	public void testingIfFunctionToServeQuestionIsWorkingProperly() {

		MyerBriggFunctions feedback = new MyerBriggFunctions();
	
		String question = "1: (A) expend energy, enjoy groups (B) conserve energy, enjoy one on one";
		String [] result = feedback.serveQuestion();
	
		assertEquals(question, result[0]);
	
}
	@Test
	public void testingIfTheGetFirstResponseFunctionCanReturnForFirstPersonality() {

		MyerBriggFunctions feedback = new MyerBriggFunctions();

		char[] response = {'A', 'B', 'A', 'A', 'A', 'B', 'A', 'A', 'B', 'A', 'A', 'B', 'B', 'A', 'B', 'A', 'B', 'A', 'B', 'B'};
		feedback.getResponse(response);

		char result = feedback.getFirstTestResult();
		
		assertEquals('I', result);
		
}
	@Test
	public void testingIfTheGetSecondResponseFunctionCanReturnForSecondPersonality() {

		MyerBriggFunctions feedback = new MyerBriggFunctions();

		char[] response = {'A', 'B', 'A', 'A', 'A', 'B', 'A', 'A', 'B', 'A', 'A', 'B', 'B', 'A', 'B', 'A', 'B', 'A', 'B', 'B'};
		feedback.getResponse(response);

		char result = feedback.getSecondTestResult();
		
		assertEquals('S', result);
		
}
	@Test
	public void testingIfTheGetThirdResponseFunctionCanReturnForThirdPersonality() {

		MyerBriggFunctions feedback = new MyerBriggFunctions();

		char[] response = {'A', 'B', 'A', 'A', 'A', 'B', 'A', 'A', 'B', 'A', 'A', 'B', 'B', 'A', 'B', 'A', 'B', 'A', 'B', 'B'};
		feedback.getResponse(response);

		char result = feedback.getThirdTestResult();
		
		assertEquals('T', result);
		
}
	@Test
	public void testingIfTheGetFourthResponseFunctionCanReturnForFourthPersonality() {

		MyerBriggFunctions feedback = new MyerBriggFunctions();

		char[] response = {'A', 'B', 'A', 'A', 'A', 'B', 'A', 'A', 'B', 'A', 'A', 'B', 'B', 'A', 'B', 'A', 'B', 'A', 'B', 'B'};
		feedback.getResponse(response);

		char result = feedback.getFourthTestResult();
		
		assertEquals('J', result);
		
}

}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MyerBriggFunctionsTest {
 
	@Test
	public void testingIfFunctionToServeQuestionIsWorkingProperly() {

		MyerBriggFunctions feedback = new MyerBriggFunctions();
	
		String question = "1: (A) expend energy, enjoy groups : (B) conserve energy, enjoy one on one";
		String [] result = feedback.serveQuestion();
	
		assertEquals(question, result[0]);
	
}
@Test
	public void testingIfTheGetResponseFunctionCanReturnException() {

		MyerBriggFunctions feedback = new MyerBriggFunctions();

		char[] response = {'A', 'B', 'A', 'n', 'A', 'B', 'A', 'A', 'B', 'A', 'A', 'B', 'B', 'A', 'B', 'A', 'B', 'A', 'B', 'B'};

		assertThrows(IllegalArgumentException.class, ()-> feedback.getResponse(response));
		
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
	@Test
	public void testingIfFunctionToResturnFinalPersonalityWorksProperly() {
		MyerBriggFunctions feedback = new MyerBriggFunctions();
		
		char[] response = {'A', 'B', 'A', 'A', 'A', 'B', 'A', 'A', 'B', 'A', 'A', 'B', 'B', 'A', 'B', 'A', 'B', 'A', 'B', 'B'};
		feedback.getResponse(response);
			
		String message = "(The Inspector : ISTJ Personality) ISTJs are serious, proper, and formal in appearance which can be intimidating. They are cultured and have an affection towards tradition. In contrast, they are quiet and usually calm.  They are called inspectors because of their keen attention to detail. ISTJ are rule followers who always take the logical approach towards their goals and projects. Their dominant cognitive function is introverted sensing which helps them take in the details about their environment while their auxiliary cognitive function is extraverted thinking which makes them efficient and logical thinkers. In their relationships, they are very loyal to their friends and family members. Usually, they have a small circle with who they prefer spending their time with. The ISTJ thrives in jobs that require structure, logic, and stability.";

		String result = feedback.personality();
		
		assertEquals(message, result);
}
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyerBriggFunctionsTest {
 
	@Test
	public void testingIfFunctionToServeQuestionIsWorkingProperly() {

	MyerBriggFunctions feedback = new MyerBriggFunctions();
	
	String question = "1: (A) expend energy, enjoy groups (B) conserve energy, enjoy one on one";
	String [] result = feedback.serveQuestion();
	
	assertEquals(question, result[0]);
	
}
}
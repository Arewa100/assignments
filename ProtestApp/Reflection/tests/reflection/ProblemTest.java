package reflection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ProblemTest {
    @Test
    public void testToCreateProblemWithItsTypeAndName(){
        Problem problem = new Problem("high tax", ProblemType.BUSINESS);
    }
    @Test
    public void testToCreateProblemAndGetItsName() {
        Problem problem = new Problem("school fees", ProblemType.FINANCIAL);
        assertEquals("school fees", problem.getName());
    }
    @Test
    public void testToCreateProblemAndGetItsType() {
        Problem problem = new Problem("unblieve", ProblemType.SPIRITUAL);
        assertEquals(ProblemType.SPIRITUAL, problem.getType());
    }
    @Test
    public void testToSolveAProblemByChangingItsState() {
        Problem problem = new Problem("unblieve", ProblemType.SPIRITUAL);
        assertEquals("unblieve", problem.getName());
        assertEquals(ProblemType.SPIRITUAL, problem.getType());
        assertFalse(problem.isSolve());
        problem.setState();
        assertTrue(problem.isSolve());
    }
}
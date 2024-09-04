package reflection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PersonTest {
    @Test
    public void testThatPersonExists() {
        Person person = new Person();
    }
    @Test
    public void testThatAPersonCanaddToHisProBlems() {
        Person person = new Person();
        Problem problem = person.addToProblem("school fees", ProblemType.FINANCIAL);
        assertEquals("school fees", problem.getName());
    }
    @Test
    public void testToAddTwoProblems() {
        Person person = new Person();
        person.addToProblem("school fees", ProblemType.FINANCIAL);
        person.addToProblem("un-believe", ProblemType.SPIRITUAL);
        assertEquals(2, person.problemCount());
    }
    @Test
    public void testToAddMoreProblems() {
        Person person = new Person();
        person.addToProblem("school fees", ProblemType.FINANCIAL);
        person.addToProblem("un-believe", ProblemType.SPIRITUAL);
        person.addToProblem("house rent", ProblemType.FINANCIAL);
        assertEquals(3, person.problemCount());
    }
    @Test
    public void testToAddAProblemAndSolveIt() {
        Person person = new Person();
        person.addToProblem("school fees", ProblemType.FINANCIAL);
        person.solveProblem("school fees", ProblemType.FINANCIAL);
        assertTrue(person.isSolved("school fees", ProblemType.FINANCIAL));
    }
    @Test
    public void testToSolveMultipleProblems() {
        Person person = new Person();
        person.addToProblem("school fees", ProblemType.FINANCIAL);
        person.addToProblem("un-believe", ProblemType.SPIRITUAL);
        person.addToProblem("house rent", ProblemType.FINANCIAL);
        person.solveProblem("school fees", ProblemType.FINANCIAL);
        assertEquals(3, person.problemCount());
        assertTrue(person.isSolved("school fees", ProblemType.FINANCIAL));

    }
    @Test   // i am here
    public void testThatToRecountAllUnsolvedProblems() {
        Person person = new Person();
        person.addToProblem("school fees", ProblemType.FINANCIAL);
        person.addToProblem("un-believe", ProblemType.SPIRITUAL);
        person.solveProblem("school fees", ProblemType.FINANCIAL);
        assertEquals(2, person.problemCount());

    }

}
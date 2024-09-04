package reflection;

public class Problem {

    private final String name;
    private ProblemType typeOfProblem;
    private boolean isSolved;


    public Problem(String name, ProblemType typeOfProblem) {
        this.name = name;
        this.typeOfProblem = typeOfProblem;
        this.isSolved = false;
    }

    public String getName() {
        return name;
    }

    public ProblemType getType() {
        return typeOfProblem;
    }

    public void setState() {
        if(isSolved) {
            isSolved = false;
        }else {
            isSolved = true;
        }
    }
    public boolean isSolve() {
        return isSolved;
    }
}

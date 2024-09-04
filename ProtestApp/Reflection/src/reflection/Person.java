package reflection;

import java.util.ArrayList;

public class Person {
    private final ArrayList<Problem> listOfProblems = new ArrayList<>();

    public Problem addToProblem(String name, ProblemType problemType) {
        listOfProblems.add(new Problem(name, problemType));
        return new Problem(name, problemType);
    }

    public int problemCount() {
        return listOfProblems.size();
    }

    public void solveProblem(String name, ProblemType problemType) {
        getProblem(name, problemType).setState();
    }

    public boolean isSolved(String name, ProblemType problemType) {
        return getProblem(name, problemType).isSolve();
    }

    private Problem getProblem(String name, ProblemType problemType) {
        Problem problem = null;
        for(Problem searchedProblem : listOfProblems) {
            if(searchedProblem.getName().equals(name) && searchedProblem.getType().equals(problemType)) {
               problem = searchedProblem;
            }
        }
        return problem;
    }
}

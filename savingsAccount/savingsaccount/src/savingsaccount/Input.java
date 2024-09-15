package savingsaccount;
import java.util.Scanner;
public class Input {
    private final Scanner the_input = new Scanner(System.in);

    public double input(String prompt) {
        System.out.print(prompt+ ":  ");
        double answer;
        answer = the_input.nextDouble();
        return answer;
    }
}

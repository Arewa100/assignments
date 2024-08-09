import java.util.Scanner;
import java.util.Arrays;
public class MyerBriggs {
	public static void main(String[] args) {
		System.out.println("WELCOME TO MYER BRIGGS PERSONALITY TEST");

	Scanner input = new Scanner(System.in);
	
	MyerBriggFunctions feedback = new MyerBriggFunctions();
	
	System.out.print("What is your name:  ");
		String name = input.nextLine();
	
	System.out.printf("%nWelcome %s. Kindly take the following personality test.%n%n", name);
	
	char[] answer = new char[20];
	String[] mbtiQuestions = feedback.serveQuestion();

	for(int counter = 0; counter < answer.length; counter++) {
		String question = "";
		char theAnswer = ' ';
		question = mbtiQuestions[counter];
		System.out.println(question);
		System.out.print("select A or B:   ");
		theAnswer = input.next().charAt(0);
		answer[counter] = theAnswer;
		
	}

	feedback.getResponse(answer);
	String yourPersonality = feedback.personality();

	System.out.printf("%s, your personality is: %n %s",name, yourPersonality); 
}
}
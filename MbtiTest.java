import java.util.Scanner;
import java.util.Random;

public class MbtiTest {
	public static void main(String[] args) {
		System.out.println("welcome to my mbti test code\n");
	
	Scanner input = new Scanner(System.in);
	
	Random number = new Random();

		int ExtrovertIntrovert;
		//ExtrovertIntrovert = number.nextInt(20 - 1) + 1;
		
		int counter = 1;
		int aCounter = 0;
		int bCounter = 0;
		String name;	
	
			
			System.out.println("Hi, welcome to your MBTI test kindly follow the instructions below to proceed\n");
			System.out.println("What is your name?");
				name = input.nextLine();

		while(counter <= 1 ) {
			
			System.out.println("Choose the statement that best describes you: ");
				
			System.out.println("A: expend energy, enjoy groups   B: conserve energy, emjoy one on one");

				char response = input.next().charAt(0);
					if(response == 'A') {
					aCounter = aCounter + 1;
} 					else {
					bCounter = bCounter + 1;
}
	
					
					

			
		counter = counter + 1;
}
		System.out,println(case A:)		
}
}
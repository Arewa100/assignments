//QUESTION 5.1
// this is program that checks if a student passes in a java exam written by Olasoyin Miracle

/*THIS IS THE ALGORITHM
1: let the java score entered by student be "javaScore"
2: let the average score be taken as 60
3: compare the "javaScore" with 60
4: if it is greater than 60 
5: dislay "You passed the exam"
6: if it is lesser than 60
7: display "You did not pass the exam"
8: end the program with -1
*/

//starting the program

import java.util.Scanner;
	public class Javascore {
 		
		public static void main(String[] args) {
			System.out.println("welcome to my exam status checker\n");

		Scanner input = new Scanner(System.in);
			
		// declaring the variables
			int javaScore;
		
		//computing the variables
			System.out.println("Enter your score");
			javaScore = input.nextInt();

			if(javaScore >= 60) {
			System.out.println("You passed the exam");

} 			else  if(javaScore < 60) {
			System.out.println("You did not pass the exam");
			}
		System.out.printf("Enter your score %d", -1);
			javaScore = input.nextInt();	
}

}

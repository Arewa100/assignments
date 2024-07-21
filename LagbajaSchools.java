import java.util.Scanner;

public class LagbajaSchools {
	public static void main(String[] args) {
		System.out.println("WELCOME TO LAGBAJA SCHOOLS");
	
	Scanner input = new Scanner(System.in);

		int numberOfStudents;
		int numberOfSubjects;

	System.out.println("How many students do you have\n");
		numberOfStudents = input.nextInt();
		 

	System.out.println("How many subjects do they offer\n");
		 numberOfSubjects = input.nextInt();
		
		scoreSize = (numberOfStudents * numberOfSubjects);

		 int[] score = new int[scoreSize];
		

	System.out.println("Saving >>>>>>>>>>>>>>>>>>");
	System.out.println("Saved successfully\n");

	for(int studentCounterr = 1; studentCounterr <= numberOfStudents; studentCounterr++) {

		for(int subjectCounter = 0; subjectCounter < numberOfSubjects; subjectCounter++) {
			System.out.printf("Entering score for student %d%n", studentCounterr);
				
			System.out.printf("Enter score for subject %d%n", subjectCounter+1);
				score[subjectCounter] = input.nextInt();
}			

}
			System.out.print(score.length);
}
}
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
		 int[] score = new int[numberOfStudents];
		

	System.out.println("Saving >>>>>>>>>>>>>>>>>>");
	System.out.println("Saved successfully\n");

	for(int studentCounterr = 1; studentCounterr <= numberOfStudents; studentCounterr++) {

		for(int subjectCounter = 1; subjectCounter <= numberOfSubjects; subjectCounter++) {
			System.out.printf("Entering score for student %d%n", studentCounterr);
				
			System.out.printf("Enter score for subject %d%n", subjectCounter);
				score[subjectCounter] = input.nextInt();
}			

			int[] firstStudent = new int[numberOfSubjects];

			System.out.println(" ");
}
			System.out.println(firstStudent[1]);
}
}
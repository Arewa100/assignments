import java.util.Scanner;

public class LagbajaSchools {
	public static void main(String[] args) {
		System.out.println("WELCOME TO LAGBAJA SCHOOLS");
	
	Scanner input = new Scanner(System.in);

		int numberOfStudents;
		int numberOfSubjects;
		int counter = 0;
		int[] studentHead = {1, 2, 3, 4};

	System.out.println("How many students do you have\n");
		numberOfStudents = input.nextInt();

	System.out.println("How many subjects do they offer\n");
		 numberOfSubjects = input.nextInt();

	System.out.println("Saving >>>>>>>>>>>>>>>>>>");
	System.out.println("Saved successfully\n");

	while(counter <= numberOfStudents) {
		
		System.out.printf("Entering score for student %d%n", studentHead[counter]);
			
		System.out.printf("Enter score for subject %d%n", countHead[counter]);
			



		counter = counter + 1;
}
	
}
}
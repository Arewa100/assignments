import java.util.Scanner;
import java.util.Arrays;

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
		
		int scoreSize = (numberOfStudents * numberOfSubjects);

		 int[] score = new int[scoreSize];
		

	System.out.println("Saving >>>>>>>>>>>>>>>>>>");
	System.out.println("Saved successfully\n");

		int arrayIndexCounter = 0;

	for(int studentCounterr = 1; studentCounterr <= numberOfStudents; studentCounterr++) {
	
		for(int subjectCounter = 0; subjectCounter < numberOfSubjects; subjectCounter++) {
			System.out.printf("Entering score for student %d%n%n", studentCounterr);
	
			System.out.printf("Enter score for subject %d%n%n", subjectCounter+1);
				score[arrayIndexCounter] = input.nextInt();

			arrayIndexCounter = arrayIndexCounter + 1;
		}			

	}

	//CREATING SUBJECT DYNAMICALLY

		int subindex = 1;
		String[] subject = new String[numberOfSubjects];

	for(int numberofsubindex = 0; numberofsubindex < subject.length; numberofsubindex++) {
		subject[numberofsubindex] = "SUB" + subindex;
		subindex = subindex + 1;
	}

	
	//PRINTING HEADER

	for(int subjectdisplaycount = 1; subjectdisplaycount <= 1; subjectdisplaycount++) {
		System.out.printf("%10s", "STUDENT");

			for(int iteratingthroughsubject = 0; iteratingthroughsubject < subject.length; iteratingthroughsubject++) {
				System.out.printf("%7s", subject[iteratingthroughsubject]);
			}

		System.out.printf("%6s %6s %6s%n", "TOT", "AVG", "POS");

	}
		

	//WRITING FOR POSITION

		int positionScoreCount = 0;
		Double[] averagePerStudent = new Double[numberOfStudents];
		int[] postiions = new int[numberOfStudents];

	for(int counter = 0; counter < numberOfStudents; counter++) {
			double total = 0;
			double average = 0;
			double position = 0;

		for(int scorecount = 0; scorecount < numberOfSubjects; scorecount++) {
			total = total + score[positionScoreCount];

			positionScoreCount = positionScoreCount + 1;
		}

		average  = (total / numberOfSubjects);
		averagePerStudent[counter] = average;
	}

	//SORTING AVERAGES
	int studentPosition = averagePerStudent.length;
	for(int count = 0; count < averagePerStudent.length; count++) {   
		postiions[count] = studentPosition;
		for(int index = count + 1; index < averagePerStudent.length; index++ ) {
			
			if(averagePerStudent[count] > averagePerStudent[index]) {
				double value = averagePerStudent[count];
				averagePerStudent[count] = averagePerStudent[index];	
				averagePerStudent[index] = value;
			}
		} studentPosition = studentPosition - 1;
	}




	
	//PRINTING THE SCORES ON THE TABLE

		int printScoreCount = 0;

	for(int counter = 1; counter <= numberOfStudents; counter++) {
			double total = 0;
			double average = 0;
			double position = 0;

			System.out.printf("%10s%d", "STUDENT", counter);

		for(int scorecount = 0; scorecount < numberOfSubjects; scorecount++) {
			System.out.printf("%6d ", score[printScoreCount]);
			total = total + score[printScoreCount];

			printScoreCount = printScoreCount + 1;
		}
		//PRINTING POSITION
	
		average  = (total / numberOfSubjects);
		for(int count = 0; count < averagePerStudent.length; count++) {
			if(average == averagePerStudent[count]) {
				studentPosition = postiions[count];
				count = averagePerStudent.length;
			}
		}

		System.out.printf("%6.2f %6.2f %4d %n", total, average, studentPosition);
		System.out.println("");
		
	}
			//System.out.print(Arrays.toString(score));
			System.out.print(Arrays.toString(averagePerStudent));
}
}
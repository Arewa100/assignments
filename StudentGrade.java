import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {
		System.out.println("Welcome to my Student grade checker");
		
	Scanner input = new Scanner(System.in);
			
		String studentName[];
		int counter = 1;
		char grade;
		
		System.out.println("Enter the student name and grade");
				studentName = input.nextLine();
				grade = input.next().charAt(0);
		do {

		System.out.println("Enter the student name ");
			studentName = input.nextLine();
	
		++counter;

		} while(counter <= 5);
				
					
		switch(grade) {

			case 'A':
				System.out.printf("%s earned %c, Execellent %n", studentName, grade);

				break;

			case 'B':
				System.out.printf("%s earned %c, very good %n", studentName, grade);

				break;

			case 'C':
				System.out.printf("%s earned %c, good %n", studentName, grade);

				break;

			case 'D':
 				System.out.printf("%s earned %c, poor %n", studentName, grade);

				break;
			default:
				System.out.println("the is an error during the grade selection");
}
}
}
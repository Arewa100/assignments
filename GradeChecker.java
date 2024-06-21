import java.util.Scanner;

public class GradeChecker {
	public static void main(String[] args) {
		System.out.println("Welcome to the grade checker");

	Scanner input = new Scanner(System.in);
		
		
		char grade;
		
		System.out.println("Enter a letter grade");
			grade = input.next().charAt(0);

		switch(grade) {
			case 'A':
				System.out.println("the numeric value for grade A is 4");
				break;
			case 'B':
				System.out.println("the numeric value for grade B is 3");
				break;
			case 'C':
				System.out.println("the numeric value for grade C is 2");
				break;
			case 'D':
				System.out.println("the numeric value for grade D is 1");
				break;

			case 'F':
				System.out.println("the numeric value for grade F is 0");
				break;
			default: 
				System.out.printf("%s is an invalid grade", grade);
}
			
}	
	
}
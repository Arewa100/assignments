import java.util.Scanner;

public class ControlStructures {
	public static void main(String[] args) {
		System.out.println("Welcome to my control practice test");
	
	Scanner input = new Scanner(System.in);

	
		float age = 0;
		int counter = 0;	
		float total = 0;

		float sentinel = -1;
	
		System.out.println("Enter your age");
			age = input.nextFloat();

		while(age != sentinel) {
			total = total + age;
			++counter;
		System.out.println("Enter the ages");
			age = input.nextFloat();
}		
	float average = (total / counter);
		System.out.printf("the average age of students is %f%n", average);
		System.out.printf("the number students entered is %d", counter);	
}
}
import java.util.Scanner;

public class CircleCalculator {
	public static void main(String[] args) {
		System.out.println("welcome to my diameter, circumference and area of a circle calculator");

	Scanner input = new Scanner(System.in);
		
		//declaring the variables
			float radius;
			
		System.out.println("Enter the radius of the circle");
			radius = input.nextFloat();
		
		System.out.printf("the diameter of the circle is %f%n", (2 * radius));
		System.out.printf("the circumference of the circle is %f%n", (2 * Math.PI *radius));
		System.out.printf("the diameter of the circle is %f", (Math.PI * radius * radius));

}
}
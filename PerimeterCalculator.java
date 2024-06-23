import java.util.Scanner;

public class PerimeterCalculator {
	public static void main(String[] args) {
		System.out.println("welcome to my perimeter calculator");
	
	Scanner input = new Scanner(System.in);
		
		

			double perimeter;
			double radius;
			double area;
			double pi = 3.14159;
			
		
		
		System.out.println("Enter the radius of the circle");
			radius = input.nextFloat();

		perimeter = (2 * radius * pi);
		area = (radius * radius * pi);

		System.out.printf("the perimeter of the circle is %.3f%n", perimeter);
		System.out.printf("the area of the circle is %.3f", area);
}

}
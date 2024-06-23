import java.util.Scanner;

public class ClassActivity {

	public static void main(String[] args) {

		System.out.println("welcome to my area and perimeter calculator");

	Scanner input = new Scanner(System.in);

 
			float width;	
			float height;
			float area;
			float perimeter;
			float sum;
			
			System.out.println("Enter the width of the rectangle");
				width = input.nextFloat();

			
			System.out.println("Enter the height of the rectangle");
				height = input.nextFloat();

				area = (width * height);

			System.out.printf("the area of the rectangle is %.3f%n", area);
			
				sum = (width + height);
				perimeter = (sum * 2);

			System.out.printf("the perimeter of the rectangle is %.3f", perimeter);
}
}
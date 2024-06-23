//this is a code to calculate the perimeter of a rectangle written
//by Olasoyin Miracle

/*THIS IS THE ALGORITHM
1: let the perimeter be taken as "perimeter"
2: let the height be taken as "height
3; let the width be "width
4: let the area be taken as "area"
5: multiply width by height
6; store the value as the area
7: add width and height
8: multiply the result by 2
9: store the answer as perimeter of the rectangle
*/

//starting the code 
public class Rectangle {
	public static void main(String[] agrs) {
		System.out.println("welcome to my rectangle calculator");
		
	//declaring the variables
		double height = 8.6;
		double width = 5.3;
		double area;
		doublecls perimeter;

	//computing the variables
		area = (height * width);
		perimeter = 2 * (width + height);

	System.out.printf("the area of the rectangle is %f%n", area);
	System.out.printf("the perimeter of the rectangle is %f%n", perimeter);
}
}

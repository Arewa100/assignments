//this is a code to calculate the area and perimeter of circle written by Olasoyin Miracle

/*THIS IS THE ALGORITTHM
1: let the perimeter be taken as "perimeter"'
2: let the area be taken as 'area"
3: let the given radius be 6.5
4: let Pi be taken as P
5: mdultiply P by radius and 2
6: store the result in perimeter
7: multiply radius by radius by Pi
8: store the answer in area
*/

//starting the program

public class Apcalculator {
	public static void main(String[] args) {
		System.out.println("Welcome to my Area and Perimeter calculator for a circle");


		
	//declaring the variables
		double perimeter;
		double area;
		double radius = 6.5;
		double Pi = 3.14159;

	//computing the variables
		perimeter = (2 * radius * Pi);
	System.out.printf("the perimeter of the circle is %f\n", perimeter);
		area = (radius * radius * Pi);
 	System.out.printf("the area of the circle is %f\n", area);

}
}
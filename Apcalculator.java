public class Apcalculator {
	public static void main(String[] args) {
		System.out.println("Welcome to my Area and Perimeter calculator for a circle");


		double perimeter;
		double area;
		double radius = 6.5;
		double Pi = 3.14159;


		perimeter = (2 * radius * Pi);
	System.out.printf("the perimeter of the circle is %f\n", perimeter);

		area = (radius * radius * Pi);
 	System.out.printf("the area of the circle is %f\n", area);

}
}
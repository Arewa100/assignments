import java.util.Scanner;
public class Testing {
	public static void main(String[] agrs) {
		//using the format specifiers in printf

		//System.out.printf("%s %n %d %c %f %b", "My Jenny", 25, 'D', 23.3, true);

		//declaring a variable using the data types
		
			byte numbers = 1;
			char name = 'a';
			short distance = 100;
			long route = 200000;
			double length = 0.45;
			double size = 23.4;
			int weight = 23;
			boolean gender = true;

		System.out.printf("this is %d  %c  %d  %d  %f  %f  %d  %b\n", numbers, name, distance, route, length, size, weight, gender);

			//for the reference data type
			String love = "Jenny";
			System.out.println(love);

			Scanner input = new Scanner(System.in);
				int level;
				System.out.println("Enter the level of Love");
				level = input.nextInt();
				System.out.printf("this is the level of love i have for you %d ", level);
			
			
}
}
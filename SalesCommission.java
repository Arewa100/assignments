import java.util.Scanner;

public class SalesCommission {
	public static void main(String[] args) {
		System.out.println("Welcome to my sales commission calculator for sales person in my vendor");
	
	Scanner input = new Scanner(System.in);
		
		float items = 0;
		int itemsSold = 0;
		String name;
		double totalSales = 0;

		double earnings = 0;
		double perItem = 0;
		
		System.out.println("Enter the sales person's name");
		name = input.nextLine();

		while(items != -1) {
			
		System.out.printf("Enter the value of item sold last week by %s%n", name);
			items = input.nextFloat();
		
		totalSales = totalSales + items;

		perItem = (0.09 * totalSales);

		earnings = (perItem + 200);

		itemsSold = itemsSold + 1;

		
}
		System.out.printf("Your earnings for this month is %.3f%n%n", earnings);
}
}
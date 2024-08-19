import java.util.Scanner;

public class PizzaWahala {
	public static void main(String[] args) {
		System.out.println("WELCOME TO IYA ABIMBOLA PIZZA JOINT");
		System.out.println("one bite want more");
	
	Scanner input = new Scanner(System.in);
	PizzaOrderFunction feedback = new PizzaOrderFunction();
		
	int numberOfGuests; 
	int pizzaType;
	String[] pizza = {null, "Sapa size", "Small Money", "Big Boys", "Odogwu"};
	String message = """ 
			================================================
			Kindly select the following:
			1: Sapa size
			2: Small Money
			3: Big Boys
			4: Odogwu
			================================================
			""";

	System.out.print("Enter the number of guest:  ");
		numberOfGuests = input.nextInt();

	System.out.println(message);
	pizzaType = input.nextInt();
	if(pizzaType != 1 && pizzaType != 2 && pizzaType != 3 && pizzaType != 4) {
		boolean flag = false;
		while(!flag) {
			System.out.println("select either 1, 2, 3 or 4");
			pizzaType = input.nextInt();
			if(pizzaType == 1 || pizzaType == 2 || pizzaType == 3 || pizzaType == 4) {
				flag = true;
			}
		}
	}

	feedback.getOrder(numberOfGuests, pizzaType);
	
	int[] estimates = feedback.getEstimate();
	System.out.printf("You'll get %d boxes of pizza %n%n", estimates[0]);
	System.out.printf("Since your number of guest is %d, %d slices of pizza will be remaining%n%n", numberOfGuests, estimates[1]);
	System.out.printf("the cost of %d %s boxes is %d naira", estimates[0], pizza[pizzaType], estimates[2]);
	}
}
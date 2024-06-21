import java.util.Scanner;

public class NumbercheckerTwo {
	public static void main(String[] args) {
		System.out.println("Welcome to my second Number checker, i will be using another method to check the largest and smallest number");
		
	Scanner input = new Scanner(System.in);
		
		int number;
		int counter = 0;
		int largest = 0;
		int smallest;
			
	
		while(counter < 5) {
			System.out.println("Enter the number");
				number = input.nextInt();
	
			if(number > largest) {
			largest = number;


}	
		        counter = counter + 1;			
}
		System.out.printf("the largest number is %d%n", largest);
		//System.out.printf("the smallest number is %d", smallest);
}
}
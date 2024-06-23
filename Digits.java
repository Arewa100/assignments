import java.util.Scanner;

	public class Digits {
		public static void main(String[] agrs) {
		System.out.println("Welcome to my world");

	Scanner input = new Scanner(System.in); 

		int numbers;
		int x;
		int y;
		int sum;

	System.out.println("Enter any number between 0 and 1000");
		numbers = input.nextInt(); 

	if(numbers > 0 && numbers < 1000) {
		x = numbers/10; 
		y = (numbers % 10); 

		sum = x + y;
		
		System.out.printf("the result is %d\n", sum);
		
	} else {
	System.out.println("Number is Invalid");
}
		
}

}
	
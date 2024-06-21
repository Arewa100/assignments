import java.util.Scanner;

public class Maxnumber {
	public static void main(String[] args) {
		System.out.println("welcome to my integer evaluator");
		
	Scanner input = new Scanner(System.in);
		
		//DECLARING THE VARIABLES
		
		int[] number;
		int i;

		number = new int[5];


		System.out.println("Enter any number");
			for(i = 0; i < number.length; i++) {
			number[i] = input.nextInt();
}		
			for(int j = 0; j < 5; j++ ) {

	System.out.printf("the array is %d", number[j]);
}
}
}
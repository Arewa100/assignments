import java.util.Scanner;

public class SumOfOddIndices {
	public static void main(String[] args) {
		System.out.println("hey pal: i guess you are given another task oh!");

	Scanner input = new Scanner(System.in);
	
		int odd;
		int sumOfOddNumbers = 0;
		int scores;
	
		for(odd = 1; odd <= 10; odd++) {
			
			System.out.println("Enter a score");
				scores = input.nextInt();

			if(odd % 2 == 1) {
				sumOfOddNumbers = sumOfOddNumbers + scores;
}
}
		System.out.printf("the sum of odd indices score is %d", sumOfOddNumbers);
}
}
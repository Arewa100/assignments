import java.util.Scanner;

public class SumOfEvenIndices {

	public static void main(String[] args) {
		System.out.println("Welcome. Today must be a very good day haha");
	
	Scanner input = new Scanner(System.in);
		
		int scores = 0;
		int indices;
		int evenIndices = 0;
			
			

		for(indices = 1; indices <= 10; indices++ ) {

			System.out.println("Enter a score");
				scores = input.nextInt();

				if(indices % 2 == 0) {
					evenIndices = evenIndices + scores;

}
			
}
			System.out.printf("the sum of even indices is %d", evenIndices);		
}
}
import java.util.Random;
import java.util.Scanner;

public class RockPaperGame {
	public static void main(String[] args) {
		System.out.println("Welcome to my rock paper scissors game\n");

	Scanner input = new Scanner(System.in);
	Random value = new Random();

		
		
		int computer;
		int user;
		
		System.out.println("Enter any number between 0, 1, 2");
			user = input.nextInt();

		computer = value.nextInt(2-0) + 0; 
			
			switch(computer) {
				case 0: 
					if(computer == 0 && user == 1) {
						System.out.println(" the computer is scissors, you are rock, you won");
		
					} 
					else if(computer == 0 && user == 2) {
						System.out.println(" the computer is scissors, you are paper, you lose");

					}
					else if(computer == 0 && user == 0) {
						System.out.println(" the computer is scissors, you are scissors too, it is a draw");

					}

					break;
				case 1:	

					if(computer == 1 && user == 0) {
						System.out.println(" the computer is rock, you are scissors, you lose");
		
					}
					
					else if(computer == 1 && user == 2){
						System.out.println(" the computer is rock, you are paper, you won");

					}

					else if(computer == 1 && user == 1) {
						System.out.println(" the computer is rock, you are rock too, it is a draw");

					}
								
					break;

				case 2:
					if(computer == 2 && user == 1) {
						System.out.println(" the computer is paper, you are rock, you lose");
		
					} 
					
					else if(computer == 2 && user == 0){
						System.out.println(" the computer is papar, you are scissors, you won");

					}

					else if(computer == 2 && user == 2) {
						System.out.println(" the computer is paper, you are paper too, it is a draw");

					}
	
					break;
				default:
					System.out.println("Enter a valid number");
}
			


}
} //end
			
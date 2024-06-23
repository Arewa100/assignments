import java.util.Scanner;
	public class Javascore {
 		
		public static void main(String[] args) {
			System.out.println("welcome to my exam status checker\n");

		Scanner input = new Scanner(System.in);
			
		
			int javaScore;
		
		
			System.out.println("Enter your score");
			javaScore = input.nextInt();

			if(javaScore >= 60) {
			System.out.println("You passed the exam");

} 			else  if(javaScore < 60) {
			System.out.println("You did not pass the exam");
			}
		System.out.printf("Enter your score %d", -1);
			javaScore = input.nextInt();	
}

}

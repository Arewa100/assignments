import java.util.Scanner;
public class Protest {
	public static void main(String[] args) {
		System.out.println("FIGHT TO WIN");
	
	Scanner input = new Scanner(System.in);
		
	String name;
	System.out.println("Enter your name");
		name = input.nextLine();
	System.out.printf("Welcome %s %n", name);
	
	ProtestDemands feedback = new ProtestDemands(); 
	
	String demands = feedback.protestdemands();
	
	System.out.printf("%s ", demands);
}	
}
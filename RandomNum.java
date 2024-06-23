import java.util.Random;
import java.util.Scanner;

public class RandomNum {
	public static void main(String[] args) {
		System.out.println("Welcome to my random number generator\n");
	
	Scanner input = new Scanner(System.in);
	Random value = new Random();


	int num;

	num = value.nextInt(7-1) + 1; 

	switch(num) {
	
		case 1: 
			System.out.println("VIOLET");
			break;
		case 2: 
			System.out.println("INDIGO");
			break;
		case 3:
			System.out.println("BLUE");
			break;
		case 4: 
			System.out.println("GREEN");
			break;
		case 5: 
			System.out.println("YELLOW");	
			break;
		case 6: 
			System.out.println("ORANGE");
			break;
		case 7: 
			System.out.println("RED");
			break;
		default: 
			
			

}

}
}

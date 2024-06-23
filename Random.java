import java.util.Random;
import java.util.Scanner;

public class Random {
	public static void main(String[] args) {
		System.out.println("Welcome to my random number generator\n");
	
	Scanner input = new Scanner(System.in);
	Random value = new Random();
	int num;
	num = value.nextInt(7);
	System.out.print(num);
}
}

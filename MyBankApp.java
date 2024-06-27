import java.util.Scanner;

public class MyBankApp {
	public static void main(String[] args) {
		System.out.println("Welcome to KOLO APP.");
		System.out.println("the most secure banking app\n");

	Scanner input = new Scanner(System.in);
		
		String name;
		int number;
		int con = 0;
	
		
		while(con != -1) {
	
		System.out.println("Enter your name");
			name = input.next();

		System.out.printf("Welcome to KOLO app %s, To bank with us enter the following to get started %n", name);
		
		
		System.out.println("press 1 to continue or -1 to end the app\n");
			con = input.nextInt();

		switch(con) {
			case 1:	
				String message = """
				1: transfer
				2: Airtime
				3: buy data
				4: share data
				99: go back
					""";

			System.out.println(message);

				number = input.nextInt();
		
					switch(number) {
						case 1:
							System.out.println("transfer\n");
							break;
						case 2:
							System.out.println("Airtime\n");
							break;
						case 3:
						System.out.println("buy data\n");
							break;
						case 4:
						System.out.println("share data\n");
							break;
						case 99:
						System.out.println("Go back\n");
							break;
						default: 
							System.out.println("invalid entry\n");
}

				break;
			
	
			default:
				System.out.println("end of app..");
}	
	//con = con + 1;
}
}
}

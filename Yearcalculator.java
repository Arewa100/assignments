//writing a program to calculate the number of years and days written by Olasoyin Miracle

/*THIS IS THE ALGOTITHM
1: to check the number of years and days based on minute input
2: let the number of minute be "M"
3: let the value of days be Xdays
4: let the number of years be Ydays
5: let total number of minute in a day be 1440 minute
6:  let Xdays be number of minute M divided by total number of minute in a day
7: let the total minute in a year be 525600
8: divide M by 525600 
9: store the answer as result
*/

//writing the program

import java.util.Scanner;

public class Yearcalculator {
	public static void main(String[] agrs){
		System.out.println("welcome to my year calculator");

	Scanner input = new Scanner(System.in);

	//declaring the variables
	int M;
	int Xdays;
	int Ydays;
	

	//calculating the years and days

		System.out.println("Enter your time in minute");
		M = input.nextInt();
		Xdays = (M/1440); // this gives the number of days
		Ydays = (M/525600); //this gives the number of years

	System.out.printf("%d minutes is equivalent to %d years and %d days \n", M, Ydays, Xdays);
}
}
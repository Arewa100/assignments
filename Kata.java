public class Kata {

	public static boolean isEven(int number) {
			
		int result;
		result  = (number % 2);
			if(result == 0) {
		return true;
}		else {
		return false;
}
}

	public static boolean isPrimeNumber(int number) {
		int counter = 1;
		int factorCounter = 0;
			
		while(counter <= number) {
			int argumentValue = (number % counter);

			if(argumentValue == 0 && counter != 1) {
				factorCounter = factorCounter + 1;
}
			counter = counter + 1;
}
		return (factorCounter == 1 ? true : false);
			
}


	public static int subtract(int firstNumber, int secondNumber) {
				int firstValue = (firstNumber - secondNumber);
				int secondValue = (secondNumber - firstNumber);
			if(firstNumber > secondNumber) {
				return firstValue;
}			else {
			return secondValue;
}
}
	public static float divide(int firstNumber, int secondNumber) {

			float quotient = (firstNumber / secondNumber);
				if(secondNumber == 0) {
				return 0;
}			else {
}				return quotient;
}
	public static int factorOf(int number) {
			int factorCounter = 0;
			int counter = 1;
		while(counter <= number) {
			int result = (number % counter);
				if(result == 0) {
			factorCounter = factorCounter + 1;
}
		counter = counter + 1;
}			
		return factorCounter;
}
	public static long factorialOf(int number) {

		long total = 1;
			while(number > 0) {
				int result = number--;
			total = total * result;
}
		return total;
}
	public static 
}
public class ValidationFunction {
	
	public int doubleEverySecondNumber(String creditCardNumber) {                 //"4388576018402626"
		final int STRING_LENGTH = creditCardNumber.length();  		      
		
		int count = (STRING_LENGTH - 2);
		int total = 0;

		while(count >= 0) {
			char value = creditCardNumber.charAt(count);
			String stringOfNumber = String.valueOf(value);
			int number = Integer.parseInt(stringOfNumber);

			number = (number * 2);

			if(number >= 10) {

				int firstNumber = (number % 10);   
				int secondNumber = (number / 10); 
				int sumOfDigits = (firstNumber + secondNumber);
				total = (total + sumOfDigits);

			} else {

				total = total + number;
			}
			
			
			count = count - 2;
		}
		
		
		
	
	return total; 
}
}
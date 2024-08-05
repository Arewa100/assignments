public class ValidationFunction {
	
	public int doubleEverySecondNumber(String creditCardNumber) {                 //"4388576018402626"
		final int STRING_LENGTH = creditCardNumber.length();  		      //
		
		int count = (STRING_LENGTH - 1);
		int total = 0;

		while(count >= 0) {
			char value = creditCardNumber.charAt(count);
			String stringOfNumber = String.valueOf(value);
			int number = Integer.parseInt(stringOfNumber);
			
			total = total + number;
			count = count - 2;
		}
		
		
		
	
	return number; 
}
}
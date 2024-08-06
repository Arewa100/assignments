public class ValidationFunction {
	
	public int doubleEverySecondNumber(String creditCardNumber) {                 
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
	public int sumNumbersInOddPositions(String creditCardNumber) {
		final int STRING_LENGTH = creditCardNumber.length();
		int count = 0;
		int totalOfNumbersInOddPositions = 0;

		while(count < STRING_LENGTH) {

			char value = creditCardNumber.charAt(count);
			String stringOfNumber = String.valueOf(value);
			int number = Integer.parseInt(stringOfNumber);
			if(count % 2 != 0) {
				totalOfNumbersInOddPositions = totalOfNumbersInOddPositions + number;
			}
			count = count + 1;
		}
	return totalOfNumbersInOddPositions;
}
	public String cardType(String creditCardNumber) {			////"4388576018402626"
		char firstType = creditCardNumber.charAt(0);
		char secondType = creditCardNumber.charAt(0);
		char thirdTypeFirstDigit = creditCardNumber.charAt(0);
		char thirdTypeSecondDigit = creditCardNumber.charAt(1);
		char fourthType = creditCardNumber.charAt(0);
		
		int firstCardDigit = Integer.parseInt(String.valueOf(firstType));
		int secondCardDigit = Integer.parseInt(String.valueOf(secondType));
		int thirdCardFirstNumber = Integer.parseInt(String.valueOf(thirdTypeFirstDigit));
		int thirdCardSecondNumber = Integer.parseInt(String.valueOf(thirdTypeSecondDigit));
		int fourthCardDigit = Integer.parseInt(String.valueOf(fourthType));

		if(firstCardDigit == 4) {
			return "VisaCard";

		} else if(secondCardDigit == 5) {
			return "MasterCard";

		} else if(thirdCardFirstNumber == 3 && thirdCardSecondNumber == 7) {
			return "American Express Cards";

		} else if(fourthCardDigit == 6) {
			return "Discover Cards";
		} else {
			return "Invalid Card";
		}
}
	public String[] card(String creditCardNumber) {
		
	ValidationFunction feedback = new ValidationFunction();
	
	String theTypeOfCard = feedback.cardType(creditCardNumber);

	int firstValue = feedback.doubleEverySecondNumber(creditCardNumber);
	int secondValue = feedback.sumNumbersInOddPositions(creditCardNumber);

	int sumOftheFirstAndSecondValues = (firstValue + secondValue);
	
	final int STRING_LENGTH = creditCardNumber.length();
	String creditCardDigitLength = String.valueOf(STRING_LENGTH);
	
	String message = "";
	if(sumOftheFirstAndSecondValues % 10 == 0) {
		message = "Credit Card Is Valid";
	} else {
		message = "Credit Card Is invalid";
	}
	
	String[] cardData = {theTypeOfCard, creditCardNumber, creditCardDigitLength, message};
	
	return cardData;
}
}
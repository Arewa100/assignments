public class MultipliCation { 
		
	public int multiply(int firstNumber, int secondNumber) {
		int product = 0;
	
	if(firstNumber < 0 && secondNumber < 0) {
		int firstNumberConverter = ~firstNumber;
		int secondNumberConverter = ~secondNumber;
		
		int number1 =  (firstNumberConverter + 1);
		int number2 = (secondNumberConverter + 1);
		
		int counter = 1;
		while(counter <= number1) {
			product = product +  number2;

			counter = counter + 1;
}	
		return product;	
}	
	if(firstNumber < 0) {
		int counter = 1;
			while(counter <= secondNumber) {
			product = product + firstNumber;	
			
			counter = counter + 1;
}
		return product;	
}
	else if (secondNumber < 0) {
		int counter = 1;
		while(counter <= firstNumber) {
			product = product + secondNumber;
			
			counter = counter + 1;
}
		return product;	
}
	else if(firstNumber == 0 || secondNumber == 0) {
		return 0;
}	
	else {
		int counter = 1;
		while(counter <= firstNumber) {
			product = product + secondNumber;
			
			counter = counter + 1;
}
}
	return product;
}	
}
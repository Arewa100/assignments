public class MultipliCation { 
		
	public int multiply(int firstNumber, int secondNumber) {
		int product = 0;
		
		if(firstNumber < secondNumber) {
		while(firstNumber <= secondNumber) {
			product = product + firstNumber;
			
			firstNumber = firstNumber + 1;
			
}
		return product;
}		
		else  {
		while(secondNumber <= firstNumber) {
			product = product + secondNumber;
			
			secondNumber = secondNumber + 1;

}	
		return product;	
}
}
}
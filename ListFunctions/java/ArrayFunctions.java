public class ArrayFunctions {
	
	public int largest(int[] numbers) {
		int largestNumber = 0;
		for(int counter = 0; counter < numbers.length; counter++) {
			if(numbers[counter] > largestNumber) {
				largestNumber = numbers[counter];
			}
		}
		return largestNumber;
}
	public int[] reverse(int[] numbers) {     
		int[] reversedArray = new int[6];   
		int arrayElement = 0;
		int count = 0;
		for(int counter = numbers.length-1 ; counter >= 0; counter--) {   
			arrayElement = numbers[counter];
			reversedArray[count] = arrayElement;
			count = count + 1;
		}	
		
		return reversedArray;
}
	public String find(int element, int[] numbers) {
			int checkElement = 0;
			String message = "";
		for(int count = 0; count < numbers.length; count++) {
			checkElement = numbers[count];
			if(element == checkElement) {
				message = "element occurs";
				return message;
			} 

		}
		
		return "element does not exist";
}
	public int[] oddpositions(int[] numbers) {
		int[] elementsOnOddPosition = new int[6];

		int element = 0;
		for(int count = 0; count < numbers.length; count++) {
			if(count % 2 == 1) {
				element = numbers[count];
				elementsOnOddPosition[count] = element;
			}
		}
		return elementsOnOddPosition;
}
	public int[] evenpositions(int[] numbers) {
		int[] elementsOnEvenPosition = new int[6];

		int element = 0;
		for(int count = 0; count < numbers.length; count++) {
			if(count % 2 == 0) {
				element = numbers[count];
				elementsOnEvenPosition[count] = element;
			}
		}
		return elementsOnEvenPosition;
}
	public int arraytotal(int[] number) {
		int total = 0;
		for(int num: number) {
		total = total + num;
		}
		return total;
}
}	
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
}	
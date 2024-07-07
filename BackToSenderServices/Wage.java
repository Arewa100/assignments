public class Wage {
	
	public static int payment(int successfulDelivery) {

		int deliveryLessThanfiftyPercent;
		int deliverGreaterThanFiftyPercent;
		int deliveryGreaterThanSixty;
		int deliveryGreaterAndEqualToSeventyPercent;
		
		if(successfulDelivery < 50) {
			int value = (successfulDelivery * 160);
			deliveryLessThanfiftyPercent = (value + 5000);
			
		return deliveryLessThanfiftyPercent;
}
		else if(successfulDelivery < 60) {
			int value = (successfulDelivery * 200);
			deliverGreaterThanFiftyPercent = (value + 5000);
		return deliverGreaterThanFiftyPercent;

}		else if(successfulDelivery < 70) {
			int value = (successfulDelivery * 250);
			deliveryGreaterThanSixty = (value + 5000);
		return deliveryGreaterThanSixty;

}		else  {
			int value = (successfulDelivery * 500);
			deliveryGreaterAndEqualToSeventyPercent = (value + 5000);
		return deliveryGreaterAndEqualToSeventyPercent;
}
}
}
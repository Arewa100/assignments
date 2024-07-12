public class Tax {

	public double calculator(double taxAmount) {
			double result;
		if(taxAmount <= 30000) {
			result = (taxAmount * 0.15);
			return result;
}		else {
			result = (taxAmount * 0.2);
			return result;
}
}
}
public class CitizenTax {
	private String name;
	private double yearlyEarning;

	public void setName(String citizenName){
		name = citizenName;
}
	public void setEarnings(double citizenEarnings) {
		yearlyEarning = citizenEarnings;
}
	public double getYearlyIncomeTax() {
		Tax tax = new Tax(); 
		double result = tax.calculator(yearlyEarning);

		return result;
}
}
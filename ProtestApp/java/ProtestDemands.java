import java.security.SecureRandom;

public class ProtestDemands {
	
	public String protestdemands() {
	SecureRandom random = new SecureRandom();
	
	String[] demandArrays = {"end bad governance", "build good roads", "we don't want Tinubu", "give us electricity, we are tired", "end corruption", "we want good roads", "no protest, we want peace", "we want Tinubu", "things are expensive", "increase salaries", "end police brutality", "build our roads", "give us more jobs", "stop exportation", "increase minimum wage", "build our schools", "reduce the price of fuel", "divide Nigeria", "we want good governance", "tired of anti-government policies", "we condemn the cost of governance", "petrol pump and food prices is too high"};

	int randomValue = 1 + random.nextInt(22);
	
	String demand = demandArrays[randomValue];
		
	return demand;
	

}	
}
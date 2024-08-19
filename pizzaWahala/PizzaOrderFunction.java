public class PizzaOrderFunction {
	
	private int pizzaType;
	private int numberOfPeople;
	
	public void getOrder(int numberOfPeople, int pizzaType) {
		this.numberOfPeople = numberOfPeople;
		this.pizzaType = pizzaType;
	}
	
		
	public int pizzaTypeCalculator() {
		int numberOfBoxes = 1;

		if(pizzaType == 1) {
			int numberOfSlices = 4;
			boolean flag = true;
			while(flag) {
				if(numberOfSlices < numberOfPeople) {
					numberOfBoxes = numberOfBoxes + 1;
					numberOfSlices = numberOfSlices + 4;
				}else {
					flag = false;
				}
			}

		} else if(pizzaType == 2) {
			int numberOfSlices = 6;
			boolean flag = true;
			while(flag) {
				if(numberOfSlices < numberOfPeople) {
					numberOfBoxes = numberOfBoxes + 1;
					numberOfSlices = numberOfSlices + 6;
				}else {
					flag = false;
				}
			}

		} else if(pizzaType == 3) {
			int numberOfSlices = 8;
			boolean flag = true;
			while(flag) {
				if(numberOfSlices < numberOfPeople) {
					numberOfBoxes = numberOfBoxes + 1;
					numberOfSlices = numberOfSlices + 8;
				}else {
					flag = false;
				}
			}

		} else if(pizzaType == 4) {
			int numberOfSlices = 12;
			boolean flag = true;
			while(flag) {
				if(numberOfSlices < numberOfPeople) {
					numberOfBoxes = numberOfBoxes + 1;
					numberOfSlices = numberOfSlices + 12;
				}else {
					flag = false;
				}
			}
		}


		return numberOfBoxes;
	}

	public int[] getEstimate() {
		
		int numberOfBoxes = pizzaTypeCalculator();
		int numberOfLeftOverSlices = 0;
		int totalCost = 0;
		int[] feedback = new int[3];

		if(pizzaType == 1) {

			int totalNumberOfSlices = (numberOfBoxes * 4);
			numberOfLeftOverSlices = (totalNumberOfSlices - numberOfPeople);
			totalCost = (numberOfBoxes * 2000); 
			feedback[0] = numberOfBoxes;
			feedback[1] = numberOfLeftOverSlices;
			feedback[2] = totalCost;
			return feedback;
			
		}else if(pizzaType == 2) {

			int totalNumberOfSlices = (numberOfBoxes * 6);
			numberOfLeftOverSlices = (totalNumberOfSlices - numberOfPeople);
			totalCost = (numberOfBoxes * 2400); 
			feedback[0] = numberOfBoxes;
			feedback[1] = numberOfLeftOverSlices;
			feedback[2] = totalCost;
			return feedback;
			
		}else if(pizzaType == 3) {

			int totalNumberOfSlices = (numberOfBoxes * 8);
			numberOfLeftOverSlices = (totalNumberOfSlices - numberOfPeople);
			totalCost = (numberOfBoxes * 3000); 
			feedback[0] = numberOfBoxes;
			feedback[1] = numberOfLeftOverSlices;
			feedback[2] = totalCost;
			return feedback;
			
		}else {
			int totalNumberOfSlices = (numberOfBoxes * 12);
			numberOfLeftOverSlices = (totalNumberOfSlices - numberOfPeople);
			totalCost = (numberOfBoxes * 4200); 
			feedback[0] = numberOfBoxes;
			feedback[1] = numberOfLeftOverSlices;
			feedback[2] = totalCost;
			return feedback;
			
		}
		
	
	}
}
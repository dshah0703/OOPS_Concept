package devanshishah_sec402_ex03;

public abstract class Mortgage implements MortgageConstants {
	
	int mortgageNumber;
	String customerName;
	double amountOfMortgage;
	double interestRate = 9.0;
	int term=0;
	
	public Mortgage() {
	}
	
	public Mortgage(
			int mortgageNumber, 
			String customerName, 
			double amountOfMortgage, 
			double interestRate, 
			int term) 
	{
		
		this.mortgageNumber = mortgageNumber;
		this.customerName = customerName;
		
		// checking the maximum amount for mortgage
		if(amountOfMortgage > MAX_AMOUNT) {
			throw new ArithmeticException("Mortgage amount is not valid.");  
		}
		
		this.amountOfMortgage =  amountOfMortgage ;
		this.interestRate = interestRate;
			
		// setting mortgage term that is not defined in the MortgageConstants interface to a short-term, one year loan
		switch(term) {
			case 1:
			case 2:
			case 3: this.term = term;
					break;
			default: this.term = SHORT_TERM;
		}	
	}
	
	// method for displaying all the mortgage data
	abstract void getMortgageInfo();
	// method for finding total amount after interest
	abstract double totalAmountOwed();
}

package devanshishah_sec402_ex03;



public class PersonalMortgage extends Mortgage {
	
	// constructor setting the interest rate to 2% over the current prime rate 
	public PersonalMortgage(
			int mortgageNumber, 
			String customerName, 
			double amountOfMortgage, 
			double interestRate, 
			int term) 
	{
		super(mortgageNumber, customerName, amountOfMortgage, interestRate + 2, term);
	}
	
	@Override
	void getMortgageInfo() {
		
		 System.out.println("Mortgage Number: "+ mortgageNumber);
		 System.out.println("Customer Name: "+ customerName);
		 System.out.println("Amount Of Mortgage: "+amountOfMortgage);
		 System.out.println("Interest Rate: "+ interestRate);
		 System.out.println("Total Amount Owed:" + totalAmountOwed());
		 System.out.println("Term: "+ term);
	 
	}
	
	// function for finding total amount after new interest rate
	@Override
	public double totalAmountOwed() {
		
		double totalAmount = amountOfMortgage + ((amountOfMortgage*interestRate*term)/100);
		return totalAmount;
	}

}

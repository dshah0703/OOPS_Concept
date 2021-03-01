package devanshishah_sec402_ex01;

public class Life extends Insurance {
	
////class health is extending the methods of Insurance class	
public Life(String insuranceType, double monthlyCost) {
	super(insuranceType, monthlyCost);
}
	@Override
	public void setInsuranceCost() {
		// TODO Auto-generated method stub
		
	}
	//For displaying the information.
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		String type = getInsuranceType();
		System.out.printf("The insurance you have opted for is: ");
		System.out.printf(type);
		System.out.println();
		System.out.printf("The Monthly cost for Life Insurance is: ");
		System.out.printf("%.2f",  getMonthlyCost());
		
	}


	

}
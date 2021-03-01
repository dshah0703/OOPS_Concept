package devanshishah_sec402_ex01;
//Insurance class is a super class(parent) and will have health and life as their child class.
//declaring two data types of string and double.
public abstract class Insurance {
	String insuranceType;
	double monthlyCost;

	public Insurance(String insuranceType, double monthlyCost) {
		// TODO Auto-generated constructor stub
		this.insuranceType = insuranceType;
		this.monthlyCost = monthlyCost;
	}
// get 	method for String type
	public String getInsuranceType() {
		return insuranceType;
	}
//get method for double type.
	public double getMonthlyCost() {
		return monthlyCost;
	}
// declaring abstract method
	abstract void setInsuranceCost();
	abstract void displayInfo();
	
}	

package devanshishah_sec402_ex01;

import java.util.Scanner;

public class InsuranceTest {
//driver class code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String insuranceType;
		
		double monthlyCost = 0;
		
		Insurance[] insurance = new Insurance[1];
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the type of insurance: ");
			insuranceType = sc.next();
			System.out.println("Please enter monthy insurance cost: ");
			monthlyCost = sc.nextDouble();
		}
		if ("Life".equalsIgnoreCase(insuranceType)) {
        	
        	// creating an object of super class with the reference of its subclass. This shows the Polymorphism concept
        	Insurance lifeInsurance = new Life(insuranceType, monthlyCost);
        	insurance[0] = lifeInsurance;
        	lifeInsurance.displayInfo();
		    
		}
        else if ("Health".equalsIgnoreCase(insuranceType))
		{
        	// creating an object of super class with the reference of its subclass. This shows the Polymorphism concept
        	Insurance healthInsurance = new Health(insuranceType, monthlyCost); 
        	insurance[0] = healthInsurance;
        	healthInsurance.displayInfo();
		}
        else
        	//it will throw an error if the user writes anything apart from Life and Health.
        {
        	throw new IllegalArgumentException(
                    "Insurance type must be either Life or Health");
        }
        
        //Currently we are just creating one object at a time so the array will contain one object per execution. similarly we can store other objects in the array as well
        for (int j = 0; j < insurance.length; j++) {
           System.out.println();
           System.out.printf("Insurance %d is a %s%n", j, insurance[j].getClass().getName()); 
        }
       }
}

package devanshishah_sec402_ex03;



import java.util.Scanner;

public class ProcessMortgage {

	public static void main(String[] args) {
		
		System.out.println("City Toronto Bank Mortgages Department\n");
		Scanner sc = new Scanner(System.in);
		
		// an array of size 3 to store 3 mortgage objects. So it will ask the user 3 time their details.
		Mortgage[] mortgageList = new Mortgage[3]; 
		
		System.out.println("Please Enter Interest rate: ");
		int interestRate = sc.nextInt();
		
		// looping the prompts the user for a mortgage type and all relevant information for that mortgage
		for(int i=0; i < mortgageList.length; i++) {
			
			// taking mortgage information from the user
			System.out.println("Please Enter Mortgage type (Personal or Business): ");
			String mortgageType = sc.next();
			
			System.out.println("Please Enter Mortgage Number: ");
			int mortgageNumber = sc.nextInt();
			
			System.out.println("Please Enter Customer Name: ");
			String customerName = sc.next();
						
			System.out.println("Please Enter Amount: ");
			int mortgageAmount = sc.nextInt();
			
			System.out.println("Please Enter term: ");
			int term = sc.nextInt();
			
			Mortgage mortgage;	
				
			if(mortgageType.equalsIgnoreCase("Personal")) {
				
				mortgage = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, interestRate, term);
				
			}else if(mortgageType.equalsIgnoreCase("Business")) {
				
				mortgage = new BusinessMortgage(mortgageNumber, customerName, mortgageAmount, interestRate, term);
				
			}else {
				
				sc.close();
				throw new RuntimeException("Mortgage type must be either Personal or Business"); 
				
			}
			
			// storing mortgage objects in the array
			mortgageList[i] = mortgage;
			
		}
		
		System.out.println("The Mortgage information:\n");
		
		//  displaying all the mortgages information
		for(Mortgage  mortgageObj : mortgageList) {
			
			mortgageObj.getMortgageInfo();
			System.out.println();
			
		}
			
		sc.close();
	}
}

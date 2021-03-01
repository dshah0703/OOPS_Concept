package devanshishah_sec402_ex02;

public class FullTimeGameTester extends GameTester{
	
	// assigning a base salary
	double salary = 3000;
	
	public FullTimeGameTester(String testerType, boolean status) {
		super(testerType, status);
	}
	
	// overriding the salary method
	@Override
	public void salary() {
		System.out.printf("\nSalary for the Full Time Game Tester is $%.2f ", salary);
	}

}
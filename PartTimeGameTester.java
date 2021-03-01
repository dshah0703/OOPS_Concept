package devanshishah_sec402_ex02;

public class PartTimeGameTester extends GameTester {
	
    double hour;
    
	public PartTimeGameTester(String name, boolean status, double hour) {
		super(name, status);
		this.hour = hour;
	}

	// overriding the salary method
	@Override
	public void salary() {
		System.out.printf("\nSalary for the Part time tester is $%.2f per hour", 20*hour);
	}


}

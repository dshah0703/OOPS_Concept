package devanshishah_sec402_ex02;
//created an abstract class
// it will include the status of game tester the user is, i.e. full time or part time with its name. 
public abstract class GameTester {
	String nameOfGameTester;
	boolean status;
	
	public GameTester(String name, boolean status) {
		super();
		nameOfGameTester = name;
		this.status = status;
	}
	
	// get method for game tester name
	public String getName() {
		return nameOfGameTester;
	}
	
	// set method for game tester name
	public void setName(String name) {
		nameOfGameTester = name;
	}

	public boolean isStatus() {
		return status;
	}
	
	// set method for status of game tester name
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	// abstract method to determine the salary
	abstract void salary();

}


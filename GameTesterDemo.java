package devanshishah_sec402_ex02;

import java.util.Scanner;

public class GameTesterDemo {

	public static void main(String[] args) {
		
		// variables
		String testerType;
		boolean status;
		double hour;
		
		try (
			// taking input from the user	
			Scanner sc = new Scanner(System.in)) {
		
			System.out.println("Please Enter the Type of Game Tester Mode(Part-time or Full-time):");
			testerType = sc.next();
			if(testerType.contains("Full-Time") || testerType.contains("FULL-TIME") || testerType.contains("full-time"))
			{
				status = true;
				FullTimeGameTester fullTimeTester =  new FullTimeGameTester(testerType, status); 
				//object assignment
				GameTester gameTester = fullTimeTester;
				gameTester.salary();
			}
			else if(testerType.contains("Part-Time") || testerType.contains("PART-TIME") || testerType.contains("part-time"))
			{
				status = true;
				System.out.println("Please enter the Hours for the Part time game tester");
				hour = sc.nextDouble();
				PartTimeGameTester partTimeTester = new PartTimeGameTester(testerType, status, hour);
				// object assignment
				GameTester gameTester = partTimeTester;
				gameTester.salary();
			}
			else
			{
				// if user enters wrong input, apart from full-time or part-time then it will generate error.
				throw new IllegalArgumentException(
			            "Enter the accurate Tester,'full-time' or 'part-time' ");
			}
		}
	}
}


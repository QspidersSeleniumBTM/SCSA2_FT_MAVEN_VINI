package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void run()
	{
		System.out.println("I am sop msg");
		Reporter.log("I am Reporter msg");
		Reporter.log("I am both reporter and sop msg", true);
	}

}

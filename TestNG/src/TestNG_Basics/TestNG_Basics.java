package TestNG_Basics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNG_Basics {

	@Test(groups = {"smoke"})
	
	public void Demo() {
		
		System.out.println("Bye");
	}
	@AfterTest
	public void After()
	{
		System.out.println("AfterTest");
	}
		
		
	}



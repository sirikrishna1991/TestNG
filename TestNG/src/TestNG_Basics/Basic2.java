package TestNG_Basics;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic2 {

	@Test(groups = {"smoke"})
	public void Basic()
	{
		System.out.println("Hello");
	}
	@Test
	public void Demo1()
	{
		System.out.println("hi");
	}
	
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will excute first");
	}
	@BeforeSuite
	public void BFsuite()
	{
		System.out.println("Im 1st King");
	}


}

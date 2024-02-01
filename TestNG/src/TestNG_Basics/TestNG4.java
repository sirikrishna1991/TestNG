package TestNG_Basics;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG4 {
	@Test
	public void MobileloginHomeLoan()
	{
		System.out.println("webloginHomeLoan");
	}
	@BeforeMethod
	public void BFtest()
	{
		System.out.println("Im great test eng");
	}
	@Test
	public void MobileloginHomeloan()
	{
		System.out.println("mobileloginHomeLoan");
	}
	@Test
	public void MobileloginAPIHomeloan()
	{
		System.out.println("APILoginHomeloan");
	}
	@AfterSuite
	public void AFsuite()
	{
		System.out.println("Im 1st King from last");
	}

}

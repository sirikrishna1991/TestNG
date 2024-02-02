package TestNG_Basics;

import org.testng.annotations.Test;

public class TestNG3 {

	@Test(groups = {"smoke"})
	public void WeblogincarLoan()
	{
		System.out.println("weblogincar");
	}
	@Test
	public void Mobileloginloan()
	{
		System.out.println("mobilelogin");
	}
	@Test
	public void loginAPIloan()
	{
		System.out.println("APIlogin");
	}
	

}

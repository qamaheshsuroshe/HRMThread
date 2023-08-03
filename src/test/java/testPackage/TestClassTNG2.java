package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassTNG2 {
	@Parameters({"browserName"})
	@BeforeTest
	public void beforeTest(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			System.out.println("Opening the Chrome browser");
		}
		else if(browserName.equals("firefox"))
		{
			System.out.println("Opening the firefox browser");
		}
		else if(browserName.equals("safari"))
		{
			System.out.println("Opening the safari browser");
		}
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass of Class2");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod of Class2");
	}
	@Test
	public void test1()
	{  System.out.println("test1 of Class2");  }
	
	@Test
	public void test2()
	{  System.out.println("test2 of Class2"); }
	@Test
	public void test3()
	{ System.out.println("test3 of Class2");  }
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass of Class2");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest of Class2");
	}
	

}



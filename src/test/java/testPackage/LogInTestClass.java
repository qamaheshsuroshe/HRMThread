package testPackage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPackage1.LogInPage;

public class LogInTestClass extends BaseClass {
	@BeforeMethod
	 public void beforeMethod()
	 {
		 System.out.println("beforeMethod of Class1");
	 }
	 @Test(priority=0)
	 public void verifyLoginFunctionalityWithCorrectData() throws InterruptedException
	 {
		 logger=report.createTest("Verify login functionality with correct data");
		 
		 LogInPage login=new LogInPage(driver);
		 SoftAssert s=new SoftAssert();
		 login.sendUsername("Admin");
		 login.sendPassword("admin123");
		 login.LoginButtonClick();
		 Thread.sleep(2000);
		// boolean result=login.CheckVisibilityofAdminTab();
		System.out.println("soft assert is executed");
		
		Assert.assertEquals(login.getURL(),login.actualURL());
		
		System.out.println("test case ENDED");
		//logger.pass("Test case is pass");
		
	 }
	 @Test(priority=1)
	 public void VerifyLoginFunctionalityWithIncorrectData() 
	{
		 logger=report.createTest("Verify login functionality with incorrect data");
		 LogInPage login=new LogInPage(driver);
		 login.sendUsername("Admin");
		login.sendPassword("admin1234");
		 login.LoginButtonClick();
	System.out.println("VerifyLoginFunctionalityWithIncorrectData");
	
	
	 	


	}

}

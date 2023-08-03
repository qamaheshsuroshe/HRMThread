package pomPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement admin;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void VerifyAdminTab() throws InterruptedException
	{
		Thread.sleep(2000);
		admin.isDisplayed();
	}

}

package pomPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage 
{
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy (xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy (xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement admin;
	
	public LogInPage(WebDriver driver)
	{this.driver=driver;//stored local driver in global driver;
	 
		PageFactory.initElements(driver,this);
		
	}
	public void sendUsername(String use)
	{
		username.sendKeys(use);
	}
	public void sendPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void LoginButtonClick()
	{
		loginButton.click();
	}
	public boolean compareCurrentURL()
	{
		String ExpectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index.php/dashboard";
		String url=driver.getCurrentUrl();
		boolean result=ExpectedURL.equals(url);
		return result;
	}
	public boolean CheckVisibilityofAdminTab()
	{
		boolean result=admin.isDisplayed();
		return result;
	}
	public String getURL()
	{
		String result=driver.getCurrentUrl();
		return result;
	}
	public String actualURL()
	{
		String result="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		return result;
	}
}

	



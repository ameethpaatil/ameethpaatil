package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public WebDriver driver;

	private By username= By.xpath("//input[@id='username']");
	private By password= By.xpath("//input[@id='password']");
	private By LoginButton = By.xpath("//input[@id='Login']");
	private By tryForFree = By.xpath("//a[@id='signup_link']");
	
	public LoginPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}
	public WebElement EnterUsername() {
		return driver.findElement(username);
	}
	public WebElement EnterPassword()
	{
		return driver.findElement(password);
	}
	public WebElement LoginClick()
	{
		return driver.findElement(LoginButton);
	}
	public WebElement ClcikOnTryForClick()
	{
		return driver.findElement(tryForFree);
	}
}

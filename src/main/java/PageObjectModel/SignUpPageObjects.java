package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
	public WebDriver driver;
	private By firstName = By.xpath("//input[@name='UserFirstName']");
	private By JobTitle = By.xpath("//select[@name='UserTitle']");
	private By lastName = By.xpath("//input[@name='UserLastName']");
	private By userEmail = By.xpath("//input[@name='UserEmail']");
	private By companyName = By.xpath("//input[@name='CompanyName']");
	private By Employee = By.xpath("//select[@name='CompanyEmployees']");
	private By phone	= By.xpath("//input[@name='UserPhone']");
	private By companyCountry = By.xpath("//select[@name='CompanyCountry']");
	
///	private By checkagree = By.xpath("//input[@id='SubscriptionAgreement']");
	private By checkagree = By.xpath("//div[@class='msaCheckbox checkboxInput section']//div//div[@class='checkbox-ui']]");
	
	
	public SignUpPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}
	public WebElement EnterFirstName()
	{
		return driver.findElement(firstName);
	}
	public WebElement SelectJobTitle() {
		return driver.findElement(JobTitle);		
	}
	
	public WebElement EnterLastName()
	{
		return driver.findElement(lastName);
	}
	
	public WebElement EnterUserEmail()
	{
		return driver.findElement(userEmail);
	}
	
	public WebElement EnterCompanyName()
	{
		return driver.findElement(companyName);
	}
	
	public WebElement CheckAgree() {
		return driver.findElement(checkagree);		
	}
	
	public WebElement SelectEmployee() {
		return driver.findElement(Employee);		
	}
	
	public WebElement SelectCompanyCountry() {
		return driver.findElement(companyCountry);		
	}
	
	public WebElement EnterPhone()
	{
		return driver.findElement(phone);
	}
	
}

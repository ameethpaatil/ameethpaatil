package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;

	public WebDriver browserLaunch() throws IOException 
	{
		//FileInputStream fis = new FileInputStream("C:\\Users\\ameethpaatil\\eclipse-workspace\\20thJuneTestNGFramework\\src\\main\\java\\Resources\\data.properties");
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		prop = new Properties();
		prop.load(fis);
		
		String  browserName = prop.getProperty("Browser");
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			//WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().driverVersion("104.0.5112.102").setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			//fire fox code
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			//edge code
		}
		else
		{
			System.out.print("Please select proper browser");
		}
		return driver;		
	}
	@BeforeMethod
	public void LaunchBrowser() throws IOException
	{
		browserLaunch();
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	
}
	
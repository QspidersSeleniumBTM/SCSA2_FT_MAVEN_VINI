package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static WebDriver driver;
	public void CommonCheez(String browser,String url)
	{
		if (browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "/.Driver/chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "/.Driver/geckodriver.exe");
		driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("entervalid browser");
		}
		driver.manage().window().maximize();
		driver.get(url);
	}
}

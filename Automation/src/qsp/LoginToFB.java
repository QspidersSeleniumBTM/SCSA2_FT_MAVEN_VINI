package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToFB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110)");
		String LoginTitle = driver.getTitle();
		System.out.println(LoginTitle);
if(LoginTitle.equals("Log in to Facebook | Facebook"))
{
	System.out.println("login page is displayed ==>PASSED");
	
}
else
{
	System.out.println("login page is not displayed ==>FAILED");
}
		
Thread.sleep(2000);


driver.findElement(By.id("email")).sendKeys("7873833029");
Thread.sleep(1000);



driver.findElement(By.id("pass")).sendKeys("mpgkilu");
Thread.sleep(1000);

driver.findElement(By.id("loginbutton")).click();
Thread.sleep(2000);

String homeTitle=driver.getTitle();
System.out.println(homeTitle);
if(homeTitle.equals("Facebook "))
{
	System.out.println("Home page is displayed ==>PASSED");
	
}
else
{
	System.out.println("home page is not displayed ==>FAILED");
}



		
		
	}

}

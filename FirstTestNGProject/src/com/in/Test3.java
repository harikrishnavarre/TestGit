package com.in;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test3 {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","D:/_MySelenium/With_Java/TravalExpenseApplication/drivers/IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		
		capabilities.setCapability("requireWindowFocus", true);
		 driver = new InternetExplorerDriver(capabilities);
		try{


		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		//driver.get("http://register.rediff.com/register/register.php");

		Thread.sleep(2000);

		WebElement e = driver.findElement(By.xpath("//*[@id='email']"));
		//using Keys.TAB
		/*e.sendKeys(Keys.TAB);
		e.sendKeys(Keys.TAB);
		e.sendKeys(Keys.TAB);
		e.sendKeys(Keys.TAB);
		e.sendKeys(Keys.TAB);*/
		//using Actions

		Actions action = new Actions(driver);

		action.sendKeys(e,Keys.TAB).sendKeys("sssss").build().perform();
		}

		catch(Exception e){

		System.out.println("Exception - > " + e.toString());

		}

		finally{

		driver.close();
		driver.quit();

		}

	}

}

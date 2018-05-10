package com.in;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Test2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.out.println("one");
		Screen screen =new Screen();
		System.out.println("one2");
		Pattern p =new Pattern("D:\\_MySelenium\\With_Java\\TravalExpenseApplication\\images\\username.PNG");
		Pattern p1 =new Pattern("D:\\_MySelenium\\With_Java\\TravalExpenseApplication\\images\\password.PNG");
		Pattern p2 =new Pattern("D:\\_MySelenium\\With_Java\\TravalExpenseApplication\\images\\click.PNG");
		System.out.println("one2");
		System.setProperty("webdriver.ie.driver","D:/_MySelenium/With_Java/TravalExpenseApplication/drivers/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://bldvhkgahq13/TEHK/Default.aspx?DiffUser=true");
		
		screen.type(p, "BLASIA\\\\GoundA");
		//screen.type(p,"");
		
		

		screen.type(p1,"Bausch@02");
		screen.click(p2);
		
	}

}

package Academy.Smallcase;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import pageobject.Amazoncomman;
import pageobject.Landingpage;
public class Amazon extends Resource.base {

public WebDriver driver;
public static Logger Log=LogManager.getLogger(Resource.base.class.getName()); 

@BeforeTest 
public void  intialisedrive() throws IOException
{
driver=initializeDriver();

}
	


	@Test()
	public void homepageNavigation() throws IOException, InterruptedException
	{
    driver.get(prop.getProperty("url1"));
    
	//Clicking on Cross button
	
   
    Amazoncomman a=new Amazoncomman(driver);
	a.gettext().click();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    a.gettext().sendKeys( "vu tv");
    a.getsearchclick().click();
    a.getOnidaClick().click();
    
  driver.manage().window().maximize();
  driver.get("https://www.amazon.in/Onida-Inches-Ready-Smart-IPS/dp/B0816ZQ8TZ/ref=sr_1_1?dchild=1&keywords=onida+tv&qid=1600967608&sr=8-1#");
 String ab=driver.getWindowHandle();
 driver.switchTo().window(ab);
 Thread.sleep(3000);
  a.getAddCart().click();
 
 // driver.findElement(By.xpath("(//input[@type='submit'])[5]")).click();//
   
   
   
	}
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
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

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import pageobject.Landingpage;
public class Flipkart extends Resource.base {

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
    driver.get(prop.getProperty("url"));
    
	//Clicking on Cross button
	
   
	Landingpage l=new Landingpage(driver);
	l.getsigninclick().click();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    l.gettext().sendKeys( "vu tv");
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    l.getpress().click();
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    driver.findElement(By.cssSelector("svg")).click();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  
   driver.findElement(By.cssSelector("div._3wU53n")).click();
   driver.manage().window().maximize();
   String winHandleBefore = driver.getWindowHandle();
   for(String winHandle : driver.getWindowHandles()){
      driver.switchTo().window(winHandle);
      Thread.sleep(6000);
      new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"))).click();
   }
   
   //sdriver.navigate().to("https://www.flipkart.com/viewcart?otracker=PP_GoToCart");
 //  
  // ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
  // driver.switchTo().window(a.get(1));
 
  // Thread.sleep(60000);
// WebDriverWait wait = new WebDriverWait(driver, 30);
 //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='ADD TO CART']"))).click();
  
  
  
   
   
   
	}
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
	

	
	
	
	


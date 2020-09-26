package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Landingpage {

	public WebDriver driver;
	
	
	By Search=By.cssSelector("input[placeholder='Search for products, brands and more']");
	
		
		
	
	By Symbol=By.cssSelector("svg");
	By Signincross=By.xpath("//button[@class='_2AkmmA _29YdH8']");
	
	public Landingpage(WebDriver driver) {  //created constructor to give life to the driver
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	

	
	public WebElement gettext()
	{
		return driver.findElement(Search);
	}
	
	public WebElement getpress()
	{
		return driver.findElement(Symbol);
	}

	public WebElement getsigninclick()
	{
		return driver.findElement(Signincross);
	}
	
}

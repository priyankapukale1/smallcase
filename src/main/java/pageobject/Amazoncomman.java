package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Amazoncomman {

	public WebDriver driver;
	
	By Search=By.id("twotabsearchtextbox");
	By SClick=By.xpath("//input[@value='Go']");
	By OnidaClick=By.cssSelector("span.a-size-medium.a-color-base.a-text-normal");
	By AddCart=By.xpath("//input[@id='add-to-cart-button']");
	public Amazoncomman(WebDriver driver) {  //created constructor to give life to the driver
		// TODO Auto-generated constructor stub
		this.driver=driver;
}


	
	public WebElement gettext()
	{
		return driver.findElement(Search);
	}
	public WebElement getsearchclick()
	{
		return driver.findElement(SClick);
	}
	public WebElement getOnidaClick()
	{
		return driver.findElement(OnidaClick);
	}
	public WebElement getAddCart()
	{
		return driver.findElement(AddCart);
	}
	
	
}
	

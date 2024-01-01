package testing.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testing.pageObjects.OrderPage;
import testing.pageObjects.cartPage;

public class AbstractComponent {
	
	WebDriver driver;
	
	public AbstractComponent(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="[routerlink*='cart']")
	WebElement cartHeader;
	
	@FindBy(css="[routerlink*='myorders']")
	WebElement orderHeader;

	public void waitForElementToAppear(By FindBy) 
	{
		
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(FindBy));
	
	}
	
	public void waitForWebElementToAppear(WebElement FindBy) 
	{
		
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	  wait.until(ExpectedConditions.visibilityOf(FindBy));
	
	}
	
	public cartPage goToCartPage()
	{
		cartHeader.click();
		cartPage cart = new cartPage(driver);
		return cart;
	}
	
	
	public OrderPage goToOrderPage()
	{
		orderHeader.click();
		OrderPage order = new OrderPage(driver);
		return order;
	}
	
	
	public void waitForElementToDisappear(WebElement ele) throws InterruptedException
	{
	    Thread.sleep(1000);
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	
}

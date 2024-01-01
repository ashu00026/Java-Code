package testing.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import testing.AbstractComponents.AbstractComponent;

public class checkoutPage extends AbstractComponent {
	   WebDriver driver;
	
	
	   
	   
	   @FindBy(css="[placeholder = 'Select Country']")
		WebElement country;

		@FindBy(css=".action__submit ")
		WebElement submit;
		
		@FindBy(xpath="(//button[contains(@class,'ta-item')])[2]")
		WebElement selectCountry;

		By results = By.cssSelector(".ta-results");
	
	
	
		public checkoutPage(WebDriver driver) {
			
			super(driver);
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}


		public void selectCountry(String countryName)
	    {
	    	
	    	Actions a = new Actions(driver);
	    	a.sendKeys(country,countryName ).build().perform();
	    	waitForElementToAppear(results);
	        selectCountry.click();
	       
	    }

	    public confirmationPage submitOrder()
	    {
	    	 submit.click();
	    	 confirmationPage confirm = new confirmationPage(driver);
	    	 return confirm;
	    }
}

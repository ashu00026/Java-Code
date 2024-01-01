package testing.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testing.AbstractComponents.AbstractComponent;

public class OrderPage extends AbstractComponent {
    WebDriver driver;
    
    @FindBy(css="tr td:nth-child(3)")
	private List<WebElement> OrderedProducts;
	
	@FindBy(css=".totalRow button")
	WebElement checkout;
	
	
	
	public OrderPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public Boolean verifyOrderDisplay(String productName)
	{
		Boolean match = OrderedProducts.stream().anyMatch(cartProduct-> cartProduct.getText().equalsIgnoreCase(productName));
		return(match);
	}
	
	
}
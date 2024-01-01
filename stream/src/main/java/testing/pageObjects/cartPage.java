package testing.pageObjects;

import java.util.List;
import java.util.function.Predicate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testing.AbstractComponents.AbstractComponent;

public class cartPage extends AbstractComponent {
    WebDriver driver;
    
    @FindBy(css=".cartSection h3")
	private List<WebElement> cartProducts;
	
	@FindBy(css=".totalRow button")
	WebElement checkout;
	
	
	
	public cartPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public Boolean verifyProductDisplay(String productName)
	{
		Boolean match = cartProducts.stream().anyMatch(new Predicate<WebElement>() {
			@Override
			public boolean test(WebElement cartProduct) {
				return cartProduct.getText().equalsIgnoreCase(productName);
			}
		});
		return(match);
	}
	
	public checkoutPage goToCheckOut()
	{
		checkout.click();
		checkoutPage check = new checkoutPage(driver);
		return check;
	}

}

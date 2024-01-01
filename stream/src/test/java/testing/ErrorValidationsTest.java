package testing;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import testing.TestComponents.BaseTest;

import testing.pageObjects.ProductCatalogue;
import testing.pageObjects.cartPage;
import testing.pageObjects.checkoutPage;
import testing.pageObjects.confirmationPage;

public class ErrorValidationsTest extends BaseTest{
	
	@Test(groups = {"ErrorHandling"})
	public void LoginErrorValidation() throws IOException, InterruptedException
	{
		
	
	String productName = "ZARA COAT 3";
    page.loginApplication("arohi@gmail.com", "Riya5656");
	AssertJUnit.assertEquals("Incorrect email or password.",page.getMeErrorMessage());

	
	
	}
	
	@Test
	public void ProductErrorValidation() throws IOException, InterruptedException
	{
		
	
	String productName = "ZARA COAT 3";
	ProductCatalogue catalogue = page.loginApplication("ashu@gmail.com", "Riya@5656");
	
	List<WebElement>products = catalogue.getProductList();
	catalogue.addProductToCart(productName);
	cartPage cart = catalogue.goToCartPage();
	
	Boolean match =cart.verifyProductDisplay("ZARA COAT 33");
	Assert.assertFalse(match);
	
	}
	
}

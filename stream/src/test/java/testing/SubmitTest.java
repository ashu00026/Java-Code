package testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import testing.TestComponents.BaseTest;
import testing.pageObjects.OrderPage;
import testing.pageObjects.ProductCatalogue;
import testing.pageObjects.cartPage;
import testing.pageObjects.checkoutPage;
import testing.pageObjects.confirmationPage;

public class SubmitTest extends BaseTest {
	
	String productName = "ZARA COAT 3";

	@Test(dataProvider="GetData", groups= {"Purchase"})
	public void SubmitOrder(HashMap<String,String> input) throws IOException, InterruptedException
	
	{


		ProductCatalogue catalogue = page.loginApplication(input.get("email"), input.get("password"));

		List<WebElement> products = catalogue.getProductList();
		catalogue.addProductToCart(input.get("product"));
		cartPage cart = catalogue.goToCartPage();

		Boolean match = cart.verifyProductDisplay(input.get("product"));
		Assert.assertTrue(match);
		checkoutPage check = cart.goToCheckOut();
		check.selectCountry("india");
		confirmationPage confirm = check.submitOrder();

		String confirmMessage = confirm.getConfirmationMessage();
		AssertJUnit.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));

	}
	
	@Test(dependsOnMethods = {"SubmitOrder"})
	public void OrderHistoryTest() throws IOException
	{
		ProductCatalogue catalogue = page.loginApplication("arohi@gmail.com", "Riya@5656");
	    OrderPage order = catalogue.goToOrderPage();
	    Assert.assertTrue(order.verifyOrderDisplay(productName));
	
	
	}
	
	public File getScreenshot(String TestCaseName) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		
		File file = new File(System.getProperty("user.dir")+ "//repoerts//"+ TestCaseName +".png");
		FileUtils.copyFile(Source,file);
		return file;
	}
	
	@DataProvider
	public Object[][] GetData() throws IOException
	{
		
		//HashMap<String,String> map = new HashMap<String,String>();
		//map.put("email", "arohi@gmail.com");
		//map.put("password", "Riya@5656");
		//map.put("product", "ZARA COAT 3");
		
		//HashMap<String,String> map1 = new HashMap<String,String>();
		//map1.put("email", "ashu@gmail.com");
		//map1.put("password", "Riya@5656");
		//map1.put("product", "ADIDAS ORIGINAL");
		
		
		
		List<HashMap<String, String>> data  = getJsonDataToMap(System.getProperty("user.dir"+"//src//test//java//testing//Data//PurchaseOrder.json"));
		return new Object[][] { {data.get(0)},{data.get(1)} };
	
	
	}
	
//	@DataProvider
//	public Object[][] GetData()
//	{
//		return new Object[][] { {"arohi@gmail.com", "Riya@5656", "ZARA COAT 3"},{"ashu@gmail.com", "Riya@5656", "ADIDAS ORIGINAL"} };
//}
	
	
	
}

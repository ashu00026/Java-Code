package testing.TestComponents;

import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;
import testing.pageObjects.LandingPage;

public class BaseTest {
	
	
	public WebDriver driver;
	public LandingPage page;
	
	public WebDriver initializeDriver() throws IOException
	{
		
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//testing//resources//GlobalData.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public  List<HashMap<String, String>> getJsonDataToMap(String filepath) throws IOException
	{
	 String JsonContent = FileUtils.readFileToString(new File(filepath), StandardCharsets.UTF_8);
	
	 //String to hashmap
	 
	 ObjectMapper mapper = new ObjectMapper();
	 List<HashMap<String, String>> data = mapper.readValue(JsonContent, new TypeReference<List<HashMap<String, String>>>(){});
	 return data;
	 
	}
	
	
	@BeforeMethod(alwaysRun=true)
	public LandingPage launchApplication() throws IOException
	{
		driver = initializeDriver();
		page = new LandingPage(driver);
		page.goTo();
		return page;
	}
	
	@AfterMethod(alwaysRun=true)
	 public void tearDown()
	 {
		driver.close();
	 }
		

}

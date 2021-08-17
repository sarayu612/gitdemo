package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import resources.Base;

public class ValidateNavigationBar extends Base {
	public WebDriver driver;
	private static  final Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest

	public void initialize() throws IOException
	{
		
		 driver =initializeDriver();
			
		driver.get(prop.getProperty("url"));
	}
		
	@Test
	public void validateAppNavBar() throws IOException {
		
		Landingpage ln = new Landingpage(driver);
		Assert.assertTrue(ln.getNavbar().isDisplayed());
		log.info("Navigation bar is displayed");
		 System.out.println("Test completed");
	}

	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}

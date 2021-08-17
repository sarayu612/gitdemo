package Academy;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import resources.Base;

public class ValidateTitle extends Base {
	public WebDriver driver;
	Landingpage ln;
	private static final Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 log.info("Driver is initialized");
			
		driver.get(prop.getProperty("url"));
		 log.info("Navigated to Home page");
	}
	@Test
	public void validateAppTitle() throws IOException {
	
		 ln = new Landingpage(driver);
		Assert.assertEquals(ln.gettitle().getText(), "FEATURED 123 COURSES");
        log.info("Successfully validated text messege");
        System.out.println("Test completed");
	}
	@Test
	public void validateHeader()
	{
	Assert.assertEquals(ln.getHeader().getText(), "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}

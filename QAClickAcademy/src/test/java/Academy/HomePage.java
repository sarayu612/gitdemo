package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import pageObjects.Loginpage;
import pageObjects.forgotPasswordpage;
import resources.Base;

public class HomePage extends Base{
	public WebDriver driver;
	private static  Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();

	}
	
@Test(dataProvider="getdata")
	public void basepageNavigation(String Username,String password, String text) throws IOException
	{
	     driver.get(prop.getProperty("url"));
		 Landingpage ln=new Landingpage(driver);
		
		 ln.getLogin().click();
		Loginpage lp=new Loginpage(driver);
		
		 lp.getEmail().sendKeys(Username);
		 lp.getpassword().sendKeys(password);
		 System.out.println(text);
		 log.info(text);
		 lp.getLogin().click();
		 forgotPasswordpage fp=lp.forgotPassword();
		 fp.getEmail().sendKeys("gggggg");
		 fp.getsendMeInstructions().click();
	}
@AfterTest
public void teardown()
{
	driver.close();
}
@DataProvider
public Object[][] getdata()
{
Object[][] data=new Object[2][3];	
data[0][0]="Non-restricteduser@qw.com";
data[0][1]="123456";
data[0][2]="Restricteduser";

data[1][0]="Restricteduser@qw.com";
data[1][1]="68975";
data[1][2]="Non-resrticteduser";
return data;
}
}

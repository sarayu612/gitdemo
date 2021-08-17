package stepDefinitions;



	import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.junit.Cucumber;
import pageObjects.Landingpage;
import pageObjects.Loginpage;
import resources.Base;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
    
	@RunWith(Cucumber.class)
	public class StepDefinition extends Base{
     WebDriver driver;
     @Given("^Initialize the browser with chrome$")
     public void initialize_the_browser_with_chrome() throws Throwable {
    	 driver=initializeDriver();
     }

     @Given("^Navigate to \"(.*?)\" site$")
     public void navigate_to_site(String arg1) throws Throwable {
      driver.get(arg1);
     }

     @Given("^Click on login link in homepage to land on secured signin Page$")
     public void click_on_login_link_in_homepage_to_land_on_secured_signin_Page() throws Throwable {
    	 Landingpage ln=new Landingpage(driver);
    	 if(ln.getPopupSize().size()>0) 
    	 {	 
    		 ln.getPopup().click();
    	 }
		  ln.getLogin().click();
     }
     @When("^User enters (.+) and (.+) and logs in$")
     public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
    	 Loginpage lp=new Loginpage(driver);
    	 lp.getEmail().sendKeys(username);
		 lp.getpassword().sendKeys(password);
		 lp.getLogin().click();
     }

     @Then("^verify that user is successfully logged in$")
     public void verify_that_user_is_successfully_logged_in() throws Throwable {
        
     }

     @And("^close browsers$")
     public void close_browsers() throws Throwable {
       driver.quit();
     }

 }
     
	
	
	


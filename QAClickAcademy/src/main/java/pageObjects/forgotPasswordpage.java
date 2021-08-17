package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class forgotPasswordpage {

	public WebDriver driver;
	By Email=By.id("user_email");

	By sendMeInstructions=By.xpath("//input[@type='submit']");
	
	
	public forgotPasswordpage(WebDriver driver) {
		this.driver=driver;
	}

	
	public WebElement getEmail()
	{
		return driver.findElement(Email);
		
	}
	public WebElement getsendMeInstructions()
	{
		return driver.findElement(sendMeInstructions);
		
	}
	
	
}

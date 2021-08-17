package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	public WebDriver driver;
	private By Email=By.id("user_email");
	private By password=By.id("user_password");
	private By login=By.xpath("//input[@type='submit']");
	private By forgotPassword=By.cssSelector("[href*='password/new']");
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}

	
	public WebElement getEmail()
	{
		return driver.findElement(Email);
		
	}
	public WebElement getpassword()
	{
		return driver.findElement(password);
		
	}
	public WebElement getLogin()
	{
		return driver.findElement(login);
		
	}
	public forgotPasswordpage forgotPassword()
	{
		 driver.findElement(forgotPassword).click();
		 forgotPasswordpage fp=new forgotPasswordpage(driver);
		 return fp;
	}
	
}

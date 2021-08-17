package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {

	public WebDriver driver;
	 private By signin=By.cssSelector("a[href*='sign_in'] span");
	 private By title=By.xpath("//div[@class='text-center']/h2");
	 private By Navbar= By.cssSelector("nav[class='navbar-collapse collapse']");
	 private By header = By.cssSelector("div[class*=video-banner] h3");
	 private By Popup = By.xpath("//button[text()='NO THANKS']");
	 
	public Landingpage(WebDriver driver) {
		this.driver=driver;
	}

	
	public WebElement getLogin()
	{
		return driver.findElement(signin);
		 
	}
	public WebElement getNavbar()
	{
		return driver.findElement(Navbar);
	}
	public List<WebElement> getPopupSize()
	{
		return driver.findElements(Popup);
	}
	public WebElement getPopup()
	{
		return driver.findElement(Popup);
	}
	public WebElement gettitle()
	{
		return driver.findElement(title);
	}
	public WebElement getHeader()
	{
		return driver.findElement(header);
	}
	
}

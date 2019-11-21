package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageClass {
	WebDriver driver;
	By lin=By.linkText("Log in");
	By uname=By.id("Email");
	By pwd=By.id("Password");
	By login=By.xpath("//input[@value='Log in']");
	public PageClass(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickLink()
	{
		driver.findElement(lin).click();
		
	}
	public void typeuname(String username)
	{
		driver.findElement(uname).sendKeys("megha98@gmail.com");
		
	}
	public void typepwd(String password)
	{
		driver.findElement(pwd).sendKeys("megha123k");
	}
	public void clicklogin()
	{
		driver.findElement(login).click();
	}
	

}

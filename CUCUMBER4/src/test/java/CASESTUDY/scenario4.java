package CASESTUDY;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenario4 {
	WebDriver driver=null;
	boolean cartAvaailable;
	
	@Given("user registered to testme app")
	public void user_registered_to_testme_app() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\megha.venkatesh.rao\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.id("userName")).sendKeys("lalitha");
		driver.findElement(By.id("password")).sendKeys("password123");
		 driver.findElement(By .name("Login")).click();
	}

	@When("user search perticular product like headphone")
	public void user_search_perticular_product_like_headphone() {
		WebElement search=driver.findElement(By .id("myInput"));
		Actions act=new Actions(driver);
		act.sendKeys(search,"b").pause(1000).sendKeys(search,"a").pause(1000).sendKeys(search,"g").pause(1000).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))).click().build().perform();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@When("try to proceed topayment without adding to cart")
	public void try_to_proceed_topayment_without_adding_to_cart() {
		
		String cart="Cart";
		try {
			WebElement ele=driver.findElement(By.partialLinkText(cart));
			ele.click();
			 cartAvaailable=true;
		}
		catch(org.openqa.selenium.NoSuchElementException|StaleElementReferenceException e)
		{
			e.printStackTrace();
		}
		
		
	  
	}

	@Then("testme app doesnot display cart icon")
	public void testme_app_doesnot_display_cart_icon() {
	 Assert.assertTrue(!cartAvaailable);
	}

}

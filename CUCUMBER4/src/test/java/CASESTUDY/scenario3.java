package CASESTUDY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenario3 {
	WebDriver driver=null;

	@Given("user logins and search for perticular product")
	public void user_logins_and_search_for_perticular_product() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\megha.venkatesh.rao\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("login to testme app")
	public void login_to_testme_app() {
		driver.findElement(By.linkText("SignIn")).click();
	  
	}

	@When("enters username as {string}")
	public void enters_username_as(String string) {
		driver.findElement(By.id("userName")).sendKeys("lalitha");
	   
	}

	@When("password as {string}")
	public void password_as(String string) {
		driver.findElement(By.id("password")).sendKeys("password123");
		 driver.findElement(By .name("Login")).click();
	   
	}

	@When("clicks on search and search for {string}")
	public void clicks_on_search_and_search_for(String string) {
		WebElement search=driver.findElement(By .id("myInput"));
				//WebElement search=driver.findElement(By .id("myInput"));
		Actions act=new Actions(driver);
		act.sendKeys(search,"p").pause(1000).sendKeys(search,"h").pause(1000).sendKeys(search,"o").pause(1000).click().build().perform();
		act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Headphone')]"))).click().build().perform();
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		driver.findElement(By.xpath(("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]"))).click();
		driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		/* WebDriverWait w = new WebDriverWait(driver,20);
		WebElement radiobutton=driver.findElement(By.xpath(("//*[@id=\"swit\"]/div[3]/div/label/i")));
		radiobutton.click();*/
		 WebDriverWait w = new WebDriverWait(driver,20);
		  w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),'HDFC Bank')]")));
		  driver.findElement(By.xpath("//label[contains(text(),'HDFC Bank')]")).click();
		  driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
		  driver.findElement(By.name("username")).sendKeys("123457");
			driver.findElement(By.name("password")).sendKeys("Pass@457");
			driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
			driver.findElement(By.name("transpwd")).sendKeys("Trans@457");
			driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
		 
		
	}
		
	@Then("purchase the product")
	public void purchase_the_product() {
	   
	}

}

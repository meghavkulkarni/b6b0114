package CASESTUDY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenario2 {
	WebDriver driver;
	@Given("login to testmeapp")
	public void login_to_testmeapp() {
	   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\megha.venkatesh.rao\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
		
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		driver.findElement(By.linkText("SignIn")).click();
		
		
		//driver.findElement((By  .name("Login")).click();
		  
	  
	}

	@When("username as dha karanam")
	public void username_as_dha_karanam() {
		driver.findElement(By.id("userName")).sendKeys("lalitha");
	}

	@When("password as megha{int}k")
	public void password_as_megha_k(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("password123");
	}

	@Then("clicks on login")
	public void clicks_on_login() {
		driver.findElement(By .name("Login")).click();
	}
}

package CUCUMBER1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testscenario {
	WebDriver driver=null;
	@Given("user will open the application")
	public void user_will_open_the_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\megha.venkatesh.rao\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		
	   
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	    
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	   driver.close();
	}

	@Then("message displayed login successfully")
	public void message_displayed_login_successfully() {
		
		
	   
	}



}

package CUCUMBER1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testmeapplogin {
	
	WebDriver driver=null;
	
		

@Given("the login page is opened")
public void the_login_page_is_opened() {
   
	System.setProperty("webdriver.chrome.driver","C:\\Users\\megha.venkatesh.rao\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.findElement(By.linkText("SignIn")).click();
	
}

@When("user enters  lalitha as name")
public void user_enters_lalitha_as_name() {
	driver.findElement(By.id("userName")).sendKeys("lalitha");
  //  throw new cucumber.api.PendingException();
}

@When("user enters password{int} as password")
public void user_enters_password_as_password(Integer int1) {
	driver.findElement(By.id("password")).sendKeys("password123");
    //throw new cucumber.api.PendingException();
}

@Then("user will finds a testmeapp homepage")
public void user_will_finds_a_testmeapp_homepage() {
	driver.findElement(By.name("Login")).click();
	System.out.println("the page title"+driver.getTitle());
	Assert.assertTrue(driver.getTitle().contains("Home"));
   // throw new cucumber.api.PendingException();
}


}

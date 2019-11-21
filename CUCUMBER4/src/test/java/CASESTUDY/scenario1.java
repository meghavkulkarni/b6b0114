package CASESTUDY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenario1 {
	WebDriver driver=null;

@Given("the signup page is opened")
public void the_signup_page_is_opened() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\megha.venkatesh.rao\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
}

@When("user enters pramodsiddd as username")
public void user_enters_pramodsiddd_as_username() {
  driver.findElement(By.id("userName")).sendKeys("AjexUser");
}

@When("user enters First name")
public void user_enters_First_name() {
	driver.findElement(By.id("firstName")).sendKeys("Ajex");
}

@When("user enters Last name")
public void user_enters_Last_name() {
	driver.findElement(By.id("lastName")).sendKeys("User");
}

@When("enters ALluArjun@{int} as password")
public void enters_ALluArjun_as_password(Integer int1) {
	driver.findElement(By.id("password")).sendKeys("Ajex@123");
}

@When("enters ALluArjun@{int} as password for confirmation")
public void enters_ALluArjun_as_password_for_confirmation(Integer int1) {
	driver.findElement(By.id("pass_confirmation")).sendKeys("Ajex@123");
}

@When("Select gender as male")
public void select_gender_as_male() {
	driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[2]")).click();
}

@When("enters prammoodd{int}@gmail.com as email id")
public void enters_prammoodd_gmail_com_as_email_id(Integer int1) {
	driver.findElement(By.id("emailAddress")).sendKeys("megha98@gmail.com");
}

@When("user enters {string} as phone number")
public void user_enters_as_phone_number(String string) {
	driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("8050175026");
}


@When("Selects {string} as his date of birth")
public void selects_as_his_date_of_birth(String string) {
	driver.findElement(By.id("dob")).sendKeys("01/12/1997");
}

@When("enters abcdef as address")
public void enters_abcdef_as_address() {
   
	driver.findElement(By.id("address")).sendKeys("raichur nhg ");
}

@When("selects security question as birth place")
public void selects_security_question_as_birth_place() {
   Select sel=new Select(driver.findElement(By.id("securityQuestion")));
   sel.selectByIndex(2);
}

@When("answers as mangalore")
public void answers_as_mangalore() {
	driver.findElement(By.id("answer")).sendKeys("dog ");
}

@When("Clicks on register")
public void clicks_on_register() {
	driver.findElement(By .name("Submit")).click();
}

@Then("User is navigated to Login Page")
public void user_is_navigated_to_Login_Page() {
	
	  driver.findElement(By.id("userName")).sendKeys("AjexUser");
	  driver.findElement(By.id("password")).sendKeys("Ajex@123");
	  driver.findElement(By.name("Login")).click();
}


}

package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pomtestclass {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha.venkatesh.rao\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		PageClass PObject=new PageClass(driver);
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		PObject.clickLink();
		String username=null;
		PObject.typeuname(username);
		String  password=null;
		PObject.typepwd(password);
		PObject.clicklogin();
		System.out.println("title of the page is"+driver.getTitle());
		
	}

}

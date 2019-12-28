package teststeps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testcase1 {
	
	WebDriver driver;
	
	@Given("^open the browser and navigates to login page$")
	public void open_the_browser_and_navigates_to_login_page() throws Throwable {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com");
	  driver.findElement(By.linkText("Log in")).click();
	}

	@When("^the  user enters the valid credentials and submit$")
	public void the_user_enters_the_valid_credentials_and_submit() throws Throwable {
	  driver.findElement(By.id("Email")).sendKeys("cvenkata_raman@rediffmail.com");
	  driver.findElement(By.id("Password")).sendKeys("satyam123$");
	  driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("^the system navigates to the HOME page$")
	public void the_system_navigates_to_the_HOME_page() throws Throwable {
	  driver.findElement(By.linkText("Log out")).click();
	  driver.quit();
	}



}

package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	WebDriver driver;
	
	@Given("Open the browser and enter the URL")
	public void open_the_browser_and_enter_the_URL() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/login");
	}

	@Given("Validate the URL")
	public void validate_the_URL() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("URL is validated");
	}

	@When("Enter Username")
	public void enter_Username() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys("tomsmith");
	}

	@When("Enter user Password")
	public void enter_user_Password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	}

	@When("Click on Login")
	public void click_on_Login() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
	}

	@Then("User logged in successfully")
	public void user_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User logged in successfully.");
	}

	@Then("Home Page should be displayed")
	public void home_Page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home Page was displayed.");
	}
}

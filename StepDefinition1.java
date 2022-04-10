package featuresWithBackground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition1 {
	WebDriver driver;
	@Given("Google page is open")
	public void google_page_is_open() {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumChromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	    
	}
	@When("Advertising link is clicked")
	public void advertising_link_is_clicked() {
		driver.findElement(By.linkText("Advertising")).click();
	    
	}
	@Then("It should navigate to Google ads page")
	public void it_should_navigate_to_google_ads_page() {
		System.out.println("title is :"+driver.getTitle());
	   
	}
	@When("business link is clicked")
	public void _link_is_clicked() {
		driver.findElement(By.linkText("Business")).click();
	    
	}
	@Then("It should navigate to Google ads page")
	public void it_should_navigate_to_business_ads_page() {
		System.out.println("title is :"+driver.getTitle());
	   
	}
	@When("A link is clicked")
	public void privacy_link_is_clicked() {
		driver.findElement(By.linkText("Privacy")).click();
	    
	}
	@Then("It should navigate to Google ads page")
	public void it_should_navigate_to_privacy_ads_page() {
		System.out.println("title is :"+driver.getTitle());
	   
	}



}

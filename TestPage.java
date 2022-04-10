package EaseMyTrip;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPage {
	static WebDriver driver;
	static EaseMyTrip.EasyMyTripClasses emt;
	static Properties prop;
	static FileInputStream fis;
	static JavascriptExecutor js;
	static WebDriverWait wait;
	static Alert  alt;

	
	
	@BeforeMethod
	public void beforeMethod() throws IOException{
		fis = new FileInputStream("C:\\SeleniumTraining2022\\WebdriverTraining\\EaseMytrip.properties");
		prop = new Properties ();
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver",prop.getProperty("chromedriver"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		emt =PageFactory.initElements(driver,EasyMyTripClasses.class);
	}
	@Test
	public void SearchFlightswithHotel() {
		     emt.flightHotel.click();
			emt.FHtrip.click();
			emt.FHfrom.click();
			emt.FHfrom.sendKeys(prop.getProperty("place5"));
			Actions alt = new Actions(driver);
			alt.pause(2000).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			emt.FHto.click();
			emt.FHto.sendKeys(prop.getProperty("place1"));
			Actions alt1 = new Actions(driver);
			alt1.pause(2000).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			emt.FHs.click();
		driver.get(prop.getProperty("url6"));
		emt.easystay.click();
		
}
}
	

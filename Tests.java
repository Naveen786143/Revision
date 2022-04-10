package allureReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests {
	WebDriver driver;
	@BeforeTest
	public void launchingEaseMyTrip()
	{
		System.setProperty("webdriver.chrome.driver","C:\\seleniumChromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
	}
	@Test
	public void TC2() throws InterruptedException
{
		driver.findElement(By.id("FromSector_show")).sendKeys("Hyderabad(HYD)");
		driver.findElement(By.id("Editbox13_show")).sendKeys("Mumbai(BOM)");
		driver.findElement(By.xpath("//*[@id=\"ddate\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("frth_6_26/03/2022")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"frmHome\"]/div[5]/div[2]/div[3]/div[1]/div[5]/div/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"traveLer\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"frmHome\"]/div[5]/div[2]/div[3]/div[1]/div[6]/div/a/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("chk_flt")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("tripType")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("src_btn")).click();
		Thread.sleep(5000);
}
	@Test
	public void bookingSpecifiedFlight() throws InterruptedException {
		//Set<String> winId =driver.getWindowHandles();
		//Thread.sleep(2000);
		//Iterator<String> itr = winId.iterator();
		//String win1 = itr.next();
		//String win2 = itr.next();
		//Thread.sleep(3000);
		//driver.switchTo().window(win2);
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"hidesec\"]/div[3]/div[9]/div[1]/label/span")).click();
		Thread.sleep(2000);
	}
		@Test
		public void departureAndArrivalTimings() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"divFltMain\"]/div[1]/div/div/div[17]/div[3]/div/div[4]/div")).click();//click on departure @6pm
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"divFltMain\"]/div[1]/div/div/div[21]/div[3]/div/div[2]/div/div")).click();
		Thread.sleep(1000);
		}
		@Test
		public void with2Stops() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"divchkOneStop\"]/p")).click();
			Thread.sleep(1000);
		}
}
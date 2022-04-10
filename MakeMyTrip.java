package projectEaseMyTrip;

import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	WebDriver driver;
    @Before
    public void before()
    {
    System.setProperty("webdriver.chrome.driver","C:\\seleniumChromedriver\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.makemytrip.com/");
    }
    @Test
    public void check1() throws InterruptedException
    {
    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[3]/div[1]/div[2]")).click();
    //driver.findElement(By.xpath("//input[@id='username']")).sendKeys("lakshminarayana04091@gmail.com");
 
    driver.findElement(By.xpath("//span[contains(text(),'Login with Google')]")).click();
    Thread.sleep(2000);
    Set<String> winIds=driver.getWindowHandles();
    Iterator<String> itr=winIds.iterator();
    String win1=itr.next();
    String win2=itr.next();
    driver.switchTo().window(win2);
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("lakshminarayana04091@gmail.com");
    driver.findElement(By.xpath("//div[contains(text(),'Narayana Kancherla')]]")).click();
 
  //*[@id="SW"]/div[1]/div[1]/ul/li[3]/div/p   //*[@id="SW"]/div[1]/div[2]/div[2]/section/div[3]/div/span[2]/span
  //*[@id="SW"]/div[1]/div[2]/div[2]/section/div[3]/div  /html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/section/div[3]/div/span[2]/span
    }
    ///html/body/div[1]/div/div[1]/div[1]/div[1]/ul/li[3]/div/p
}

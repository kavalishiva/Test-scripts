package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testng4 {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Zapcom\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.emirates.com/in/english/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		driver.findElement(By.xpath("//a[@data-link='MANAGE']")).click();
		WebElement desiredObj=driver.findElement(By.xpath("//a[@data-link='MANAGE:Before you fly']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(desiredObj).build().perform();
		
		Thread.sleep(6500);
		driver.quit();
  }
}

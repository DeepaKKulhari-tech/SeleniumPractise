import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import net.bytebuddy.asm.Advice.Enter;

import org.testng.TestNG;

public class Test01 {

	WebDriver driver;

	@BeforeTest
	public void start() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver",
				"D:\\Downloads\\Download C\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@id='gb_70']")).click();

	}

	SoftAssert sa = new SoftAssert();

	@Test
	public void test01() throws InterruptedException {

		// Enter username
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("c3deepak232@gmail.com");
		
		
		
        //Click NEXT
		WebElement wb = driver.findElement(By.xpath("//span[@class='RveJvd snByac'][1]"));
		Actions aa = new Actions(driver);
		Action ex = aa.moveToElement(wb).click().build();
		ex.perform();

		//enter password
		WebElement wb1 = driver.findElement(By.xpath("//input[@name='password'][1]"));
		WebDriverWait wd = new WebDriverWait(driver, 10);
		wd.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password'][1]")));
		System.out.println("Check");
		Action ex2 = aa.moveToElement(wb1).click().build();
		ex2.perform();
		wb1.sendKeys("9643552689");
		
		//AGAIN click next  
		Thread.sleep(5000);
		
		WebElement wb2 = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));// click Next
		
		Actions aa2 = new Actions(driver);
		Action ex3 = aa2.moveToElement(wb2).build();
		ex3.perform();
		wd.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Next')]")));
		wb2.click();
		driver.findElement(By.xpath("//a[@class='gb_d']")).click();
	
	
  System.out.println(driver.getTitle());
		
		sa.assertTrue(driver.getTitle().contains("Inbox"));
		sa.assertAll();
	
		WebElement wb3 = driver.findElement(By.xpath("//input[@class='gb_Ie']"));

		wb3.sendKeys("label:unread");
		 Thread.sleep(10000);
		Actions aa3=new Actions(driver);
		Action ex4=aa3.moveToElement(wb3).sendKeys(Keys.ENTER).click().build();
	    ex4.perform();
	    wb3.sendKeys(Keys.ENTER);
	    Thread.sleep(5000);
	    
	    WebElement wb4=driver.findElement(By.xpath("//table[@id=':v8']//following-sibling::tr[1]//td[5]"));
	    
	    Actions aa4=new Actions(driver);
		Action ex5=aa4.moveToElement(wb4).sendKeys(Keys.ENTER).build();
	    ex5.perform();
	    
	    
	    
	    
	    
	    Thread.sleep(10000);
		
		
		System.out.println("Final");
	}

	@AfterTest
	public void close() {
		driver.close();

	}

}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test02 {

	public static void main(String args[]) throws InterruptedException {
		WebDriver driver;

		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver",
				"D:\\Downloads\\Download C\\setups\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();

		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.get("http://5.0.110.123/html/login.aspx");
		driver.get("http://cdmsqa.baker-taylor.com/html/login.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUserId")).sendKeys("kumard");
		

		// driver.findElement(By.name("txtPwd")).sendKeys("password2");
		// WebElement wb=driver.findElement(By.id("btnSubmit"));
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.chord(Keys.CONTROL, Keys.TAB)).sendKeys(Keys.chord(Keys.CONTROL, Keys.TAB)).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER)).build()
				.perform();

		
		Thread.sleep(10000);
		
		System.out.println("DK");
		driver.close();

	}
}

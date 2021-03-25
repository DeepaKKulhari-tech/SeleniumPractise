import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SelectExample {

	public static void main(String args[]) throws InterruptedException {
		WebDriver driver;

		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver",
				"D:\\Downloads\\Download C\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
int k=8;


System.out.println("csdsgdcg");
int j=10;
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement wb=driver.findElement(By.id("continents"));
		Select s=new Select(wb);
		s.selectByIndex(4);
		Thread.sleep(5000);
		//s.selectByVisibleText("Africa");
		List<WebElement>se=s.getOptions();
		
		for(int i=0;i<se.size();i++)
		{
			String si=se.get(i).getText();
			System.out.println(si);
		
			if(si.equals("Europe"));
			{
			s.selectByVisibleText("Europe");
			break;
			}
		}
		
		Thread.sleep(5000);
		driver.close();
		
	}
}
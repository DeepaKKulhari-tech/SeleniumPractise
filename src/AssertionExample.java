import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample {
	
	WebDriver driver;
	
	
	@Test
	public void start()
	{
		
		System.setProperty("webdriver.gecko.driver","D:\\Downloads\\Download C\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(driver.getTitle(),"Google");
		String s="Gmail";
		sa.assertTrue(s.equals("Gmail"));
		sa.assertFalse(s.equals("Rajat"));
		sa.assertNotEquals(driver.getTitle(),"Googly");
		sa.assertNotNull(driver.getClass());
		System.out.println("Deepak");
		
		//System.out.println("rajat");
		Assert.assertEquals(driver.getTitle(),"Google");
		
		driver.close();
		sa.assertAll();
	}
	
	

}

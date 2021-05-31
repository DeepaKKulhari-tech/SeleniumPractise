import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver connection() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\Downloads\\Download C\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
	    
	    return driver;
		
	}

}

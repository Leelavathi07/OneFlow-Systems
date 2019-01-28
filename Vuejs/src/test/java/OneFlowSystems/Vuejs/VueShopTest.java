package OneFlowSystems.Vuejs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VueShopTest {
		public static Logger log=LogManager.getLogger(VueShopTest.class.getName());
		public WebDriver driver;
	@Test
	public void Vueshop() throws IOException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\welcome\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 log.debug("Driver is initialized");
		 Properties prop=new Properties();
		 FileInputStream fis=new FileInputStream("C:\\Users\\welcome\\eclipse-workspace\\Vuejs\\src\\main\\java\\resources\\GlobalData.properties");
		 prop.load(fis);
 		VueShopPageObject vs=new VueShopPageObject(driver);
 		driver.manage().window().maximize();
		driver.get(prop.getProperty("site"));
		log.debug("Vue.js website is opened and window is maximized");
	    vs.Sortbyname().click();
	    log.debug("Clicked on sort By name");
		vs.searchbutton().sendKeys(prop.getProperty("product"));
		log.debug("Searched for product camera");
	    vs.Addtocart().click();
	    log.debug("Red Camera is added to cart");
	    Select obj=new Select(vs.Donation());
	    obj.selectByValue("5");
	    log.debug("$5 is donated");
	    vs.Blog().click();
	    log.debug("Mike Sprague's blog is opened ");
	    vs.GitHub().click();
	    log.debug("GITHUB source code is opened");
	    driver.quit();
	      	}
}

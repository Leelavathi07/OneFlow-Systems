package OneFlowSystems.Vuejs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VueShopPageObject {
	WebDriver driver;
	  public VueShopPageObject(WebDriver driver) {
		 this.driver=driver;
	}
	  By Search=By.xpath("//input[@placeholder='Search products...']");
      By Sortbyname=By.xpath("//button[text()=' Sort By Name']");
      By Addtocart=By.xpath("//*[@id=\'app\']/div/div[1]/div[2]/div[1]/li[2]/button");
      By Donation=By.xpath("//select[@class='form-control input-sm']");
      By Blog=By.linkText("Mike Sprague");
      By GitHub=By.partialLinkText("GitHub");
public WebElement searchbutton()
{
	return driver.findElement(Search);
}
public WebElement Sortbyname()
{
	return driver.findElement(Sortbyname);
}
public WebElement Addtocart()
{
	return driver.findElement(Addtocart);
}
public WebElement Donation()
{
	return driver.findElement(Donation);
}
public WebElement Blog()
{
	return driver.findElement(Blog);
}
public WebElement GitHub()
{
	return driver.findElement(GitHub);
}
}



	  

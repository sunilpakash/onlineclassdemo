package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample1 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	}
	public WebDriver driver;
  @Parameters({"browser"})
  @Test
  public void testA(String browser)
  {
	  if(browser.equals("chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  else 
	  {
		  driver=new FirefoxDriver();
	  }
	  
	  driver.get("http://www.google.com");
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  driver.close();
  }
}

package pack1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class up {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath("//td[.='C#']/following-sibling::td[3]/a")).click();
		//Robot r = new Robot();
		//r.keyPress(KeyEvent.VK_ALT);
		//r.keyPress(KeyEvent.VK_O);
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ALT);
		//r.keyRelease(KeyEvent.VK_O);
		//r.keyRelease(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
	}

}

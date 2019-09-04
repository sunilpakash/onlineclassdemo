package pack1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AUTO {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.xpath("//input[@id='identifierId']"));
		un.sendKeys("sunilakash47@gmail.com");
		WebElement unnext = driver.findElement(By.xpath("//span[@class='CwaK9']"));
		unnext.click();
		Thread.sleep(6000);
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("shubhagowda1997");
		Thread.sleep(3000);
		WebElement pwdnext = driver.findElement(By.xpath("(//span[.='Next'])[1]"));
		pwdnext.click();
		Thread.sleep(3000);
		WebElement icon = driver.findElement(By.xpath("//a[@class='gb_x']"));
		icon.click();
		Thread.sleep(3000);
		WebElement gmail = driver.findElement(By.xpath("//span[.='Gmail']"));
		gmail.click();
		Thread.sleep(6000);
		Set<String> win = driver.getWindowHandles();
		for(String w:win)
		{
			driver.switchTo().window(w);
		}
		Thread.sleep(3000);
		WebElement compose = driver.findElement(By.xpath("//div[@class='z0']/div"));
		compose.click();
		Thread.sleep(3000);
		WebElement to = driver.findElement(By.xpath("//div[@class='wO nr l1']/textarea"));
		Thread.sleep(7000);
		to.sendKeys("sunilakash47@gmail.com");
		WebElement sub = driver.findElement(By.xpath("//input[@name='subjectbox']"));
		sub.sendKeys("hiiiiii");
		WebElement send = driver.findElement(By.xpath("//div[@id=':p2']"));
		send.click();
	}
	
}

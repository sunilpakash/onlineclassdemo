package pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DD {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
			driver.get("file:///C:/Users/sowjanya/Desktop/dd.html");
			WebElement ele = driver.findElement(By.id("a1"));
			Select s = new Select(ele);
			List<WebElement> count = s.getOptions();
			ArrayList<String> l = new ArrayList<>();
			for(WebElement ele1:count)
			{
				String text = ele1.getText();
				l.add(text);
			}
			Collections.sort(l);
			for(String t:l)
			{
				System.out.println(t);
			}
			
}}

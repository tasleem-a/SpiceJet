package newPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Aveda {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.manage().implici
		driver.get("https://www.aveda.de/");
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		 WebElement makeup = driver.findElement(By.xpath("//div[@id='node-6656']/div/ul/li/a[text()='MAKEUP']"));
		 Actions action=new Actions(driver);
		action.moveToElement(makeup).perform();
		List<WebElement> ele = driver.findElements(By.xpath("//a[text()='MAKEUP']/parent::li/descendant::li/a"));
		for(WebElement ele1:ele)
		{
			System.out.println(ele1.getText());
		}
		JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)", 0);
		
		WebElement facebook=driver.findElement(By.xpath("//*[local-name()='svg' and @class='icon icon--facebook']"));
		//System.out.println(facebook.getText());
		action.moveToElement(facebook).perform();
		facebook.click();
		
	}

}

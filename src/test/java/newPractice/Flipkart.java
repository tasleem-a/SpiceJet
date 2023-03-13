package newPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	public static void main(String[] args) {
		String expectedTitle="Facebook";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", 0);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Set<String> win = driver.getWindowHandles();
		Iterator i=win.iterator();
		
		
		while(i.hasNext())
		{
			String Wid=(String) i.next();
			driver.switchTo().newWindow(WindowType.TAB);
			String actualTitle=driver.getTitle();
			System.out.println(actualTitle);
			if(actualTitle.contains(expectedTitle)) {
				System.out.println("sucess ---------");
				break;
			}
		}

	}

}

package InterviewQuesPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://www.google.com/");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("tasleem");
	List<WebElement> autoSug = driver.findElements(By.xpath("//div[@role='presentation']/descendant::div[@role='option']"));
ArrayList<String> arr=new ArrayList<String>();
for(WebElement ele:autoSug)
	arr.add(ele.getText());
TreeSet<String> set=new TreeSet<String>(arr);
for(String s:set)
	System.out.println(s);
System.out.println();
System.out.println(arr.get(2));

	
	}

}

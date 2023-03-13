package newPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadoweleUsingVer4 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("chrome://downloads/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
	 WebElement Shadowele = (WebElement) js.executeScript("return document.querySelector(body > downloads-manager).shadowRoot.querySelector(#toolbar).shadowRoot.querySelector(#toolbar).shadowRoot.querySelector(#search).shadowRoot.querySelector(#searchInput)" , 0);
	 Shadowele.sendKeys("github");
	 Shadowele.getShadowRoot()args;
}
}

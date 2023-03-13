package newPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Oympic {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		driver.findElement(By.xpath("//button[text()='Yes, I am happy']")).click();
		String CountryName="Canada";
		String gold=driver.findElement(By.xpath("//span[text()='"+CountryName+"']/parent::div/following-sibling::div[1]")).getText();
		String Silver=driver.findElement(By.xpath("//span[text()='"+CountryName+"']/parent::div/following-sibling::div[2]")).getText();
		String Bronze=driver.findElement(By.xpath("//span[text()='"+CountryName+"']/parent::div/following-sibling::div[3]")).getText();
		System.out.println(CountryName);
		System.out.println("Gold Silver Bronze");
		System.out.println(gold+"     "+Silver+"    "+Bronze);
		
		String sy = driver.findElement(By.xpath("//span[text()='Armenia']/parent::div")).getAttribute("data-row-id");
		System.out.println(sy);
	}

}

package com.spicejet.objectLibrary;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spicejet.genericLibrary.JavaLibrary;
import com.spicejet.genericLibrary.WebDriverLibrary;

public class BookingPage {
	WebDriver driver;
	WebDriverLibrary webDriverLibrary;
	JavaLibrary javaLibrary=new JavaLibrary();

	@FindBy(xpath="//div[.='Continue']") private WebElement continueButton;
	@FindBy(xpath="//div[.='Signup']") private WebElement signupButton;
	public BookingPage(WebDriver driver)
	{this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnContinue() {
		continueButton.click();
	}
	public void clickOnsignup() {
		signupButton.click();
	}
}

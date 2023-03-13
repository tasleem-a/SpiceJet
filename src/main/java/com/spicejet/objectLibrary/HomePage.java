package com.spicejet.objectLibrary;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spicejet.genericLibrary.JavaLibrary;
import com.spicejet.genericLibrary.WebDriverLibrary;

public class HomePage {
	private WebDriver driver;
	WebDriverLibrary webDriverLibrary;
	@FindBy (xpath="//div[.='round trip']") private WebElement RoundtripRadioBtn;
	@FindBy(xpath="//div[@data-testid='to-testID-origin']") private WebElement fromElement;
	//@FindBy(xpath="//div[@data-testid='to-testID-origin']/descendant::div[.='%s'][last()]") private WebElement FromOption;
	String FromOptDE="//div[@data-testid='to-testID-origin']/descendant::div[.='%s'][last()]";
	//@FindBy(xpath="//div[@data-testid='to-testID-destination']/descendant::div[.='%s'][last()]") private WebElement ToOption;
	String ToOptDE="//div[@data-testid='to-testID-destination']/descendant::div[.='%s'][last()]";
	@FindBy(xpath="//div[.='Departure Date']/..//div*[local-name()='svg']/*[local-name()='path']") private  WebElement DepatureDateSVG;
	@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/descendant::div[@data-testid='departure-date-dropdown-label-test-id']") private WebElement DepartureDateTextField;
	@FindBy(xpath="//div[.='Departure Date']/../../following-sibling::div/descendant::div[@data-testid='undefined-calendar-picker']/div[3]/descendant::div[contains(.,'December')][last()]/../following-sibling::div[last()]/descendant::div[.='6'][last()]") private WebElement DepartureDate;
	String DepartDateDE="//div[.='Departure Date']/../../following-sibling::div/descendant::div[@data-testid='undefined-calendar-picker']/div[3]/descendant::div[contains(.,'%s')][last()]/../following-sibling::div[last()]/descendant::div[.='%%s'][last()]";
	@FindBy(xpath="//div[@data-testid='undefined-month-January-2023']/descendant::div[.='3'][last()]") private  WebElement monthyear;
    	
	@FindBy(xpath="//div[.='Return Date']") private WebElement ReturnDateTextField;
	@FindBy(xpath="//div[.='Return Date']/../../following-sibling::div/descendant::div[@data-testid='undefined-calendar-picker']") private WebElement DepartureCalander;
	@FindBy(xpath="//div[@data-testid='undefined-calendar-picker']//*[local-name()='svg' and @data-testid='svg-img']/*[local-name()='g']/*[local-name()='circle']/following-sibling::*[local-name()='path']") private WebElement calenderNextBtn;
	@FindBy (xpath="//div[.='Return Date']/../../following-sibling::div/descendant::div[@data-testid='undefined-calendar-picker']/div[3]/descendant::div[contains(.,'January')][last()]/../following-sibling::div[last()]/descendant::div[.='10'][last()]") private WebElement ReturnDate;
	String ReturnDateDE="//div[.='Return Date']/../../following-sibling::div/descendant::div[@data-testid='undefined-calendar-picker']/div[3]/descendant::div[contains(.,'%s')][last()]/../following-sibling::div[last()]/descendant::div[.='%%s'][last()]";
	@FindBy(xpath="//div[.='Passengers']") private WebElement PassengerTextField;
	@FindBy(xpath="//div[.='Children']/../following-sibling::div/div[last()]") private WebElement ChildrenAddBtn;
	@FindBy (xpath="//div[@data-testid='home-page-flight-cta'][last()]") private WebElement SearchFlightBtn;
	@FindBy (xpath="//div[@data-testid='undefined-calendar-picker']") private WebElement calenderID;
	
	public WebElement getWebElement(String xpath, String replace) {
		String webElexpath=String.format(xpath, replace);
		return driver.findElement(By.xpath(webElexpath));
	}
	public WebElement getWebElement(String xpath, String replace, String anotherReplace) {
		String webElexpath=String.format(xpath, replace);
		webElexpath=String.format(webElexpath, anotherReplace);
		System.out.println(webElexpath);
		return driver.findElement(By.xpath(webElexpath));
	}
//div[*[name()='svg']/*[name()='g']]
		public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void SearchFlight(String from, String to, String fromMonth, String fromDate,String toMonth,String toDate)
	{
		RoundtripRadioBtn.click();
		fromElement.click();
		getWebElement(FromOptDE,from).click();
		getWebElement(ToOptDE,to).click();
		//DepatureDateSVG.click();
		//DepartureDateTextField.click();
		Actions act=new Actions(driver);
		act.moveToElement(calenderNextBtn).click().build().perform();
		//calenderNextBtn.click();
		//DepartureDate.click();
		getWebElement(DepartDateDE, fromMonth, fromDate).click();
		ReturnDateTextField.click();
		ReturnDateTextField.click();
		//ReturnDate.click();
		getWebElement(ReturnDateDE, toMonth, toDate).click();
		PassengerTextField.click();
		ChildrenAddBtn.click();
		SearchFlightBtn.click();
		//System.out.println(calenderID.getText());
	}
	public void clickdeparture()
	{
		
		
	}
	

}

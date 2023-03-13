package com.spicejet.objectLibrary;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.spicejet.genericLibrary.JavaLibrary;
import com.spicejet.genericLibrary.WebDriverLibrary;


public class FlightPage {
WebDriver driver;
WebDriverLibrary webDriverLibrary;
JavaLibrary javaLibrary=new JavaLibrary();
		//int price=(Integer) javaLibrary.stringToAnyDatatype(num, "int");


	@FindBy(xpath="//div[@id='list-results-section-0']/descendant::div[.='Direct'][last()]/ancestor::div[@class='css-1dbjc4n r-14lw9ot r-3aj1re r-18u37iz']/div[last()]/descendant::div[@tabindex='0']") private List<WebElement> DepartureFlightAmounts;
	@FindBy(xpath="//div[@id='list-results-section-1']/descendant::div[@class='css-1dbjc4n r-1xdf14d']/descendant::div[@class='css-1dbjc4n r-18u37iz'][1]") private List<WebElement> ReturnFlightAmounts;
	@FindBy(xpath="//div[@id='list-results-section-0']/descendant::div[.='Direct'][last()]/ancestor::div[@class='css-1dbjc4n r-14lw9ot r-3aj1re r-18u37iz']/div[last()]/descendant::div[@tabindex='0']/descendant::div[@data-testid='spicesaver-flight-select-radio-button-1']") private WebElement departureRadioBtn;
	@FindBy(xpath="//div[@id='list-results-section-1']/descendant::div[@class='css-1dbjc4n r-1xdf14d']/descendant::div[@class='css-1dbjc4n r-18u37iz'][1]/descendant::div[@data-testid='spicesaver-flight-select-radio-button-1']") private WebElement returnRadioBtn;
	@FindBy(xpath="//div[.='Continue']") private WebElement CountinueBtn;
	public FlightPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void getDepartureTicketPrices()
	{ArrayList<Integer> list=new ArrayList<Integer>();
		for(WebElement p1:DepartureFlightAmounts)
		{	String s=p1.getText();
			System.out.print(p1.getText());
			String num = stringToNumber(s);
			int actnums=(Integer) javaLibrary.stringToAnyDatatype(num, "int");
			list.add(actnums);
		System.out.println( " "+actnums);	
		}
		Collections.sort(list);
		System.out.println("Lowest Price is : "+ list);
	}
	public void getReturnTicketPrices()
	{ArrayList<Integer> list2=new ArrayList<Integer>();
	for(WebElement p1:ReturnFlightAmounts)
	{	String s=p1.getText();
		System.out.print(p1.getText());
		String num = stringToNumber(s);
		int actnums2=(Integer) javaLibrary.stringToAnyDatatype(num, "int");
		list2.add(actnums2);
	System.out.println( " "+actnums2);	
	}
	Collections.sort(list2);
	System.out.println("Lowest Price is : "+ list2);
		
	}
	static String stringToNumber(String s)
	{
		String num="";
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				num=num+s.charAt(i);
			}
		}
		
		return num;
	}
	public void clickOnRadioBtn()
	{
		departureRadioBtn.click();
		returnRadioBtn.click();	
	}
	public void clickOnContinueBtn()
	{
		CountinueBtn.click();
	}
}

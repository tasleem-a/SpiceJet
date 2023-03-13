package com.flipkart.objectLib;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * performing action in the topOffers page in flipkart
 * @author asus
 *
 */
public class FlipKartTopOfferPage {
	WebDriver driver;
	@FindBy (xpath="//div[.='Top Offers']") private WebElement TopOffersButton;
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']") private WebElement closeBtn;
	@FindBy (xpath="//div[@class='_2tDhp2' and contains(.,'10%')]") private WebElement per_Offer;
	String dynamicStringxpath= "//div[@class='_2tDhp2' and contains(.,'%s')]/preceding-sibling::div[@class='_3LU4EM']";
	private List<WebElement> dynamicStringToXpath(String s,String replace )
	{	String xpath=String.format(s, replace);
	
	return driver.findElements(By.xpath(xpath));
	}
	
	public FlipKartTopOfferPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void gotoTopOffer()
	{
		closeBtn.click();
		TopOffersButton.click();
	}
	public void productBasedOnPerOffer(String percentageOffer)
	{ArrayList listOfProduct = new ArrayList();
		List<WebElement> products = dynamicStringToXpath(dynamicStringxpath, percentageOffer);
		for(WebElement productList:products)
		{
			listOfProduct.add(productList.getText());
		}
		for(int i=0;i<listOfProduct.size();i++)
		{
			System.out.println(listOfProduct.get(i));
		}
	}

}

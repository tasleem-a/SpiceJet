package spiceJet;

import org.openqa.selenium.WebDriver;

import com.flipkart.objectLib.FlipKartTopOfferPage;
import com.spicejet.genericLibrary.ConstantPaths;
import com.spicejet.genericLibrary.ExcelLibrary;
import com.spicejet.genericLibrary.JavaLibrary;
import com.spicejet.genericLibrary.PropertyFileLibrary;
import com.spicejet.genericLibrary.PropertyKeyData;
import com.spicejet.genericLibrary.WebDriverLibrary;

public class FipkartOffers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelLibrary excelLibrary=new ExcelLibrary();
		PropertyFileLibrary propertyFileLibrary=new PropertyFileLibrary();
		WebDriverLibrary webdriverLibrary= new WebDriverLibrary();
		JavaLibrary javaLibrary=new JavaLibrary();
		//read from propertFile
		propertyFileLibrary.openPropertyFile(ConstantPaths.PROPERTYFILE_PATH);
		String browser=propertyFileLibrary.getDataFromPropertyFile(PropertyKeyData.BROWSER.convertToString());
		String URL=propertyFileLibrary.getDataFromPropertyFile(PropertyKeyData.FURL.convertToString());
		long timeout=(Long) javaLibrary.stringToAnyDatatype(propertyFileLibrary.getDataFromPropertyFile(PropertyKeyData.TIMEOUT.convertToString()),"long");
		//Browser Launch
				WebDriver driver = webdriverLibrary.launchApplication(browser, URL,timeout);
				FlipKartTopOfferPage offers=new FlipKartTopOfferPage(driver);
			   offers.gotoTopOffer();
			   offers.productBasedOnPerOffer("10%");
}
}

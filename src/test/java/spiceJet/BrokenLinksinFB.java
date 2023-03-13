package spiceJet;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.spicejet.genericLibrary.ConstantPaths;
import com.spicejet.genericLibrary.ExcelLibrary;
import com.spicejet.genericLibrary.JavaLibrary;
import com.spicejet.genericLibrary.PropertyFileLibrary;
import com.spicejet.genericLibrary.PropertyKeyData;
import com.spicejet.genericLibrary.WebDriverLibrary;

public class BrokenLinksinFB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelLibrary excelLibrary=new ExcelLibrary();
		PropertyFileLibrary propertyFileLibrary=new PropertyFileLibrary();
		WebDriverLibrary webdriverLibrary= new WebDriverLibrary();
		JavaLibrary javaLibrary=new JavaLibrary();
		//read from propertFile
		propertyFileLibrary.openPropertyFile(ConstantPaths.PROPERTYFILE_PATH);
		String browser=propertyFileLibrary.getDataFromPropertyFile(PropertyKeyData.BROWSER.convertToString());
		//String URL=propertyFileLibrary.getDataFromPropertyFile(PropertyKeyData.FURL.convertToString());
		long timeout=(Long) javaLibrary.stringToAnyDatatype(propertyFileLibrary.getDataFromPropertyFile(PropertyKeyData.TIMEOUT.convertToString()),"long");
		//Browser Launch
				WebDriver driver = webdriverLibrary.launchApplication(browser, "https://www.flipkart.com/",timeout);
				List<WebElement> listOfLink = driver.findElements(By.xpath("//a"));
				for(WebElement links:listOfLink)
				{	String URL=links.getAttribute("href");
				try {
					URL url=new URL(URL);
					URLConnection urlConn = url.openConnection();
					HttpURLConnection httpUrlConn = (HttpURLConnection) urlConn;
					int status = httpUrlConn.getResponseCode();
					if(status!=200)
					
					{
					System.out.println(status+
							"---"+URL+"----->"+status);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("wrong status code----->"+URL);
				}
				
					//System.out.println(URL);
				}

	}

}

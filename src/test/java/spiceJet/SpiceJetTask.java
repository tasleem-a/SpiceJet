package spiceJet;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.spicejet.genericLibrary.ConstantPaths;
import com.spicejet.genericLibrary.ExcelLibrary;
import com.spicejet.genericLibrary.ExcelSheetData;
import com.spicejet.genericLibrary.JavaLibrary;
import com.spicejet.genericLibrary.PropertyFileLibrary;
import com.spicejet.genericLibrary.PropertyKeyData;
import com.spicejet.genericLibrary.WebDriverLibrary;
import com.spicejet.objectLibrary.BookingPage;
import com.spicejet.objectLibrary.FlightPage;
import com.spicejet.objectLibrary.HomePage;
@Listeners(com.spicejet.genericLibrary.RetryListenerImpClass.class)
public class SpiceJetTask {
	int row=1;
	ExcelLibrary excelLibrary;
	PropertyFileLibrary propertyFileLibrary;
	WebDriverLibrary webdriverLibrary;
	JavaLibrary javaLibrary;
	@BeforeClass
	public void before() {
		excelLibrary=new ExcelLibrary();
		propertyFileLibrary=new PropertyFileLibrary();
		webdriverLibrary= new WebDriverLibrary();
		javaLibrary=new JavaLibrary();
				propertyFileLibrary.openPropertyFile(ConstantPaths.PROPERTYFILE_PATH);
				excelLibrary.openExcel(ConstantPaths.EXCELFILE_PATH);
		
	}
	
@Test(dataProvider = "details")
	public void test(String trip,String from,String To,String DepartMonth,String departDate,String ToMonth,String todate){
		System.out.println(trip+" "+from+" "+To);
		String browser=propertyFileLibrary.getDataFromPropertyFile(PropertyKeyData.BROWSER.convertToString());
		String URL=propertyFileLibrary.getDataFromPropertyFile(PropertyKeyData.URL.convertToString());
		long timeout=(Long) javaLibrary.stringToAnyDatatype(propertyFileLibrary.getDataFromPropertyFile(PropertyKeyData.TIMEOUT.convertToString()),"long");
		//Browser Launch
				WebDriver driver = webdriverLibrary.launchApplication(browser, URL,timeout);
		HomePage homepage=new HomePage(driver);
		FlightPage flight= new FlightPage(driver);
		BookingPage booking=new BookingPage(driver);
		homepage.SearchFlight(from,To,DepartMonth,departDate,ToMonth,todate);
		homepage.clickdeparture();
		booking.clickOnsignup();
		webdriverLibrary.swithToWindow(driver, "SpiceClub - The frequent flyer program of SpiceJet");
	}
	@DataProvider
	public Object[][] details(){
		String[][] data=new String[2][7];
		while(row<3) {
		for(int i=0;i<data[1].length;i++)
		{
			data[row-1][i]=excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), row, i);
		}
		row++;
		}
		return data;
	}

}

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
public class SpiceJetScenarioTest {
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
		//read from propertFile
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
//				String from = excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), 1, 1);
//				String To = excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), 1, 2);
//				String DepartMonth = excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), 1, 3);
//				String departDate = excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), 1, 4);
//				String ToMonth	 = excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), 1, 5);
//				String todate = excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), 1, 6);
				
		HomePage homepage=new HomePage(driver);
		FlightPage flight= new FlightPage(driver);
		BookingPage booking=new BookingPage(driver);
		homepage.SearchFlight(from,To,DepartMonth,departDate,ToMonth,todate);
		homepage.clickdeparture();
		//booking.clickOnContinue();
		booking.clickOnsignup();
		webdriverLibrary.swithToWindow(driver, "SpiceClub - The frequent flyer program of SpiceJet");
		
		//driver.close();
//		flight.getDepartureTicketPrices();
//		flight.getReturnTicketPrices();
		

	}
	@DataProvider
	public Object[][] details(){
		//int colcount=7;
		String[][] data=new String[2][7];
		while(row<3) {
		for(int i=0;i<data[1].length;i++)
		{
			data[row-1][i]=excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), row, i);
		}
		row++;
		}
		
//		data[0][0]=excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), row, 0);
//		data[0][1]=excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), row, 1);
//		data[0][2]=excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), row, 2);
//		data[0][3]=excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), row, 3);
//		data[0][4]=excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), row, 4);
//		data[0][5]=excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), row, 5);
//		data[0][6]=excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), row, 6);
//		row++;
//		data[1][0]=excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), row, 0);
//		data[1][1]=excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), row, 1);
//		data[1][2]=excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), row, 2);
//		data[1][3]=excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), row, 3);
//		data[1][4]=excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), row, 4);
//		data[1][5]=excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), row, 5);
//		data[1][6]=excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(), row, 6);
		return data;
		//return excelLibrary.getDataFromExcel(ExcelSheetData.TESTDATA.convertToString(),colcount);
	}

}

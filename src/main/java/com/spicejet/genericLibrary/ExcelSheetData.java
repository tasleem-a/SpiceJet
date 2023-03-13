package com.spicejet.genericLibrary;

public enum ExcelSheetData {
	TESTDATA("TestDATA"),CONTACTDETAILS("ContactDetails");
	private String sheetName;
	//setter(constructor)
	/**
	 * This constructor used to set the sheet name
	 * @param sheetName
	 */
	private ExcelSheetData(String sheetName)
	{
		this.sheetName=sheetName;
	}
	//getter
	/**
	 * This method is used to converting to string
	 * @return
	 */
	public String convertToString()
	{
		return sheetName.toString();
	}

}

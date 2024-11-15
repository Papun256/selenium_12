package GenericUtility;


	import java.io.FileInputStream;
	import java.io.IOException;
	import java.time.LocalDateTime;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class ExcelUtility
	{
	/**
	*
	* @param sheetName
	* @param rowIndex
	* @param colIndex
	* @return
	* @throws EncryptedDocumentException
	* @throws IOException
	*/
	public String getStringDataFromExcel(String sheetName, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	{

	FileInputStream fiso = new FileInputStream("./src/test/resources/TestData/DemoWebShopProject-1.xlsx");
	Workbook workbook = WorkbookFactory.create(fiso);
	return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();

	}
	/**
	 *
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public boolean getBooleanDataFromExcel(String sheetName, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	{

	FileInputStream fiso = new FileInputStream("./src/test/resources/TestData/DemoWebShopProject-1.xlsx");
	Workbook workbook = WorkbookFactory.create(fiso);
	return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();

	}

	/**
	 *
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public double getNumericDataFromExcel(String sheetName, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	{

	FileInputStream fiso = new FileInputStream("./src/test/resources/TestData/DemoWebShopProject-1.xlsx");
	Workbook workbook = WorkbookFactory.create(fiso);
	return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getNumericCellValue();

	}

	/**
	 *
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public LocalDateTime getDataFromExcel(String sheetName, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	{

	FileInputStream fiso = new FileInputStream("./src/test/resources/TestData/DemoWebShopProject-1.xlsx");
	Workbook workbook = WorkbookFactory.create(fiso);
	return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getLocalDateTimeCellValue();

	}

	}




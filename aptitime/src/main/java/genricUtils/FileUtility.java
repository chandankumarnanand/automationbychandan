package genricUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {

	
		
		public String toFetchDataFromPropertyFile(String key)throws IOException {
			
			FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\Project\\Eclipse\\eclipse\\automation\\aptitime\\src\\test\\resources\\testData\\properpertyfile.properties");
			//2. creating an object of Properties Class
			Properties prop = new Properties();

			//3. calling the load method to read the key and value pair
			prop.load(fis);

			//4 calling the value using the key
			return prop.getProperty(key);
			
		}
		public String fetchStringDataFromExcelSheet(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException  {
			FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\Project\\Eclipse\\eclipse\\automation\\aptitime\\src\\test\\resources\\testData\\Book1.xlsx");
			 return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
		}
		
		
		
			
		public double fetchNumericDataFromExcelSheet(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException  {
			FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\Project\\Eclipse\\eclipse\\automation\\aptitime\\src\\test\\resources\\testData\\Book1.xlsx");
			  return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getNumericCellValue();
		}
			
			
			
		public boolean fetchBooleanDataFromExcelSheet(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException  {
			FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\Project\\Eclipse\\eclipse\\automation\\aptitime\\src\\test\\resources\\testData\\Book1.xlsx");
			  return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getBooleanCellValue();
		}
			
			
		
		
		

		
		
			
			
			
			
			
			
			
			
			
			
		

	

			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	
	


		

	



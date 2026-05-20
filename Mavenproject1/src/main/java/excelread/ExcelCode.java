package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	
	static FileInputStream f;//used to read excel file from your system
	static XSSFWorkbook w;// To represent the entire excel workbook
	static XSSFSheet sh;

	public static String readStringData(int row, int col) throws IOException {
	f = new FileInputStream("C:\\Users\\Rakesh\\git\\Mavenprograms\\Mavenproject1\\src\\main\\resources\\Details.xlsx");
	w = new XSSFWorkbook(f);//To load our excel file into memory using Apache POI
	sh = w.getSheet("Sheet1");// To select the specified sheet
	XSSFRow r = sh.getRow(row);//To get a row based on a row number
	XSSFCell c = r.getCell(col);// To get the data from the column
	return c.getStringCellValue();// To return the text from the cell

	}

	public static String readIntegerData(int row, int col) throws IOException {
	f = new FileInputStream("C:\\Users\\Rakesh\\git\\Mavenprograms\\Mavenproject1\\src\\main\\resources\\Details.xlsx");
	w = new XSSFWorkbook(f);
	sh = w.getSheet("Sheet1");
	XSSFRow r = sh.getRow(row);
	XSSFCell c = r.getCell(col);
	int val = (int) c.getNumericCellValue(); //convert double to int using typecasting
	return String.valueOf(val); //convert int to string using valueOf() method


	}

}

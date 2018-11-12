package selenium;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.common.usermodel.Hyperlink;
import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFHyperlink;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;



public class ReadExcelFile_Print {

	public static void main(String[] args) throws IOException {
		
		//Comparison of two excel files
		String[][] data1 = readExcelSheet("Excelfile2.xls");
		String[][] data2 = readExcelSheet("Excelfile2.xls");

		for (int i = 0; i < data1.length; i++)
		{
			for (int j = 0; j < data1[0].length; j++)
			{
				if (data1[i][j].equals(data2[i][j]))
				{
					System.out.println("Row " + i + ", Col " + j + " is same");
				}
				else
				{
					System.out.println("Row " + i + ", Col " + j + " is not same");
				}
			}
		}
		
		//Adding background color
		addBGcolor("Excelfile2.xls");
		addHyperlink("Excelfile2.xls");
		
	}
	
	public static void addHyperlink(String fileName) throws IOException
	{
		File file = new File(fileName);
		FileInputStream fi = new FileInputStream(file);
		HSSFWorkbook workbook1 = new HSSFWorkbook(fi);
		HSSFSheet sheet = workbook1.getSheet("Sheet1");
		
		CreationHelper createHelper = workbook1.getCreationHelper();
		HSSFHyperlink link = (HSSFHyperlink) createHelper.createHyperlink(HyperlinkType.URL);
	      //XSSFHyperlink link = (XSSFHyperlink)createHelper.createHyperlink(Hyperlink.LINK_URL);
	      link.setAddress("http://www.tutorialspoint.com/");
		sheet.getRow(1).getCell(0).setHyperlink(link);
		fi.close();
		System.out.println("Hyperlink set");
		
		FileOutputStream fo = new FileOutputStream(file);
		workbook1.write(fo);
		fo.flush();
		fo.close();
		workbook1.close();
		
	}
	
	public static void addBGcolor(String fileName) throws IOException
	{
		File file = new File(fileName);
		FileInputStream fi = new FileInputStream(file);
		HSSFWorkbook workbook1 = new HSSFWorkbook(fi);
		HSSFSheet sheet = workbook1.getSheet("Sheet1");
		
//		  style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
//		  style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		CellStyle style = workbook1.createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		sheet.getRow(0).getCell(0).setCellStyle(style);
		fi.close();
		System.out.println("Background color set");
		
		
		FileOutputStream fo = new FileOutputStream(file);
		
		workbook1.write(fo);
		fo.flush();
		fo.close();
		
	}
	
	// Reading first ExcelFile
	public static String[][] readExcelSheet(String fileName) throws IOException
	{
		FileInputStream file = new FileInputStream(new File(fileName));
		HSSFWorkbook workbook1 = new HSSFWorkbook(file);
		HSSFSheet sheet = workbook1.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum() + 1;
		int colCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String [rowCount][colCount];
		
		for (int i = 0; i < rowCount; i++)
		{
			for (int j = 0; j < colCount; j++)
			{
				
				//int cellType = sheet.getRow(i).getCell(j).getCellType();
				//if (cellType1 == HSSFCell.CELL_TYPE_NUMERIC)
				CellType cellType1 = sheet.getRow(i).getCell(j).getCellTypeEnum();
				
				if (cellType1 == CellType.NUMERIC)
				{
					int value = (int)sheet.getRow(i).getCell(j).getNumericCellValue();
					data[i][j] = String.valueOf(value);
				}
				else
				{
					data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				}
			}
		}
		
//		for (int i = 0; i < data.length; i++)
//		{
//			for (int j = 0; j < data[0].length; j++)
//			{
//				System.out.print(data[i][j] + "    ");
//			}
//			
//			System.out.println();
//		}
//		
//		System.out.println();
		
		return data;
		
	}
	
}

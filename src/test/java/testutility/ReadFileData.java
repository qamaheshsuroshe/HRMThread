package testutility;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadFileData{
	public static String fetchDataFromExcel(int Row,int Cell, CellType type) throws IOException
	{
	String data="";
	String path="src"+File.separator+"test"+File.separator+"resources"+File.separator+"TestExcel"+File.separator+"sheet.xlsx";
	FileInputStream file=new FileInputStream(path);
	Sheet s=WorkbookFactory.create(file).getSheet("sheet");
	Cell c=s.getRow(1).getCell(1);
	if (type==CellType.STRING)
	{
		data=c.getStringCellValue();
	}
	else if (type==CellType.NUMERIC)
	{
		double number=c.getNumericCellValue();
	}
	else if (type==CellType.BLANK)
	{
		data="";
	}
	return data;
	
}
}

package com.fanatics.seed;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApachePOI {
	static Logger log = LoggerFactory.getLogger(ApachePOI.class);
	public List<String> readXLSXFile(String filename, int sheetNumber) {
		XSSFRow row;
		List<String> fileContents = new ArrayList<String>();
		StringBuffer xlsxRow = new StringBuffer();
		log.debug("Entered readXLSXFile method.");
		log.info("Entered readXLSXFile method.");
		try {
			FileInputStream fis = new FileInputStream(new File(filename));
			log.debug("Created File Input Stream Object");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			log.debug("Created XSSFWorkbook Object");
			XSSFSheet spreadsheet = workbook.getSheetAt(sheetNumber);
			log.debug("Created XSSFSheet Object");
			Iterator < Row > rowIterator = spreadsheet.iterator();
			log.debug("Created Row Iterator");
			while (rowIterator.hasNext()) {
				log.debug("Iterating rows in excel.");
				 xlsxRow.setLength(0);
				 row = (XSSFRow) rowIterator.next();
				 Iterator < Cell > cellIterator = row.cellIterator();
				 log.debug("Created Cell Iterator.");
				 while (cellIterator.hasNext()) {
					 Cell cell = cellIterator.next();
					 log.debug("Iterating Cells in excel.");
					 switch (cell.getCellType())
					 {
					 	case Cell.CELL_TYPE_NUMERIC:
					 		//System.out.print(cell.getNumericCellValue() + "\t\t");
					 		xlsxRow.append(cell.getNumericCellValue()+",");
					 		break;
					 	case Cell.CELL_TYPE_STRING:
					 		//System.out.print(cell.getStringCellValue() + "\t\t");
					 		xlsxRow.append(cell.getStringCellValue()+",");
					 		break;	
					 }
				 }
				 xlsxRow.deleteCharAt(xlsxRow.length()-1);
				 log.debug("Deleting last character.");
				 fileContents.add(xlsxRow.toString());
				 log.debug("Added row to the array list.");
				 //System.out.println();
			}
			log.info("Data read from excel sheet successfully.");
			log.debug("Data read from excel sheet successfully.");
			workbook.close();
			fis.close();
		} catch(FileNotFoundException e) {
			fileContents.add(e.getMessage());
			log.error(e.getMessage());
		} catch(IOException ioe ) {
			fileContents.add(ioe.getMessage());
			log.error(ioe.getMessage());
		} catch(Exception ex ) {
			fileContents.add(ex.getMessage());
			log.error(ex.getMessage());
		}
		log.info("Returning back to the calling method.");
		log.debug("Returning back to the calling method.");
		return fileContents;
	}

}

package com.utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ui.pojo.User;

public class ExcelReaderUtility {

	public static Iterator<User> readExcelFile(String fileName) {

		File xssFile;
		XSSFWorkbook xssfWorkbook = null;

		XSSFSheet xssfSheet;
		Iterator<Row> rowIterator;
		List<User> userList = null;
		User user;
		try {
			xssFile = new File(System.getProperty("user.dir") + "//testData//"+fileName);
			xssfWorkbook = new XSSFWorkbook(xssFile);

			xssfSheet = xssfWorkbook.getSheet("LoginData");
			rowIterator = xssfSheet.iterator();
			rowIterator.next();

			userList = new ArrayList<User>();

			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Cell emailIdCell = row.getCell(0);
				Cell passwordCell = row.getCell(1);

				user = new User(emailIdCell.toString(), passwordCell.toString());
				
				userList.add(user);

			}

			xssfWorkbook.close();

		} catch (InvalidFormatException | IOException e) {
			
			e.printStackTrace();
		}
		
		return userList.iterator();

	}
}

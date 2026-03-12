package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.ui.pojo.User;

public class CSVReaderUtility {
	
	public static Iterator<User> readCSVFile(String fileName) {
		
		File csvFile = new File(System.getProperty("user.dir")+"\\testData\\" + fileName);
		FileReader csvFileReader = null;
		CSVReader csvReader;
		String[] csvLine = null;
		User user;
		List<User> userList = new ArrayList<User>();
		
		
		try {
			csvFileReader = new FileReader(csvFile);
			csvReader = new CSVReader(csvFileReader);
			csvReader.readNext();
			
			
			
			while((csvLine = csvReader.readNext())!=null) {
				
				user = new User(csvLine[0],csvLine[1]);
				
				userList.add(user);
				
			}
			
			
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (CsvValidationException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return userList.iterator();
	}

}

package com.student.db;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class DbConnection {
	public static Properties returnProperties() throws IOException {
		Properties prop = new Properties();
		try {
			FileInputStream file = new FileInputStream("src/config.properties");
			prop.load(file);
			file.close();
		}
		catch(FileNotFoundException e) {
			System.out.print("hey " + e);
		}
		

		return prop;
		
	}

		

	}
	

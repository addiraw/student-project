package com.student.db;
import java.util.Properties;
import java.io.IOException;

public class DbConnectionCheck 	{
	
	public static void check() {
		try {
			Properties p = DbConnection.returnProperties();
			System.out.print(p);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}


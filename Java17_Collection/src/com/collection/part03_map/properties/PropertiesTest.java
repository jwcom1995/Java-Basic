package com.collection.part03_map.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	public void test() {
		
		Properties prop = new Properties();
		
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url", "jdbc.oracle.thin:@127.0.0.1:1521:xe");
		prop.setProperty("user", "kh");
		prop.setProperty("password", "kh");
		
		System.out.println(prop);
		
		try {
			
			prop.store(new FileOutputStream("driver.properties"), "jdbc driver");
			prop.store(new FileWriter("driver.txt"), "jdbc driver");
			prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void test2() {
		
		Properties prop = new Properties();
		
		try {
			
			prop.load(new  FileInputStream("driver.properties"));
			System.out.println(prop);
			
			System.out.println(prop.getProperty("driver"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

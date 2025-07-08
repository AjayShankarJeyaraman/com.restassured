package Utills;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

 public class properties {
	 public static Properties property;
	 private static String configpath = "Properties/apiConfig.properties";
	 public static Properties propertiesfile() throws IOException
	 {
	  property = new Properties();
	  FileInputStream insta = new FileInputStream(configpath);
	  property.load(insta);
	  String text = property.getProperty("Host");
	  return property;
	 }
	 public String getBaseURI() throws IOException {
	  return propertiesfile().getProperty("baseURI");
	 }

	
}



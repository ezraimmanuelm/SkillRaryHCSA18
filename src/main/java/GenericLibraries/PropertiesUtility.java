package GenericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class contains reusable methods to perform actions on Properties
 * @author ASUS
 *
 */

public class PropertiesUtility {
	
	private Properties property;
	
	public void propertiesInitialization(String filePath) {
		FileInputStream fis = null;
		try {
		 fis = new FileInputStream(filePath);	
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	property= new Properties();
	
	try {
		property.load(fis);
	} catch (IOException e) {
		e.printStackTrace();
	}
 }
	
/**
 * This method is used to initialize Properties file
 * @param key
 * @return
 */

 public String fetchproperty(String key) {
	 return property.getProperty(key);
    }
 }
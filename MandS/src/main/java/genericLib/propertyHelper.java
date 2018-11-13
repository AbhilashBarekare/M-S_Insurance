package genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyHelper {
	public String fetchValue(String key) throws IOException{
	FileInputStream fs=new FileInputStream("C:\\Users\\Abhilash\\workspace\\MandS\\src\\main\\java\\genericLib\\config.properties");
	Properties prop=new Properties();
	prop.load(fs);
	return prop.getProperty(key);
	
	}

}

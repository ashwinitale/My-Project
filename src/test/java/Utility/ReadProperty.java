package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	public static String getPropData(String propToBeRead) throws IOException
	{
		String filepath = System.getProperty("user.dir")+"\\src\\test\\resources\\uiappfeatures\\Config.Propperties";
        System.out.println(filepath);
        
        FileInputStream fis=new FileInputStream(filepath);
        Properties prop = new Properties();
        prop.load(fis);
		
		String data = prop.getProperty(propToBeRead);
		
		System.out.println(data);
		
		return data;
        
	}
	
		
	
}

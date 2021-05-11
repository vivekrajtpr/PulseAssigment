package com.pwc.pulse.digital.step.definition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadData {
	
	
	public Properties readPropfie() 
	{
	
		String Path=System.getProperty("user.dir");
		File file=new File(Path+"/src/test/resources/Properties/config.properties");
		FileInputStream input = null;
		try 
		{
			input = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Properties prop=new Properties();
		try 
		{
			prop.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
}
		return prop;

}
	
	
	public Properties readTestData() 
	{
	
		String Path=System.getProperty("user.dir");
		File file=new File(Path+"/src/test/resources/Properties/TestData.properties");
		FileInputStream input = null;
		try 
		{
			input = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Properties prop=new Properties();
		try 
		{
			prop.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
}
		return prop;

}
}

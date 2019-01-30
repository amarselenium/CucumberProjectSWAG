package helper.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class testproperties {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		Properties prop = new Properties();
		prop.load(new FileInputStream(new File("C:\\Users\\Amaresh\\eclipse-workspace\\CucumberSwag\\src\\main\\Resources\\ConfigFiles\\config.properties")));
		
		System.out.println(prop.getProperty("Username"));
		
	
	}
}

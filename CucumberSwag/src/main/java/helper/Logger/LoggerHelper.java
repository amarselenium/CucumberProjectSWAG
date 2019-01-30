package helper.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import utility.ResourceHelper;

public class LoggerHelper {
	
	private static boolean root = false;

	public static Logger getLogger(Class clas){
		if (root) {
			return Logger.getLogger(clas);
		}
		try {
			PropertyConfigurator.configure(new FileInputStream(new File("C:\\Users\\Amaresh\\eclipse-workspace\\CucumberSwag\\src\\main\\Resources\\ConfigFiles\\log4j.properties")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		root = true;
		return Logger.getLogger(clas);
	}

}

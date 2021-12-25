package configuration;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import com.selenium.YouBroadBandTest;
import com.selenium.YouBroadBandTest_Allaccount;

public class PropertiesFile {

	public static void main(String[] args) {
		getProperties();
	}

	public static void getProperties() {
		try {
			Properties prop = new Properties();
			InputStream input = new FileInputStream("C:/Users/Hemanth Sai Dadi/eclipse-workspace/YoubroadBandAutomation/src/test/java/configuration/config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("Browser"));
			String Bro = prop.getProperty("Browser");
			YouBroadBandTest.browserName=Bro;
			YouBroadBandTest.UserName=prop.getProperty("UserName");
			YouBroadBandTest.Password=prop.getProperty("Password");
			YouBroadBandTest_Allaccount.browserName=prop.getProperty("Browser");
			YouBroadBandTest_Allaccount.UserName=prop.getProperty("UserName");
			YouBroadBandTest_Allaccount.Password=prop.getProperty("Password");
			YouBroadBandTest_Allaccount.UserName1=prop.getProperty("UserName1");
			YouBroadBandTest_Allaccount.Password1=prop.getProperty("Password1");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

package configuration;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import com.selenium.SeleniumTest_usingProperties;

public class PropertiesFile {

	public static void main(String[] args) {
		getProperties();
		setProperties();
	}

	public static void getProperties() {
		try {
			Properties prop = new Properties();
			InputStream input = new FileInputStream("C:/Users/Hemanth Sai Dadi/eclipse-workspace/Selenium/src/test/java/configuration/config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("Browser"));
			String Bro = prop.getProperty("Browser");
			SeleniumTest_usingProperties.browserName=Bro;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static void setProperties() {
		try {
			Properties prop = new Properties();
			OutputStream output = new FileOutputStream("C:/Users/Hemanth Sai Dadi/eclipse-workspace/Selenium/src/test/java/configuration/config.properties");
			prop.setProperty("Browser", "InternetExplore");
			prop.store(output, null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

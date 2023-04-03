package utilities;


import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

	// Configuration Reader function
	public static void main(String[] args) {
		
	}
	private static Properties configFile;

	static {
		try {
			String filePath = Constants.config_filepath;
			FileInputStream input = new FileInputStream(filePath);
			configFile = new Properties();
			configFile.load(input);

			input.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String keyName) {
		
		String operatingSystem = System.getProperty("os.name");
		
		if (operatingSystem.equals("Mac OS X")) {
			//System.out.println("Operating system: " + operatingSystem);
			
		}else {
			//System.out.println("Operating system: " + operatingSystem);
		}
		return configFile.getProperty(keyName);
	}
}

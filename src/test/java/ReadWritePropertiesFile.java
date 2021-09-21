import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		FileInputStream fi = new FileInputStream(
				"C:\\Users\\user\\eclipse-workspace\\SeleniumTraining\\src\\test\\resources\\Properties\\testdata.properties");
		properties.load(fi);
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));

		FileOutputStream fo = new FileOutputStream("C:\\Users\\user\\eclipse-workspace\\SeleniumTraining\\src\\test\\resources\\Properties\\testdata.properties");
		properties.setProperty("testdata", "9921827365");
		properties.store(fo, "This is great");

	}

}



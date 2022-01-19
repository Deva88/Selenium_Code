package ObjectRepositoryConfigurationDemo;
//
/* 2. object Repository
 * implementation of Object Repository
 * @Using properties file
 */
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestSeleniumBlog {

	@Test
	public void testConfig() throws Exception
	{
		File src=new File("./Configuration/Config.property");
		FileInputStream fis=new FileInputStream(src);

		Properties properties=new Properties();
		properties.load(fis);
		String chromepath=properties.getProperty("ChromeDriver");
		System.out.println("Hey chrome path is ====" +chromepath);
	}
}

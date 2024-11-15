package GenericUtility;


	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	public class FileUtility {
	/**
	*
	* @param key
	* @return
	* @throws IOException
	*/
	public String getDataFromProperty(String key) throws IOException
	{
	FileInputStream fiso = new FileInputStream("./src/test/resourses/TestData/commondata.properties");
	Properties prop= new Properties();
	prop.load(fiso);
	return prop.getProperty(key);


	}
	}




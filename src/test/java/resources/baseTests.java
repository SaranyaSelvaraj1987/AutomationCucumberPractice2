package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class baseTests {
    public static String getGlobalValue(String key) throws IOException
    {
        //Inbuilt java Properties class helps to get the input from .properties file
        Properties prop = new Properties();
        //To read file using FileInoutStream
        FileInputStream fis = new FileInputStream(System.getProperty("C:\\Users\\dell\\Intellij_WorkSpace\\Saranya_AutomationPractice2\\src\\test\\java\\resources\\global.properties"));
        //load file or integrate
        prop.load(fis);
        return prop.getProperty(key);

    }


}

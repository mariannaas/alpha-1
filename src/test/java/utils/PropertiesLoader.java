package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by mariannas on 24.03.15.
 */
public class PropertiesLoader {


    private static String propertiesFile = "application.properties";
    PropertiesLoader(){}

    PropertiesLoader(String propertiesFile){
        this.propertiesFile = propertiesFile;

    }

    public static Properties loadProperties(String propertiesFile){
        InputStream inputStream;
        Properties properties = new Properties();
        inputStream = PropertiesLoader.class.getClassLoader().getResourceAsStream(propertiesFile);

        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static Properties loadProperties(){
       return loadProperties(propertiesFile);
    }
}

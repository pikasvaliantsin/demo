package by.it.academy;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class App
{
    public static void main( String[] args ) throws IOException
    {
        Properties properties = new Properties();
        InputStream configStream = App.class.getResourceAsStream("/config.properties");
        properties.load(configStream);
        System.out.println(properties.getProperty("service.weather.url"));
    }
}

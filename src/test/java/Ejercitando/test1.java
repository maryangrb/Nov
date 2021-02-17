package Ejercitando;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.GetProperties;

public class test1 {
    private String chromeDriverUrl;

    public void testPrimero(){
        GetProperties properties =  new GetProperties();

        String chromeDriverURL = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
    }
}

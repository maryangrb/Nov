package ProbandoConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.GetProperties;


public class testSelenium1 {
    @Test
    public void primerTest(){
        GetProperties properties = new GetProperties();

        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);

        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        //driver.get("http://www.facebook.com");
        //driver.close();
        /*driver.findElement(By.id("email")).sendKeys("probandoEmaail@hotmail.com");
        driver.findElement(By.name("pass")).sendKeys("12345");
        driver.findElement(By.linkText("Forgot Password?")).click();*/


        driver.findElement(By.id("username")).sendKeys("juana");
        driver.findElement(By.name("pw")).sendKeys("123456");
       //driver.findElement(By.className("button r4 wide primary")).click(); //Error No puede tener espacios el className
        driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();



    }
}









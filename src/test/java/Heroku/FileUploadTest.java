package Heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

public class FileUploadTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\TeachMeSkills\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void upload(){
        driver.get("http://the-internet.herokuapp.com/upload");
        By fileUpload = By.cssSelector("upload[type=file]");
        String filePath = "/c/hp/desktop/unnamed.png";
        driver.findElement(fileUpload).sendKeys(filePath);

    }
}

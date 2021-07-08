package HerokuTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
public class DynamicControlsTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\TeachMeSkills\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void checkboxTest(){
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"checkbox\"]/input"))).click().perform();
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button"))).click().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"message\"]")));
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button"));
        if (!checkbox.isSelected()) {
            System.out.println("Checkbox in not selected");
        } else {
            System.out.println("Checkbox in selected");
        }
    }

    @Test
    public void inputTest(){
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        WebElement input = driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));
        Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\"input-example\"]/input")).isEnabled(),"input is disabled");
        driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"message\"]")));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"input-example\"]/input")).isEnabled(),"input is enabled");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}


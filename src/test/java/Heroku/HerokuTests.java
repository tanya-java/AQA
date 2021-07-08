package Heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HerokuTests {

  WebDriver driver;
  private static final String ALERT_TEXT = "You selected a context menu";

  @BeforeMethod
  public void setUp() {
    System.setProperty("webdriver.chrome.driver",
        "C:\\Users\\HP\\Downloads\\TeachMeSkills\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }

  @Test
  public void getAlertTextTest() {
    driver.get("http://the-internet.herokuapp.com/context_menu");
    Actions actions = new Actions(driver);
    actions.moveToElement(driver.findElement(By.id("hot-spot"))).contextClick().build().perform();
    String alertText = driver.switchTo().alert().getText();
    driver.switchTo().alert().accept();
    Assert.assertTrue(driver.findElement(By.id("content")).isDisplayed(), "Alert is still opened");
    Assert.assertEquals(alertText, ALERT_TEXT, "Texts are not equals");
  }

  @AfterMethod
  public void tearDown() {
    driver.close();
    driver.quit();
  }
}

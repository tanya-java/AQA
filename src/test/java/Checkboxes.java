import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import java.util.List;

public class Checkboxes {
    @Test
    public void checkCheckbox() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\TeachMeSkills\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> element = driver.findElements(By.cssSelector("[type=checkbox]"));

        if (element != null) {
            element.get(0).click();
        }
        if (element != null) {
            element.get(1).click();
        }
    }
}

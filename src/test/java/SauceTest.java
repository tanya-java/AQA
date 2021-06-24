import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceTest {
    private void locateElements() {
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.id("react-burger-menu-btn"));
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
        driver.findElement(By.className("inventory_item_name"));
        driver.findElements(By.tagName("buttons"));
        driver.findElement(By.linkText("Sauce Labs Backpack"));
        driver.findElement(By.partialLinkText("Onesie"));
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        driver.findElement(By.xpath("//div[contains(text(), '$')]"));
        driver.findElement(By.xpath("//button[contains(@name,'products')]"));
        driver.findElement(By.xpath("//button[contains(text(),'cart')]"));
    }
}

package MoodPanda;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    @BeforeMethod
    public void setUp(){
        Configuration.browser = "chrome";
        Configuration.baseUrl ="https://moodpanda.com/";
    }

    @AfterMethod
    public void tearDown(){
        getWebDriver().close();
    }
}

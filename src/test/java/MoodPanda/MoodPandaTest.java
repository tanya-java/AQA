package MoodPanda;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class MoodPandaTest extends BaseTest{
    public static final String EMAIL = "termalickaya@gmail.com";
    public static final String PASSWORD = "qweasd123";

    @Test
    public void loginTest(){
        open("Login");
        LoginPage loginPage = new LoginPage();
        loginPage.login(EMAIL,PASSWORD);
    }

    @Test
    public void  updateMood(){
        open("Login");
        LoginPage loginPage = new LoginPage();
        HomePage homePage = loginPage.login(EMAIL,PASSWORD);
        homePage.updateMood(10);
    }
}

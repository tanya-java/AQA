package MoodPanda;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public static final String EMAIL_INPUT = "#ContentPlaceHolderContent_TextBoxEmail";
    public static final String PASSWORD_INPUT = "#ContentPlaceHolderContent_TextBoxPassword";
    public static final String LOGIN_BUTTON = "#ContentPlaceHolderContent_ButtonLogin";

    public HomePage login(String email, String password) {
        $(EMAIL_INPUT).sendKeys(email);
        $(PASSWORD_INPUT).sendKeys(password);
        $(LOGIN_BUTTON).click();
        return new HomePage();
    }
}

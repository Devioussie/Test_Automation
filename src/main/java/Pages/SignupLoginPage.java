package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupLoginPage extends PageBase{

    By nameField = By.name("name");
    By SignupEmailField = By.cssSelector("input[data-qa='signup-email']");
    By SignupButton = By.cssSelector("button[data-qa='signup-button']");
    public SignupLoginPage(WebDriver driver) {
        super(driver);
    }
    public void EnterNewUserName(){
        EnterText(nameField,"Yasmin");
    }
    public void EnterNewUserEmail(){
        EnterText(SignupEmailField,"123454mail61321655@gmail.com");
    }
    public void ClickOnSignupButton(){
        ClickOnElement(SignupButton);
    }
}

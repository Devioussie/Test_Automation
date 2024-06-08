package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{
    By SignupLoginButton = By.cssSelector(".fa-lock");
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void ClickOnSignupLoginButton(){
        ClickOnElement(SignupLoginButton);
    }
}

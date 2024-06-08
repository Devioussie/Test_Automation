package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreated extends PageBase{
    By AccountCreatedText = By.cssSelector(".col-sm-9  > .title");
    public AccountCreated(WebDriver driver) {
        super(driver);
    }
    public String GetAccountCreatedText (){
        String Text=driver.findElement(AccountCreatedText).getText();
        return Text;
    }

}

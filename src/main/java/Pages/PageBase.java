package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    WebDriver driver;

    public PageBase(WebDriver driver){
        this.driver = driver;
    }
    public void ClickOnElement(By elementlocator) {
        waitUntilElementPresence(elementlocator);
        driver.findElement(elementlocator).click();
    }
    public void EnterText(By elemntlocator,String Text){
        waitUntilElementPresence(elemntlocator);
        driver.findElement(elemntlocator).sendKeys(Text);
    }
    public void waitUntilElementPresence(By elementlocator) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(elementlocator));

    }
}

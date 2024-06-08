package Base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends AbstractTestNGCucumberTests {
    public static WebDriver driver;
    @BeforeMethod
    public void StartBrowser(){
        driver=new EdgeDriver();
        driver.navigate().to("https://automationexercise.com/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void CloseBrowser(){
        //   driver.quit();
    }
}


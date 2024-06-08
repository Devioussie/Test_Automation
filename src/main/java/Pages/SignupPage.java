package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPage extends PageBase{

    By Title = By.cssSelector("div[id='uniform-id_gender1']");
    By PasswordField = By.id("password");
    By SignupNewsletterBox = By.id("newsletter");
    By ReceiveSpecialOffersBox = By.id("optin");
    By BirthDay = By.id("days");
    By BirthMonth = By.id("months");
    By BirthYear = By.id("years");
    By AddressFirstName = By.id("first_name");
    By AddressLastName = By.id("last_name");
    By Address = By.id("address1");
    By State = By.cssSelector("input[data-qa='state']");
    By City = By.cssSelector("input[data-qa='city']");
    By ZipCode = By.cssSelector("input[data-qa='zipcode']");
    By Mobilnumber = By.cssSelector("input[data-qa='mobile_number']");
    By CreateAccountButton = By.cssSelector("button[data-qa='create-account']");
    public SignupPage(WebDriver driver) {
        super(driver);
    }
    public void ClickOnTitle(){
        ClickOnElement(Title);
    }
    public void EnterPassword() {
        EnterText(PasswordField,"123");
    }
    public void ClickOnSignupNewsletterBox() {
        ClickOnElement(SignupNewsletterBox);
    }
    public void ClickOnReceiveSpecialOffersBox() {
        ClickOnElement(ReceiveSpecialOffersBox);
    }
    public void SelectBirthDay() {
        Select select = new Select(driver.findElement(BirthDay));
        select.selectByValue("25");
    }
    public void SelectBirthMonth() {
        Select select = new Select(driver.findElement(BirthMonth));
        select.selectByVisibleText("January");
    }
    public void SelectBirthYear() {
        Select select = new Select(driver.findElement(BirthYear));
        select.selectByIndex(24);
    }
    public void EnterAddressFirstName() {
        EnterText(AddressFirstName,"Yasmin");
    }
    public void EnterAddressLastName() {
        EnterText(AddressLastName,"Khaled");
    }
    public void EnterAddress() {
        EnterText(Address,"3 Mohamed ElMahdi St");
    }
    public void EnterState() {
        EnterText(State,"Haram");
    }
    public void EnterCity() {
        EnterText(City,"Cairo");
    }
    public void EnterZipCode() {
        EnterText(ZipCode,"1224");
    }
    public void EnterMobilNumber() {
        EnterText(Mobilnumber,"01012547896");
    }
    public void ClickOnCreateAccountButton() {
        ClickOnElement(CreateAccountButton);
    }
}

package steps;

import Pages.AccountCreated;
import Pages.HomePage;
import Pages.SignupLoginPage;
import Pages.SignupPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static Base.TestBase.driver;

public class UserRegistrationSteps {
    HomePage HomePageObject = new HomePage(driver);
    SignupLoginPage SignupLoginPageObject = new SignupLoginPage(driver);
    SignupPage SignupPageObject = new SignupPage(driver);
    AccountCreated AccountCreatedObject = new AccountCreated(driver);
    @Given("User is on homepage")
    public void user_is_on_homepage() {
        Assert.assertEquals(driver.getTitle(),"Automation Exercise");

    }
    @When("User clicks on signup login button and enters valid signup data")
    public void user_clicks_on_signup_login_button_and_enters_valid_signup_data() {
        HomePageObject.ClickOnSignupLoginButton();
        SignupLoginPageObject.EnterNewUserName();
        SignupLoginPageObject.EnterNewUserEmail();
        SignupLoginPageObject.ClickOnSignupButton();

    }
    @When("fill signup form and click on creat account button")
    public void fill_signup_form_and_click_on_creat_account_button() {
        SignupPageObject.ClickOnTitle();
        SignupPageObject.EnterPassword();
        SignupPageObject.SelectBirthDay();
        SignupPageObject.SelectBirthMonth();
        SignupPageObject.SelectBirthYear();
        SignupPageObject.ClickOnSignupNewsletterBox();
        SignupPageObject.ClickOnReceiveSpecialOffersBox();
        SignupPageObject.EnterAddressFirstName();
        SignupPageObject.EnterAddressLastName();
        SignupPageObject.EnterAddress();
        SignupPageObject.EnterState();
        SignupPageObject.EnterCity();
        SignupPageObject.EnterZipCode();
        SignupPageObject.EnterMobilNumber();
        SignupPageObject.ClickOnCreateAccountButton();

    }
    @Then("user is redirected to account creation page")
    public void user_is_redirected_to_account_creation_page() {
        Assert.assertEquals(AccountCreatedObject.GetAccountCreatedText(),"ACCOUNT CREATED!");

    }
}

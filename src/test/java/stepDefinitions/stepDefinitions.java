package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.loginPage;
import resources.baseTests;

import java.io.IOException;

public class stepDefinitions extends baseTests {

    private WebDriver driver;
    private loginPage lp;
    private WebElement emailId;
    private WebElement pass;
    private WebElement login;
    private String key;
    @Given("I want to land on the Home Page of the Cart")
    public void i_want_to_land_on_the_home_page_of_the_cart() throws IOException {
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://naveenautomationlabs.com/opencart");

    }
    @Given("I want to land on the Login Page of the Cart")
    public void i_want_to_land_on_the_login_page_of_the_cart() {
            driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        lp = new loginPage(driver);
    }
    @When("I enter {string} and {string} into respective fields")
    public void i_enter_and_into_respective_fields(String username, String password) {
        lp.enter_email(username);
        lp.enter_password(password);
    }
    @When("I click on Login button")
    public void i_click_on_login_button() {
        lp.click_loginBtn();
    }
    @Then("I should be successfully login to OpenCart Account by verifying the presence of logout button")
    public void i_should_be_successfully_login_to_open_cart_account_by_verifying_the_presence_of_logout_button() {
    //Verifying the presence
        Assert.assertEquals(lp.check_logoutBtn(),true);
    }
    @When("I enter the invalid {string} and {string} into respective fields")
    public void i_enter_the_invalid_and_into_respective_fields(String username, String password) {
    lp.enter_email(username);
    lp.enter_password(password);
    }
    @Then("I should be able to see the warning message displayed")
    public void i_should_be_able_to_see_the_warning_message_displayed() {
    //Assert.assertEquals(lp.invalid_login_verification(),true);
    Assert.assertEquals(true, lp.invalid_login_verification());
    }



}

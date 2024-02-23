package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.pagesMethod;
import resources.baseTests;

import java.io.IOException;

public class stepDefinitions extends baseTests {

    WebDriver driver = null;
    //To connect the constructor driver created in pagesMethod to this class
    pagesMethod pagesMethodObj = null;
    private String key;
    @Given("I want to land on the Home Page of the Cart")
    public void i_want_to_land_on_the_home_page_of_the_cart() throws IOException {
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://naveenautomationlabs.com/opencart");

    }
    @When("I navigate to My Account tab and select Login")
    public void i_navigate_to_my_account_tab_and_select_login() {
        pagesMethodObj = new pagesMethod(driver);//Passing WebDriver instance
        pagesMethodObj.wayTologinPage();
        }
    @When("I enter {string} and {string} into respective fields")
    public void i_enter_and_into_respective_fields(String string, String string2) {
        System.out.println("Hi");
    }
    @When("I click on Login button")
    public void i_click_on_login_button() {
        System.out.println("Hi");
    }
    @Then("I should be successfully login to OpenCart Account")
    public void i_should_be_successfully_login_to_open_cart_account() {
        System.out.println("Hi");
    }
    @Given("I want to go to home page to browse the product")
    public void i_want_to_go_to_home_page_to_browse_the_product() {
        System.out.println("Hi");
    }
    @When("I click on Search box")
    public void i_click_on_search_box() {
        System.out.println("Hi");
    }
    @When("I enter the {string} to search")
    public void i_enter_the_to_search(String string) {
        System.out.println("Hi");
    }
    @Then("I click on Search Icon button \\/ press Enter")
    public void i_click_on_search_icon_button_press_enter() {
        System.out.println("Hi");
    }
    @Then("I should be able to see the list of products related to my <productHint>")
    public void i_should_be_able_to_see_the_list_of_products_related_to_my_product_hint() {
        System.out.println("Hi");
    }



}

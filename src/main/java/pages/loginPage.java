package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
    private WebDriver driver;
    By login_emailId = By.id("input-email");
    By login_password = By.id("input-password");
    By login_loginBtn = By.xpath("//input[@type='submit']");
    By login_logoutBtn = By.linkText("Logout");
    By login_invalidMessage = By.xpath("//div[contains(text(),'Warning')]");

    //Constructor for Webdriver
    public loginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void enter_email(String email)
    {
        WebElement emailId = driver.findElement(login_emailId);
        emailId.sendKeys(email);
    }
    public void enter_password(String password)
    {
        WebElement pass = driver.findElement(login_password);
        pass.sendKeys(password);
    }
    public void click_loginBtn()
    {
        WebElement loginButton =  driver.findElement(login_loginBtn);
        loginButton.click();
    }
    public boolean check_logoutBtn()
    {
     return driver.findElement(login_logoutBtn).isDisplayed();

    }
    public boolean invalid_login_verification()
    {
        return driver.findElement(login_invalidMessage).isDisplayed();

    }
}


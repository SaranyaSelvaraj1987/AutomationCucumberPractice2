package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
    //WebDriver driver;
    By login_emailId = By.id("input-email");
    By login_password = By.id("input-password");
    By login_loginBtn = By.xpath("//input[@type='submit']");

    public WebElement loc_email(WebDriver driver)
    {
       return driver.findElement(login_emailId);
    }
    public WebElement loc_password(WebDriver driver)
    {
        return driver.findElement(login_password);
    }
    public WebElement loc_loginBtn(WebDriver driver)
    {
        return driver.findElement(login_loginBtn);
    }
}


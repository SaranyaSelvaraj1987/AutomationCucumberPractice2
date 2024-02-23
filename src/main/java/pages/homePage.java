package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {

    By home_myAccount = By.xpath("");
    By home_Login = By.xpath("");
    public WebElement loc_myAccount(WebDriver driver)

    {
    return driver.findElement(home_myAccount);

    }
    public WebElement loc_Login(WebDriver driver)

    {
        return driver.findElement(home_Login);
    }
}

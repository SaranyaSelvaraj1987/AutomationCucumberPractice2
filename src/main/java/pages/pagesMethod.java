package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.homePage;

public class pagesMethod  {

    WebDriver driver = null;
    public pagesMethod(WebDriver driver)
    {
        this.driver=driver;
    }
    public void wayTologinPage()
    {
     homePage hp = new homePage();
     WebElement myAccountEle = hp.loc_myAccount(driver);
     WebElement myLoginTabEle = hp.loc_Login(driver);
        myAccountEle.click();
    }
    public void atLoginPage()
    {
    loginPage lp = new loginPage();
    WebElement emailEle = lp.loc_email(driver);
    WebElement passwordEle = lp.loc_password(driver);
    WebElement loginBtnEle = lp.loc_loginBtn(driver);
    }
}

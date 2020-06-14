package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    By _username = By.id("username");
    By _password = By.id("password");
    By _loginButton = By.xpath("//i[@class=\"fa fa-2x fa-sign-in\"]");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void EnterUserName(String username){
        driver.findElement(_username).sendKeys(username);
    }

    public void EnterPassword(String password){
        driver.findElement(_password).sendKeys(password);
    }

    public SecurePage ClickLoginButton(){
        driver.findElement(_loginButton).click();
        return new SecurePage(driver);
    }


}

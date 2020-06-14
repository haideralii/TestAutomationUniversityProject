package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    private By _formAuthentication = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage ClickBasicAuthLink(){
        driver.findElement(_formAuthentication).click();
        return new LoginPage(driver);
    }

}

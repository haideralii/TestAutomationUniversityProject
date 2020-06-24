package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordEmailSentPage {

    private WebDriver driver;

    public ForgotPasswordEmailSentPage(WebDriver driver){
        this.driver = driver;
    }

    private By _successMessage = By.id("content");

    public String verifySuccessMessage(){
       return driver.findElement(_successMessage).getText();
    }

}

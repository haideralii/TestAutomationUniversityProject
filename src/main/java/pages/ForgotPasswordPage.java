package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    private By _forgotPasswordField = By.id("email");

    private By _retrieveEmailButton = By.xpath("//button/i");

    public void clickOnEmailField(){
        driver.findElement(_forgotPasswordField).click();
    }

    public void enterEmailInForgotPasswordField(String email){
        driver.findElement(_forgotPasswordField).sendKeys(email);
    }

    public ForgotPasswordEmailSentPage clickOnRetrieveEmailButton(){
        driver.findElement(_retrieveEmailButton).click();
        return new ForgotPasswordEmailSentPage(driver);
    }

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage {
    private WebDriver driver;

    By _successMessage = By.id("flash");

    public SecurePage(WebDriver driver){
        this.driver = driver;
    }

    public String SuccessMessage(){
        return driver.findElement(_successMessage).getText();
    }

}

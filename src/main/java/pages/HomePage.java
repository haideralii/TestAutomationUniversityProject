package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    // private By _formAuthentication = By.linkText("Form Authentication");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private void ClickLink(String linkText) {
        driver.findElement(By.linkText(linkText));
    }

    public LoginPage ClickBasicAuthLink() {
        ClickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDownLink(){
        ClickLink("");
        return new DropdownPage(driver);
    }

}


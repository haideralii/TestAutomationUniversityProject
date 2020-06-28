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
        driver.findElement(By.linkText(linkText)).click();
    }

    public LoginPage ClickBasicAuthLink() {
        ClickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDownLink(){
        ClickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHoverLink(){
        ClickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressPage clickKeyPressLink(){
        ClickLink("Key Presses");
        return new KeyPressPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSliderLink(){
        ClickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public JSAlertsPage clickJSAlertsLink(){
        ClickLink("JavaScript Alerts");
        return new JSAlertsPage(driver);
    }

}


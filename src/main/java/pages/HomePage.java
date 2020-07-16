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

    public FileUploadPage clickFileUploadLink(){
        ClickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickContextMenuLink(){
        ClickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public WYSIWYGEditorPage clickWYSIWYGEditorLink(){
        ClickLink("WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);
    }

    public FramesPage clickOnFramesLink(){
        ClickLink("Frames");
        return new FramesPage(driver);
    }

    public ForgotPasswordPage clickForgotPasswordLink() {
        ClickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingLink(){
        ClickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeDeepDOMPage clickOnLargeDeepDOMink(){
        ClickLink("Large & Deep DOM");
        return new LargeDeepDOMPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScrollLink(){
        ClickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

}


package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSAlertsPage {
    private WebDriver driver;
    public JSAlertsPage(WebDriver driver){ this.driver = driver; }

    private By _jsAlertButton = By.xpath("//li/button[text()=\"Click for JS Alert\"]");
    private By _jsConfirmButton = By.xpath("//li/button[text()=\"Click for JS Confirm\"]");
    private By _jsPromptButton = By.xpath("//li/button[text()=\"Click for JS Prompt\"]");
    private By _result = By.xpath("//p[@id=\"result\"]");

    public void ClickOn_JSAlertButton(){
        driver.findElement(_jsAlertButton).click();
    }

    public void Accept_JSAlert(){
        driver.switchTo().alert().accept();
    }

    public String GetTextOf_JSAlert(){
       return driver.switchTo().alert().getText();
    }

    public void ClickOn_JSConfirmButton(){
        driver.findElement(_jsConfirmButton).click();
    }

    public String GetTextOf_JSConfirmAlert(){
       return driver.switchTo().alert().getText();
    }

    public void Dismiss_ConfirmJSAlert(){
        driver.switchTo().alert().dismiss();
    }

    public void ClickOn_JSPrompt(){
        driver.findElement(_jsPromptButton).click();
    }

    public void EnterTextIn_JSPrompt(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public void Accept_JSPrompt(){
        driver.switchTo().alert().accept();
    }

    public String Verify_Result(){
       return driver.findElement(_result).getText();
    }

}

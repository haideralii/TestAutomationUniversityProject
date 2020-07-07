package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WYSIWYGEditorPage {
    private WebDriver driver;

    public WYSIWYGEditorPage (WebDriver driver){ this.driver = driver; }

    private String _editorFrame = "mce_0_ifr";
    private By _editorField = By.xpath("//body[@id=\"tinymce\"]");
    private By _insertDecreaseIndentation = By.xpath("//button/i[@class=\"mce-ico mce-i-outdent\"]");

    public void ClearTextFromEditor(){
        SwitchToFrame();
        driver.findElement(_editorField).clear();
        SwitchToParentFrame();
    }

    public void EnterTextInEditor(String text){
        SwitchToFrame();
        driver.findElement(_editorField).sendKeys(text);
        SwitchToParentFrame();
    }

    public void ClickOnDecreaseIndentation(){
        driver.findElement(_insertDecreaseIndentation).click();
    }

    public String GetTextFromEditor(){
        SwitchToFrame();
        String text = driver.findElement(_editorField).getText();
        return text;
    }

    private void SwitchToFrame(){
        driver.switchTo().frame(_editorFrame);
    }

    private void SwitchToParentFrame(){
        driver.switchTo().parentFrame();
    }

}

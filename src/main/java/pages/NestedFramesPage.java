package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage {
    private WebDriver driver;
    public NestedFramesPage(WebDriver driver){ this.driver = driver; }

    private By _bodyText = By.tagName("body");

    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";


    private void SwitchToTopFrame(){
        driver.switchTo().frame(topFrame);
    }

    private void SwitchToLeftFrame(){
        driver.switchTo().frame(leftFrame);
    }

    private void SwitchToBottomFrame(){
        driver.switchTo().frame(bottomFrame);
    }


    private void SwitchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    public String GetTextFromLeftFrame(){
        SwitchToTopFrame();
        SwitchToLeftFrame();
        String leftText = driver.findElement(_bodyText).getText();
        SwitchToParentFrame();
        SwitchToParentFrame();
        return leftText;
    }

    public String GetTextFromBottomFrame(){
        SwitchToBottomFrame();
        String text = driver.findElement(_bodyText).getText();
        SwitchToParentFrame();
        return text;
    }


}

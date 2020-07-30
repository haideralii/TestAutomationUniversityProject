package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    public InfiniteScrollPage(WebDriver driver){ this.driver = driver; }

    private By _jScroll = By.className("jscroll-added");

    public void ScrollToProvidedPassage(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
        while (FindSizeOfParagraph() < index){
            jsExecutor.executeScript(script);
        }
    }

    public int FindSizeOfParagraph(){
      return  driver.findElements(_jScroll).size();
    }

}

package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowHandler {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowHandler(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack(){
        navigate.back();
    }

    public void goForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void goToPage(String url){
        navigate.to(url);
    }

    public void getWindowHandle(String _tabTitle){

        Set<String> _window = driver.getWindowHandles();
       System.out.println("Number of Tabs = " + _window.size());

       System.out.println("Window Handles = ");
       _window.forEach(System.out::println);

        for (String window : _window) {
            driver.switchTo().window(window);
            System.out.println("Name of Current Window = " + window);

            if (_tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }

    public void SwitchToNextTab(){
        String _parentWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);
    }

}

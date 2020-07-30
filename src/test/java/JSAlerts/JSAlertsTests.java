package JSAlerts;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JSAlertsPage;

public class JSAlertsTests extends BaseTest {

    @Test
    public void Accept_JSAlertTest(){
        JSAlertsPage _jsAlertsPage = homePage.clickJSAlertsLink();
        _jsAlertsPage.ClickOn_JSAlertButton();
        Assert.assertEquals(_jsAlertsPage.GetTextOf_JSAlert(), "I am a JS Alert", "Not JS Alert");
        _jsAlertsPage.Accept_JSAlert();
        Assert.assertEquals(_jsAlertsPage.Verify_Result(), "You successfuly clicked an alert", "Test Fails because result does not match");
    }

    @Test
    public void Dismiss_ConfirmJSAlertTest(){
        JSAlertsPage _jsAlertsPage = homePage.clickJSAlertsLink();
        _jsAlertsPage.ClickOn_JSConfirmButton();
        Assert.assertEquals(_jsAlertsPage.GetTextOf_JSConfirmAlert(),"I am a JS Confirm","Not Confirm JS");
        _jsAlertsPage.Dismiss_ConfirmJSAlert();
        Assert.assertEquals(_jsAlertsPage.Verify_Result(), "You clicked: Cancel", "Cancel does not clicked");
    }

    @Test
    public void EnterTextIn_PromptJS(){
        String text = "JS Prompt";
        JSAlertsPage _jsAlertPage = homePage.clickJSAlertsLink();
        _jsAlertPage.ClickOn_JSPrompt();
        _jsAlertPage.EnterTextIn_JSPrompt(text);
        _jsAlertPage.Accept_JSPrompt();
        Assert.assertEquals(_jsAlertPage.Verify_Result(),"You entered: JS Prompt","Text does not entered in JS Prompt");
    }


}

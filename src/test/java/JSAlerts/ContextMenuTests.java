package JSAlerts;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTests extends BaseTest {
    @Test
    public void contextMenuAlertTest(){
        var _contextMenuPage = homePage.clickContextMenuLink();
        _contextMenuPage.FindTheLocationBox();
        _contextMenuPage.getTextFromContextAlert();
        Assert.assertEquals(_contextMenuPage.getTextFromContextAlert(),"You selected a context menu","Not the Correct pop-up");
        _contextMenuPage.AcceptContextAlert();
    }
}

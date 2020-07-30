package JSAlerts;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

public class ContextMenuTests extends BaseTest {
    @Test
    public void contextMenuAlertTest(){
        ContextMenuPage _contextMenuPage = homePage.clickContextMenuLink();
        _contextMenuPage.FindTheLocationBox();
        _contextMenuPage.getTextFromContextAlert();
        Assert.assertEquals(_contextMenuPage.getTextFromContextAlert(),"You selected a context menu","Not the Correct pop-up");
        _contextMenuPage.AcceptContextAlert();
    }
}

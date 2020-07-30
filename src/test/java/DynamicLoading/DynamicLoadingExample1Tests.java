package DynamicLoading;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.DynamicLoadingPage;

public class DynamicLoadingExample1Tests extends BaseTest {

    @Test
    public void CLickOnStartButtonTest(){
        DynamicLoadingPage _dynamicLoadingPage =  homePage.clickDynamicLoadingLink();
        DynamicLoadingExample1Page _example1LoadingPage = _dynamicLoadingPage.clickDynamicLoadingExample1PageLink();
       _example1LoadingPage.ClickStartButton();
        Assert.assertEquals(_example1LoadingPage.GetLoadedText(),"Hello World!","The expected text is not correct");
    }

}

package DynamicLoading;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoadingExample1Tests extends BaseTest {

    @Test
    public void CLickOnStartButtonTest(){
       var _dynamicLoadingPage =  homePage.clickDynamicLoadingLink();
       var _example1LoadingPage = _dynamicLoadingPage.clickDynamicLoadingExample1PageLink();
       _example1LoadingPage.ClickStartButton();
        Assert.assertEquals(_example1LoadingPage.GetLoadedText(),"Hello World!","The expected text is not correct");
    }

}

package DynamicLoading;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample2Page;
import pages.DynamicLoadingPage;

public class DynamicLoadingExample2Tests extends BaseTest {

    @Test
    public void ClickOnStartButtonAndWaitForTextToDisplayTest(){
        DynamicLoadingPage _dynamicLoadingPage = homePage.clickDynamicLoadingLink();
        DynamicLoadingExample2Page _example2LoadingPage = _dynamicLoadingPage.clickDynamicLoadingExample2PageLink();
      _example2LoadingPage.ClickOnStartButton();
        Assert.assertEquals(_example2LoadingPage.GetFinishText(),"Hello World!","The text is not correct or Wait does not work");
    }
}

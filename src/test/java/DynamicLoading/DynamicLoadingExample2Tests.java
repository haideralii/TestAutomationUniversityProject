package DynamicLoading;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoadingExample2Tests extends BaseTest {

    @Test
    public void ClickOnStartButtonAndWaitForTextToDisplayTest(){
       var _dynamicLoadingPage = homePage.clickDynamicLoadingLink();
      var _example2LoadingPage = _dynamicLoadingPage.clickDynamicLoadingExample2PageLink();
      _example2LoadingPage.ClickOnStartButton();
        Assert.assertEquals(_example2LoadingPage.GetFinishText(),"Hello World!","The text is not correct or Wait does not work");
    }
}

package JavaScriptsTests;

import Base.BaseTest;
import org.testng.annotations.Test;

public class InfinitScrollTests extends BaseTest {
    @Test
    public void VerifyInfinitScrollTest(){
        homePage.clickInfiniteScrollLink().ScrollToProvidedPassage(5);
    }

}

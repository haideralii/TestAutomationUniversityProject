package JavaScriptsTests;

import Base.BaseTest;
import org.testng.annotations.Test;

public class DropdownUpdateAttributes extends BaseTest {
    @Test
    public void UpdateDropdownAttributes(){
        homePage.clickDropDownLink().UpdateDropdownAttributes();
    }
}

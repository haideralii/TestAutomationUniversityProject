package Dropdown;

import Base.BaseTest;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.DropdownPage;
import pages.HomePage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTest {

    @Test
    public void testSelectFromDropdown(){
        String option = "Option 1";
        DropdownPage dropdown = homePage.clickDropDownLink();
        dropdown.selectFromDropDown(option);
        List<String> selectedOption = dropdown.getAllSelectedOptions();
        assertEquals(selectedOption.size(), 1, "option is not 1");
        assertTrue(selectedOption.contains(option),  "option is not correct");
    }

}

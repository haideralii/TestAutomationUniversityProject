package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTest {
   private WebDriver driver;
   protected HomePage homePage;

   @BeforeClass
   public void setUp() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
       driver = new ChromeDriver();
       driver.get("https://the-internet.herokuapp.com/");

       homePage = new HomePage(driver);

       driver.manage().window().maximize();
       System.out.println(driver.getTitle());

   }

   @AfterClass
   public void tearDown(){
       driver.quit();
   }


}

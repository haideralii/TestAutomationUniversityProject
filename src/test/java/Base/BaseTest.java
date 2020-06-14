package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTest {
   private WebDriver driver;

   public void setUp() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
       driver = new ChromeDriver();
       driver.get("https://the-internet.herokuapp.com/");
       driver.manage().window().maximize();
       System.out.println(driver.getTitle());

       WebElement _shiftingContent = driver.findElement(By.xpath("//li/a[@href='/shifting_content']"));
       _shiftingContent.click();
       Thread.sleep(1000);

       WebElement _menuElement = driver.findElement(By.xpath("//a[@href='/shifting_content/menu']"));
       _menuElement.click();
       Thread.sleep(1000);

       List<WebElement> _listOfElements = driver.findElements(By.xpath("//li/a"));
       System.out.println(_listOfElements.size());
       System.out.println(_listOfElements.stream());

       driver.quit();
   }

   public static void main(String args[]) throws InterruptedException {
       BaseTest test= new BaseTest();
       test.setUp();
   }

}

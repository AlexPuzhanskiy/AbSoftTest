package driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class WebDriverSettings {

    public ChromeDriver driver;
  @BeforeTest
             public void setUP() {
         System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();

     }

@AfterTest
    public void Close() {
         driver.quit();
}
}

package pages;
import driver.WebDriverSettings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends WebDriverSettings {
   private WebDriver driver;
       public HomePage(WebDriver driver){
        this.driver = driver;

    }
    @FindBy(id="add")
    private WebElement addComp;


    public void open() {
        driver.get("http://computer-database.gatling.io/computers");
    }

    public void addButton() {
        addComp.click();

    }
}

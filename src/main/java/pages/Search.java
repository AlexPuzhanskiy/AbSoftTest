package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search {

    private WebDriver driver;

    public Search(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "searchbox")
    private WebElement searchBox;

    @FindBy(id = "searchsubmit")
    private WebElement searchSubmit;


    @Step("Set the computer name in the filter")
    public void searchComp() {
        searchBox.sendKeys("Comp322");
    }

    @Step("Click filter by name")
    public void searchSubmitBtn() {
        searchSubmit.click();
    }

}

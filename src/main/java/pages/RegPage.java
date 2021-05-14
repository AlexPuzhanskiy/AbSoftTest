package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegPage {

    private WebDriver driver;

    public RegPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "name")
    private WebElement nameComp;

    @FindBy(id = "introduced")
    private WebElement inData;

    @FindBy(id = "discontinued")
    private WebElement quitData;

    @FindBy(xpath = "//option[@value='3']")
    private WebElement company;

    @FindBy(xpath = "//input[@class='btn primary']")
    private WebElement createComp;


    @Step("Set computer name")
    public void regName() {
        nameComp.sendKeys("Comp322");
    }

    @Step("Set introduced data")
    public void introducedData() {

        inData.sendKeys("2011-05-12");
    }


    @Step("Set discontinued data")
    public void discontinuedData() {
        quitData.sendKeys("2021-05-12");
    }

    @Step("Choose a company")
    public void nameCompany() {
        company.click();
    }

    @Step("Click Create this computer")
    public void createComp() {
        createComp.click();
    }
}


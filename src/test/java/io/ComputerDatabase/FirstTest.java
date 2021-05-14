package io.ComputerDatabase;

import driver.WebDriverSettings;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.RegPage;
import pages.Search;
import org.testng.annotations.BeforeMethod;

import java.io.ByteArrayInputStream;

public class FirstTest extends WebDriverSettings {


    @Test(priority = 1)
    public void test1() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        homePage.addButton();
        RegPage regPage = PageFactory.initElements(driver, RegPage.class);
        regPage.regName();
        regPage.introducedData();
        regPage.discontinuedData();
        regPage.nameCompany();
        regPage.CreateComp();
    }


    @Test(priority = 2)
    public void test2() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        Search search = PageFactory.initElements(driver, Search.class);
        search.searchComp();
        search.searchsubmitBtn();

        Allure.addAttachment("Screen", new ByteArrayInputStream(((TakesScreenshot) this.driver).getScreenshotAs(OutputType.BYTES)));

        Assert.assertTrue(!(driver.findElement(By.xpath("//section//h1")).getText().equals("No computer")), "Check is added computer is appears");


    }
}




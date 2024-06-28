package Testcases;

import Assertion.AssertionHomePage;
import Base.AfterMethod;
import Base.BeforeMethod;
import Helper.LoadDriver;
import PageAction.HomePageAction;
import PageAction.PreferationPageAction;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Author : Andre Suwandi
 *
 * How to run this test case : using terminal add write "mvn test -Dtest=SearchJobByLocation"
 */

public class SearchJobByLocation {
    public static BeforeMethod beforeMethod = new BeforeMethod();
    public static HomePageAction homePageAction = new HomePageAction();
    public static AfterMethod afterMethod = new AfterMethod();
    public static PreferationPageAction preferationPageAction = new PreferationPageAction();
    public static AssertionHomePage assertion = new AssertionHomePage();
    public static LoadDriver loadDriver = new LoadDriver();
    public static WebDriver webDriver;

    @BeforeTest
    public void setBeforeMethod() {
        beforeMethod.beforeMethod();
        webDriver = loadDriver.getDriver();
    }

    @SneakyThrows
    @Test
    public void searchJobByLocationTest() {
        // Go to url
        homePageAction.goToUrl(webDriver, "https://jobs.staffinc.co/");

        // Click button search
        homePageAction.clickButtonSearch(webDriver);

        // Click section job location
        preferationPageAction.clickSectionJobLocation(webDriver);

        // Step to search job by location
        preferationPageAction.searchJobLocation(webDriver, "Jawa Barat", "Kota Bandung");

        // Verify element after applied filter
        assertion.assertAfterFilterSearchByJobLocation(webDriver, "Kota Bandung");
    }

    @AfterTest
    public void setAfterMethod() {
        afterMethod.afterMethod();
    }
}

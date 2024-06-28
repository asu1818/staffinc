package Assertion;

import Base.WebUI;
import ObjectRepository.HomePageObj;
import org.openqa.selenium.WebDriver;

public class AssertionHomePage {
    public static HomePageObj homeObj = new HomePageObj();
    public static WebUI webUI = new WebUI();

    public void assertAfterFilterSearchByJobLocation(WebDriver webDriver, String textCity) {
        // verify title Filter apply present
        webUI.verifyElementVisible(webDriver, homeObj.getTxtValue("Preferensi Diterapkan"));

        // verify element card present
        webUI.verifyElementVisible(webDriver, homeObj.getCardBody());

        // verify img or logo company at card present
        webUI.verifyElementVisible(webDriver, homeObj.getImgCompany());

        // verify company name on card present
        webUI.verifyElementVisible(webDriver, homeObj.getCompanyName());

        // verify pin location on card present
        webUI.verifyElementVisible(webDriver, homeObj.getPinCity(textCity));

    }
}

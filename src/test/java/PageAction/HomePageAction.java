package PageAction;

import Base.WebUI;
import Helper.LoadDriver;
import ObjectRepository.HomePageObj;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageAction {
    public static HomePageObj homeObj = new HomePageObj();
    public static WebUI webUI = new WebUI();

    /**
     * Void for navigate to specific url
     *
     * @params urlLink
     * @params webDriver
     */
    @SneakyThrows
    public void goToUrl(WebDriver webDriver, String urlLink){
        webDriver.navigate().to(urlLink);

        // wait until element at home page visible
        webUI.waitForElementVisible(webDriver, homeObj.getMainImgStaffinc(), 10);
    }

    /**
     * Void for click button search
     *
     * @params webDriver
     */
    public void clickButtonSearch(WebDriver webDriver) throws InterruptedException {
        webUI.waitForElementVisible(webDriver, homeObj.getBtnSearch(), 10);
        webUI.click(webDriver, homeObj.getBtnSearch());
    }
}

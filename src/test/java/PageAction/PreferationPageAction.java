package PageAction;

import Base.WebUI;
import ObjectRepository.PreferationObj;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;

public class PreferationPageAction {
    public static PreferationObj preferationObj = new PreferationObj();
    public static WebUI webUI = new WebUI();

    /**
     * Void for navigate to specific url
     *
     * @params webDriver
     */
    @SneakyThrows
    public void clickSectionJobLocation(WebDriver webDriver) {
        // wait until element visible
        webUI.waitForElementVisible(webDriver, preferationObj.getDivJobLocation(), 10);

        // Click element
        webUI.click(webDriver, preferationObj.getDivJobLocation());
    }

    /**
     * Void for step search job location
     *
     * @params webDriver
     * @params provinsi
     * @params kota
     */
    @SneakyThrows
    public void searchJobLocation(WebDriver webDriver, String provinsi, String kota) {
        // wait until element visible
        webUI.waitForElementVisible(webDriver, preferationObj.getTxtSearchCityName(), 10);

        // Step choose provinsi
        webUI.click(webDriver, preferationObj.getDdlProvinsi());
        webUI.click(webDriver, preferationObj.getLstValueProvinsi(provinsi));

        // Step choose kota
        Thread.sleep(500);
        webUI.moveAndClickToCoordinateOfElement(webDriver, preferationObj.getDdlKota());
        webUI.click(webDriver, preferationObj.getTxtSearchCityName());
        webUI.settext(webDriver, preferationObj.getTxtSearchCityName(), kota);
        webUI.click(webDriver, preferationObj.getLstValueProvinsi(kota));

        // Click button simpan
        webUI.click(webDriver, preferationObj.getBtnSimpan());

        // Save configuration filter
        webUI.scrollIntoElement(webDriver, preferationObj.getBtnSave());
        webUI.click(webDriver, preferationObj.getBtnSave());
    }
}

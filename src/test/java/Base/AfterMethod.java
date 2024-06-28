package Base;

import Helper.LoadDriver;
import org.openqa.selenium.WebDriver;

public class AfterMethod {
    public static LoadDriver loadDriver = new LoadDriver();
    public WebDriver webDriver;

    public void afterMethod() {
        webDriver = loadDriver.getDriver();
        webDriver.close();
    }
}

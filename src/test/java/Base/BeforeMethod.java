package Base;

import Helper.LoadDriver;

public class BeforeMethod {
    public static LoadDriver loadDriver = new LoadDriver();
    public void beforeMethod() {
        loadDriver.loadWebDriver();
    }
}

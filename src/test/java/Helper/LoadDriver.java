package Helper;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoadDriver {
    public static WebDriver webDriver;

    public WebDriver getDriver() {
        return webDriver;
    }

    @Test
    public void loadWebDriver() {
        System.setProperty("webdriver.chrome.driver","/Users/bytedance/endurium-ui-web/driver/chromedriver");
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("<HOST:PORT>");
        ChromeOptions opstions = new ChromeOptions();
        opstions.setCapability("proxy", proxy);
        ChromeDriverService service = new ChromeDriverService.Builder().build();;
        opstions.addArguments("--remote-allow-origins=*");

        webDriver = new ChromeDriver(service, opstions);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}

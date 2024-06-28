package Base;

import lombok.SneakyThrows;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.InputEvent;

import static Constants.GeneralContants.waitForSlow;

public class WebUI {
    private static final Logger log = LogManager.getLogger(WebUI.class.getName());
    public void waitForElementVisible(WebDriver webDriver, String xpath, int timeout) throws InterruptedException {
        for(int i=0; i <= timeout; i++) {
            Thread.sleep(500);
            WebElement obj = webDriver.findElement((By.xpath(xpath)));
            boolean sizeElement = obj.isDisplayed();
            if(sizeElement) {
                log.info("Element Found");
                break;
            } else {
                log.info("Element Not Found");
            }
        }
    }

    public void verifyElementVisible(WebDriver webDriver, String xpath) {
        webDriver.findElement(By.xpath(xpath));
    }

    public void click(WebDriver webDriver, String xpath) throws InterruptedException {
        waitForElementVisible(webDriver, xpath, waitForSlow);
        webDriver.findElement(By.xpath(xpath)).click();
    }

    public void settext(WebDriver webDriver,String xpath, String text) throws InterruptedException {
        waitForElementVisible(webDriver, xpath, waitForSlow);
        click(webDriver, xpath);
        Thread.sleep(500);
        webDriver.findElement(By.xpath(xpath)).clear();
        webDriver.findElement(By.xpath(xpath)).sendKeys(new CharSequence[] {text});
    }

    @SneakyThrows
    public void moveAndClickToCoordinateOfElement(WebDriver webDriver, String xpath) {
        WebElement element = webDriver.findElement(By.xpath(xpath));
        Point point = element.getLocation();

        int x = point.getX() + 3;
        int y = point.getY() + 205;

        Robot robot = new Robot();
        robot.mouseMove(x, y);

        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK );
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK );
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK );
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK );
    }

    public void scrollIntoElement(WebDriver webDriver, String xpath) {
        WebElement element = webDriver.findElement(By.xpath(xpath));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(element);
        actions.perform();
    }
}

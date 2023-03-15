package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected static WebDriver DRIVER;
    private static WebDriverWait wait;

    static {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/ChromeDriver/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        DRIVER = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(DRIVER, 10);
    }

    public BasePage(WebDriver driver){
        BasePage.DRIVER = driver;
        wait = new WebDriverWait(DRIVER, 10);
    }

    public static void quitDriver(){
        DRIVER.quit();
    }

    public static void navegateTo(String url){
        DRIVER.get(url);
    }

    private static WebElement find(String locator){
        return wait.until( ExpectedConditions.visibilityOfElementLocated( By.xpath(locator) ) );
    }

    public static void click(String locator){
        find(locator).click();
    }

    public static void write(String locator, String textToWrite){
        find(locator).clear();
        find(locator).sendKeys(textToWrite);
    }

    public static boolean isDisplayed(String locator){
        return find(locator).isDisplayed();
    }

}
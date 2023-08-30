package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageDriver {
    private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        return webDriver.get();
    }

    public static void setWebDriver(WebDriver driver) {
        webDriver.set(driver);
        if (webDriver != null) {
            System.out.println("driver is set in pagedriver class");
        }
    }

}

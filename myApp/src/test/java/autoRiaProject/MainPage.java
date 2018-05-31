package autoRiaProject;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by neste on 31.05.2018.
 */
public class MainPage {
    private  static WebDriver driver;

    @BeforeClass
    public  static void setup () {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://auto.ria.ua");
    }
        @Test
        public  void openUrl() {
            driver.getPageSource();
        }
    }


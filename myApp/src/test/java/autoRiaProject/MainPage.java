package autoRiaProject;

import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

/**
 * Created by neste on 31.05.2018.
 */

public class MainPage {



        @Test
        public  void openUrl() {
            //System.setProperty("webdriver.chrome.driver", "/chromedriver");
            System.setProperty("selenide.browser", "Chrome");
          
          open("http://auto.ria.ua");
        }
    }


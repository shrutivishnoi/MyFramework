import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class base {

    public static WebDriver driver= null;
    @BeforeTest
    public void fun1()
    {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("-incognito");
        options.addArguments("--user-agent= 5Lo1RZau");
        options.addArguments("--window-size=1920,1920");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("test-type=browser");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY,options);
        System.setProperty("webdriver.chrome.driver", "/Users/shrutivishnoi/Desktop/chromedriver");
        driver= new ChromeDriver(capabilities);

        String url = "https://stg1-am.ticketmaster.com/qcreview/buy";
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @AfterTest
    public void fun2()
    {
        driver.quit();
    }
}

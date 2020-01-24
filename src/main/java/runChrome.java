import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class runChrome {

    static WebDriver driver= null;
    public static void main(String args[]) throws InterruptedException {
        //for private window

        ChromeOptions options = new ChromeOptions();
        options.addArguments("-incognito");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY,options);
        System.setProperty("webdriver.chrome.driver", "/Users/shrutivishnoi/Desktop/chromedriver");
        driver= new ChromeDriver(capabilities);

        String url = "https://www.google.com/";
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("******************");

    }

}

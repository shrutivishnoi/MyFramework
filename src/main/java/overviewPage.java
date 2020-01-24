
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class overviewPage {

    WebDriver driver;
    By filter = By.xpath("//input[@class='quantity-selector-quantityInputsEnabled-2K-Vg']");

    public overviewPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    // clear qty filter
    public void clearqtyFilter()
    {
        driver.findElement(filter).clear();
    }

    public void GetqtyFilter()
    {
        driver.findElement(filter).getText()   ;
        System.out.println(driver.findElement(filter).getText());
    }

    // enter value in qty filter
    public void entrValueQtyFilter(String strQty)
    {
        driver.findElement(filter).sendKeys(strQty);
    }

    public Long getMaxLimit() throws FileNotFoundException, IOException, ParseException
    {
        JSONParser parse = new JSONParser();
        JSONObject jo1 = (JSONObject) parse.parse(new FileReader("./configApp.json"));
        JSONObject jo2 = (JSONObject) jo1.get("data");
        JSONObject jo3 = (JSONObject) jo2.get("appConfiguration");
        System.out.println(jo3);
        JSONObject jo4 = (JSONObject) jo3.get("seatRules");
        System.out.println(jo4.get("maxSeatLimit"));
        Long maxLimit = (Long) jo4.get("maxSeatLimit");
        System.out.println(maxLimit);
        return maxLimit;
    }
}

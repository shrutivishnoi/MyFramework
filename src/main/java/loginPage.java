import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    WebDriver driver;
    By signInHeader= By.xpath("//a[@id='invoke-signin-modal']");
    By emailfield = By.xpath("//input[@name='email']");
    By passField = By.xpath("//input[@name='password']");
    By signInButtn= By.xpath("//button[@type='submit']");
    By eventClick= By.xpath("//div[text()='2019-20 Season Tickets Price']/../../..//button[text()='Select']");
    By filter = By.xpath("//input[@class='quantity-selector-quantityInputsEnabled-2K-Vg']");

    // initialize webdriver
    public loginPage(WebDriver driver)
    {
        this.driver = driver;
        //  PageFactory.initElements(driver, this);
    }

    //Click on SignIn at header
    public void clickSignInHeader()
    {
        driver.findElement(signInHeader).click();
    }

    //Set emailid in email textbox
    public void setUserName(String strEmail)
    {
        driver.findElement(emailfield).sendKeys(strEmail);
    }

    //Set password in password textbox
    public void setPassword(String strPass)
    {
        driver.findElement(passField).sendKeys(strPass);
    }

    //Click on SignIn button
    public void clickSignin()
    {
        driver.findElement(signInButtn).click();
    }

    //click on event
    public void clickOnEvent()
    {
        driver.findElement(eventClick).click();
    }

    // clear qty filter
    public void clearqtyFilter()
    {
        driver.findElement(filter).clear();
    }

    // enter value in qty filter
    public void entrValueQtyFilter(String strQty)
    {
        driver.findElement(filter).sendKeys(strQty);
    }

    // logIn module
    public void loginToIOMSite(String strEmail,String strPass)
    {
        //Fill user name
        this.setUserName(strEmail);
        //Fill password
        this.setPassword(strPass);
        //Click Signin button
        this.clickSignin();
    }
}

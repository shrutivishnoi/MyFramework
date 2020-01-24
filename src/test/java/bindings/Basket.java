package bindings;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Basket {
    WebDriver driver;


    @Before(value="@web")
    public void beforeScenarioweb(){
        System.out.println("This will run before the Scenario web");
    }

    @Before(value="@mobile")
    public void beforeScenariomobile(){
        System.out.println("This will run before the Scenario mobile");
    }

    @Before(value="@test")
    public void beforeScenario(){
        System.out.println("This will run before the Scenario dummy");
    }


    @After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }


    @Given("^that i am on the shopping website$")
    public void that_i_am_on_the_shopping_website() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "/Users/vijaykumar/Vijay_iomedia/Softwares/chromedriver");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        driver.get("https://www.edgewordstraining.co.uk/demo-site/");
//        driver.manage().window().maximize();
        System.out.println("Step 1");
    }

    @When("^i add an item to the basket$")
    public void i_add_an_item_to_the_basket() throws Throwable {
//        driver.findElement(By.cssSelector("#masthead [type='search']")).click();
//        driver.findElement(By.cssSelector("#masthead [type='search']")).sendKeys("cap");
//        driver.findElement(By.cssSelector("#masthead [type='search']")).sendKeys(Keys.ENTER);
//        driver.findElement(By.cssSelector(".entry-summary button")).click();
        System.out.println("Step 2");
    }

    @Then("^i can view the item in my basket$")
    public void i_can_view_the_item_in_my_basket() throws Throwable {
//        driver.findElement(By.linkText("Cart")).click();
//        assertTrue(driver.findElement(By.linkText("Cap")).isDisplayed());
//        driver.findElement(By.linkText("×")).click();
//        // explicit wait for item to be removed as may use AJAX
//        WebDriverWait wait=new WebDriverWait(driver, 20); //explicit wait if we want to use
//        WebElement returnToShopLink;
//        returnToShopLink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Return to shop")));
//        returnToShopLink.click();
//        driver.quit();
        System.out.println("Step 3");
    }


    @Given("^that i am on the shopping website(\\d+)$")
    public void that_i_am_on_the_shopping_website(int arg1) throws Throwable {
        System.out.println("Step 1 of scenario-2");

    }

    @When("^i add an item to the basket(\\d+)$")
    public void i_add_an_item_to_the_basket(int arg1) throws Throwable {
        System.out.println("Step 2 of scenario-2");

    }

    @Then("^i can view the item in my basket(\\d+)$")
    public void i_can_view_the_item_in_my_basket(int arg1) throws Throwable {
        System.out.println("Step 3 of scenario-2");

    }


    @Given("^that i am on the shopping vasket$")
    public void that_i_am_on_the_shopping_vasket() throws Throwable {
        System.out.println("Step 1 of scenario-3");
    }

    @When("^i add an item to the vasket$")
    public void i_add_an_item_to_the_vasket() throws Throwable {
        System.out.println("Step 2 of scenario-3");
    }

    @Then("^i can view the item in my vasket$")
    public void i_can_view_the_item_in_my_vasket() throws Throwable {
        System.out.println("Step 3 of scenario-3");
    }


}

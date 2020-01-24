import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class test extends base{


    @Test(priority=1)
    public void fun3() throws InterruptedException {

        loginPage loginpage =
                PageFactory.initElements(driver,
                loginPage.class);
        loginpage = new loginPage(driver);
        loginpage.clickSignInHeader();
        loginpage.loginToIOMSite("dana.hammer@io-media.com", "tm1234");
        Thread.sleep(10000);
        loginpage.clickOnEvent();
        Thread.sleep(10000);

    }


    @Test(priority=2)
    public void fun4()
    {
//        overviewPage overviewpage =
//                PageFactory.initElements(driver,
//                        overviewPage.class);
//        overviewpage = new overviewPage(driver);

        System.out.println("********************");
    }
}

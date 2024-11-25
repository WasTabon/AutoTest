package task_14;

import org.testng.Assert;
import task_14.HomePage14Po;

import static task_14.DriverPull.getDriver;

public class HomePage14BO {
HomePage14Po homePagePo;

    public HomePage14BO getIndex() {
        getDriver().get("https://www.demoblaze.com/index.html");
        homePagePo = new HomePage14Po();
        return this;

    }

    public HomePage14BO verifyHomePageButtn() {
        Assert.assertTrue(homePagePo.getHomePage().isDisplayed());
        return this;
    }

    public HomePage14BO verifyLogInButtn() {

        Assert.assertTrue(homePagePo.getLogInButtn().isDisplayed());

        return this;
    }

    public void verifyUserInput() {
        Assert.assertTrue(homePagePo.getUserInput().isDisplayed());

    }

    public HomePage14BO clickLogin() {
        homePagePo.getLogInButtn().click();
        return this;
    }
}

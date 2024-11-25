package task_10;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;


import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Task10 {
    WebDriver webDriver;
    @BeforeTest
    void setup(){
        System.setProperty("webdriver.chrome.driver",
                "driver/chromedriver.exe");

        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();

    }
    @Test
    void task10Test(){
        webDriver.get("https://www.demoblaze.com/index.html");
        WebElement homePage = webDriver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));
        WebElement logIn = webDriver.findElement(By.id("login2"));

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement phone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")));



        phone.click();
        webDriver.navigate().back();
        homePage.click();
        logIn = wait.until(ExpectedConditions.elementToBeClickable(By.id("login2")));
        logIn.click();

    }
    @AfterTest
    void closeBrowser(){
        webDriver.quit();
        webDriver.close();
    }
}
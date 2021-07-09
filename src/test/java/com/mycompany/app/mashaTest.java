package com.mycompany.app;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class mashaTest {
    @Test
    public static void userCanSearchKeywordWithGoogle() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\markouskaya_m\\IdeaProjects\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://uitestingplayground.com/classattr");
        driver.findElement(By.xpath("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")).click();
        //open("http://uitestingplayground.com/classattr");
        System.out.println("Open page");

        //WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // $(By.xpath("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")).click();
        System.out.println("Click button");
       WebDriver.Timeouts timeout = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println("Click button ok");

    }

}

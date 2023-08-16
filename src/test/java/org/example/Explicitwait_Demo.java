package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Explicitwait_Demo {
    @Test
    public void WaitDemo() {
      WebDriver driver=new ChromeDriver();
      driver.get("https://app.vwo.com");
         WaitforHelper Element=new WaitforHelper(driver);
        Element.To_Click_Element(By.id("login-username")).sendKeys("kavyashekarvijaya@gmail.com");
        Element.To_Click_Element(By.name("password")).sendKeys("Hari@20010110");
        Element.To_check_Present_of_Element_located(By.id("js-login-btn")).click();
    }



}

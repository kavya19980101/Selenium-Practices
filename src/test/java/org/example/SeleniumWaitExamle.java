package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumWaitExamle {
    @Test
    public void ImplicitwaitExample() {
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("kavyashekarvijaya@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"login-password\"]")).sendKeys("Hari@20010110");
        driver.findElement(By.xpath("//*[@id=\"js-login-btn\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String DashboardURL=driver.getCurrentUrl();
        System.out.println(DashboardURL);
    }//*[@id="main-container"]/div/div/div[1]/div[1]/h1





}

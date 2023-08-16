package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Pageloadstrategy {
    @Test
    public static void Page()
    {

        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("start-maximized");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://app.vwo.com");
        //driver.close();//Will close the current window and session remain same..will get ->invalid session id
        //driver.quit();//Will close all the windows and session=null..will get-> session is nulll error
        String title=driver.getTitle();
       System.out.println(title);
       driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("kavyashekarvijaya@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"login-password\"]")).sendKeys("Hari@20010110");
        driver.findElement(By.xpath("//*[@id=\"js-login-btn\"]")).click();
     // driver.findElement(By.)
        String url=driver.getCurrentUrl();
        System.out.println("The URL of the Dashboard "+url);
    }
}

package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Maximixe_window {
    @Test
    public static void Maxi(){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver=new ChromeDriver(options);
      driver.get("https://app.vwo.com");
    }
}

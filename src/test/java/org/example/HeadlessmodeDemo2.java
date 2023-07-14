package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessmodeDemo2 {

    @Test
    public static void Headless(){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless");
        ChromeDriver driver=new ChromeDriver(options);
        driver.get("https://app.vwo.com");
        String title=driver.getTitle();
        System.out.println(title);
    }
}

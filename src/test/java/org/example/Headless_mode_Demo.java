package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Headless_mode_Demo {

       ChromeDriver driver=new ChromeDriver();

    @Test
    public void Headless(){
        //ChromeOptions options=new ChromeOptions();
        //options.setHeadless(true);
        //ChromeDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com");
        String title=driver.getTitle();
        System.out.println(title);
    }
    @Test
    public void Headless1(){
        String getCurrentUrl=driver.getCurrentUrl();
        System.out.println(getCurrentUrl);
    }
}

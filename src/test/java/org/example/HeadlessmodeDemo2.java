package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class HeadlessmodeDemo2 {

    @Test
    public static void Headless(){
        ChromeOptions options=new ChromeOptions();
      //  C:\Users\Kaviya S\Documents\crx\Get CRX 1.41.0.0.crx
   options.addExtensions(new File("C:\\Users\\Kaviya S\\Documents\\crx\\Get CRX 1.41.0.0.crx"));
        //options.addArguments("--headless");
        //options.
        ChromeDriver driver=new ChromeDriver(options);
        driver.get("https://app.vwo.com");
       //String title=driver.getTitle();
       // System.out.println(title);
    }
}

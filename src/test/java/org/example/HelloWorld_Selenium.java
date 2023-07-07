package org.example;


import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;

public class HelloWorld_Selenium {

public static final String USERNAME="kavyas_OjNri8";
public static final String ACCESS_KEY="PDnTspzUfBetqyssJEMA";
    public static final String url="https//:" + USERNAME + ":" + ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
    @Test
    public static void Hello_test() throws MalformedURLException {
        MutableCapabilities capabilities = new MutableCapabilities();
        capabilities.setCapability("browserName", "Chrome");
        HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
        browserstackOptions.put("os", "Windows");
        browserstackOptions.put("osVersion", "10");
        browserstackOptions.put("browserVersion", "latest");
        browserstackOptions.put("local", "false");
        browserstackOptions.put("seleniumVersion", "4.9.1");
        capabilities.setCapability("bstack:options", browserstackOptions);
        WebDriver driver=new RemoteWebDriver(new URL(url), capabilities);
        driver.get("https://app.vwo.com");
        String title=driver.getTitle();
        System.out.println(title);
        //driver.quit();
    }
}

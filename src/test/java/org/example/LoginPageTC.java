package org.example;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginPageTC {
        WebDriver driver;
        @BeforeSuite
        public void setup(){
                driver=new ChromeDriver();
        }
        @Description("Verify that, User are not able to login with valid user name and invalid password")
       @Test(priority = 1, groups = "negative")
        public void TestNegative1() throws InterruptedException {
       driver.get("https://app.vwo.com");
       WebElement Username=driver.findElement(By.id("login-username"));
       WebElement Password=driver.findElement(By.name("password"));
       WebElement submitbutton=driver.findElement(By.id("js-login-btn"));
       WebElement NotificationError=driver.findElement(By.id("js-notification-box"));
               Username.sendKeys("kavyashekar@gmail.com");
                Password.sendKeys("Kavi");
                submitbutton.click();
            Thread.sleep(5000);
            System.out.println(NotificationError.getText());
            Assert.assertEquals(NotificationError.getText(), "Your email, password, IP address or location did not match");
        }
        @Description("Verify that, User are not able to login with invalid user name and valid password")
        @Test(priority = 2, groups = "negative")
        public void TestNegative2() throws InterruptedException {
                driver.get("https://app.vwo.com");
                WebElement Username=driver.findElement(By.id("login-username"));
                WebElement Password=driver.findElement(By.name("password"));
                WebElement submitbutton=driver.findElement(By.id("js-login-btn"));
                WebElement NotificationError=driver.findElement(By.id("js-notification-box"));
                Username.sendKeys("kavyashekar@gmail.com");
                Password.sendKeys("Hari@20010110");
                submitbutton.click();
                Thread.sleep(3000);
                System.out.println(NotificationError.getText());
                Assert.assertEquals(NotificationError.getText(), "Your email, password, IP address or location did not match");


        }

    @Description("Verify that, User are not able to login with invalid user name and invalid password")
    @Test(priority = 3, groups = "negative")
    public void TestNegative3() throws InterruptedException {
        driver.get("https://app.vwo.com");
        WebElement Username=driver.findElement(By.id("login-username"));
        WebElement Password=driver.findElement(By.name("password"));
        WebElement submitbutton=driver.findElement(By.id("js-login-btn"));
        WebElement NotificationError=driver.findElement(By.id("js-notification-box"));
        Username.sendKeys("kavyashekar@gmail.com");
        Password.sendKeys("Hari");
        submitbutton.click();
        Thread.sleep(3000);
        System.out.println(NotificationError.getText());
        Assert.assertEquals(NotificationError.getText(), "Your email, password, IP address or location did not match");


    }
    @Description("Verify that, User are not able to login with Blank user name and valid password")
    @Test(priority = 4, groups = "negative")
    public void TestNegative4() throws InterruptedException {
        driver.get("https://app.vwo.com");
        WebElement Password=driver.findElement(By.name("password"));
        WebElement submitbutton=driver.findElement(By.id("js-login-btn"));
        WebElement NotificationError=driver.findElement(By.id("js-notification-box"));
        Password.sendKeys("Hari");
        submitbutton.click();
        Thread.sleep(3000);
        System.out.println(NotificationError.getText());
        Assert.assertEquals(NotificationError.getText(), "Your email, password, IP address or location did not match");


    }
    @Description("Verify that, User are not able to login with valid user name and Blank password")
    @Test(priority = 5, groups = "negative")
    public void TestNegative5() throws InterruptedException {
        driver.get("https://app.vwo.com");
        WebElement Username=driver.findElement(By.id("login-username"));
        WebElement submitbutton=driver.findElement(By.id("js-login-btn"));
        Username.sendKeys("kavyashekarvijaya@gmail.com");
        WebElement NotificationError=driver.findElement(By.id("js-notification-box"));
        submitbutton.click();
        Thread.sleep(3000);
        System.out.println(NotificationError.getText());
        Assert.assertEquals(NotificationError.getText(), "Your email, password, IP address or location did not match");


    }
    @Description("Verify that, User are not able to login with Blank user name and Blank password")
    @Test(priority = 6, groups = "negative")
    public void TestNegative6() throws InterruptedException {
        driver.get("https://app.vwo.com");
        WebElement submitbutton=driver.findElement(By.id("js-login-btn"));
        WebElement NotificationError=driver.findElement(By.id("js-notification-box"));
        submitbutton.click();
        Thread.sleep(5000);
        System.out.println(NotificationError.getText());
        Assert.assertEquals(NotificationError.getText(), "Your email, password, IP address or location did not match");


    }
    @Description("Verify that, User are not able to login with Specialcharater user name and valid password")
    @Test(priority = 7, groups = "negative")
    public void TestNegative7() throws InterruptedException {
        driver.get("https://app.vwo.com");
        WebElement Username=driver.findElement(By.id("login-username"));
        WebElement Password=driver.findElement(By.name("password"));
        WebElement submitbutton=driver.findElement(By.id("js-login-btn"));
        WebElement NotificationError=driver.findElement(By.id("js-notification-box"));
        Username.sendKeys("kav62367@!%$@^&");
        Password.sendKeys("Hari@20010110");
        submitbutton.click();
        Thread.sleep(5000);
        System.out.println(NotificationError.getText());
        Assert.assertEquals(NotificationError.getText(), "Your email, password, IP address or location did not match");


    }
    @Description("Verify that, User are not able to login with valid user name and Special character password")
    @Test(priority = 8, groups = "negative")
    public void TestNegative8() throws InterruptedException {
        driver.get("https://app.vwo.com");
        WebElement Username=driver.findElement(By.id("login-username"));
        WebElement Password=driver.findElement(By.name("password"));
        WebElement submitbutton=driver.findElement(By.id("js-login-btn"));
        WebElement NotificationError=driver.findElement(By.id("js-notification-box"));
        Username.sendKeys("kavyashekarvijaya@gmail.com");
        Password.sendKeys("@%&$#%@");
        submitbutton.click();
        Thread.sleep(5000);
        System.out.println(NotificationError.getText());
        Assert.assertEquals(NotificationError.getText(), "Your email, password, IP address or location did not match");
    }
    @Description("Verify that, User are not able to login with Special character user name and Special character password")
    @Test(priority = 9, groups = "negative")
    public void TestNegative9() throws InterruptedException {
        driver.get("https://app.vwo.com");
        WebElement Username=driver.findElement(By.id("login-username"));
        WebElement Password=driver.findElement(By.name("password"));
        WebElement submitbutton=driver.findElement(By.id("js-login-btn"));
        WebElement NotificationError=driver.findElement(By.id("js-notification-box"));
        Username.sendKeys("@#%&%%*@!");
        Password.sendKeys("@%&$#%@");
        submitbutton.click();
        Thread.sleep(5000);
        System.out.println(NotificationError.getText());
        Assert.assertEquals(NotificationError.getText(), "Your email, password, IP address or location did not match");
    }
    @Description("Verify that, User are not able to login with Number user name and valid password")
    @Test(priority = 10, groups = "negative")
    public void TestNegative10() throws InterruptedException {
        driver.get("https://app.vwo.com");
        WebElement Username=driver.findElement(By.id("login-username"));
        WebElement Password=driver.findElement(By.name("password"));
        WebElement submitbutton=driver.findElement(By.id("js-login-btn"));
        WebElement NotificationError=driver.findElement(By.id("js-notification-box"));
        Username.sendKeys("8301101083");
        Password.sendKeys("Hari@20010110");
        submitbutton.click();
        Thread.sleep(5000);
        System.out.println(NotificationError.getText());
        Assert.assertEquals(NotificationError.getText(), "Your email, password, IP address or location did not match");


    }
    @Description("Verify that, User are not able to login with Valid user name and Number password")
    @Test(priority = 11, groups = "negative")
    public void TestNegative11() throws InterruptedException {
        driver.get("https://app.vwo.com");
        WebElement Username=driver.findElement(By.id("login-username"));
        WebElement Password=driver.findElement(By.name("password"));
        WebElement submitbutton=driver.findElement(By.id("js-login-btn"));
        WebElement NotificationError=driver.findElement(By.id("js-notification-box"));
        Username.sendKeys("kavyashekarvijaya@gmail.com");
        Password.sendKeys("6579898967");
        submitbutton.click();
        Thread.sleep(5000);
        System.out.println(NotificationError.getText());
        Assert.assertEquals(NotificationError.getText(), "Your email, password, IP address or location did not match");


    }
    @Description("Verify that, User are not able to login with Number user name and Number password")
    @Test(priority = 12, groups = "negative")
    public void TestNegative12() throws InterruptedException {
        driver.get("https://app.vwo.com");
        WebElement Username=driver.findElement(By.id("login-username"));
        WebElement Password=driver.findElement(By.name("password"));
        WebElement submitbutton=driver.findElement(By.id("js-login-btn"));
        WebElement NotificationError=driver.findElement(By.id("js-notification-box"));
        Username.sendKeys("6437889990");
        Password.sendKeys("6579898967");
        submitbutton.click();
        Thread.sleep(5000);
        System.out.println(NotificationError.getText());
        Assert.assertEquals(NotificationError.getText(), "Your email, password, IP address or location did not match");


    }
    @Description("Verify that, User are not able to login with username that contains a mix of alphanumeric characters and a valid password")
    @Test(priority = 13, groups = "negative")
    public void TestNegative13() throws InterruptedException {
        driver.get("https://app.vwo.com");
        WebElement Username=driver.findElement(By.id("login-username"));
        WebElement Password=driver.findElement(By.name("password"));
        WebElement submitbutton=driver.findElement(By.id("js-login-btn"));
        WebElement NotificationError=driver.findElement(By.id("js-notification-box"));
        Username.sendKeys("kavya6437889990");
        Password.sendKeys("Hari@20010110 ");
        submitbutton.click();
        Thread.sleep(5000);
        System.out.println(NotificationError.getText());
        Assert.assertEquals(NotificationError.getText(), "Your email, password, IP address or location did not match");


    }
    @Description("Verify that, User are not able to login with username that contains a mix of alphanumeric characters and a alphanumeric characters password")
    @Test(priority = 14, groups = "negative")
    public void TestNegative14() throws InterruptedException {
        driver.get("https://app.vwo.com");
        WebElement Username=driver.findElement(By.id("login-username"));
        WebElement Password=driver.findElement(By.name("password"));
        WebElement submitbutton=driver.findElement(By.id("js-login-btn"));
        WebElement NotificationError=driver.findElement(By.id("js-notification-box"));
        Username.sendKeys("380925kjekj");
        Password.sendKeys("kavya6437889990");
        submitbutton.click();
        Thread.sleep(5000);
        System.out.println(NotificationError.getText());
        Assert.assertEquals(NotificationError.getText(), "Your email, password, IP address or location did not match");


    }
    @Description("Verify that, User are not able to login with username that contains a mix of valid and a alphanumeric characters password")
    @Test(priority = 15, groups = "negative")
    public void TestNegative15() throws InterruptedException {
        driver.get("https://app.vwo.com");
        WebElement Username=driver.findElement(By.id("login-username"));
        WebElement Password=driver.findElement(By.name("password"));
        WebElement submitbutton=driver.findElement(By.id("js-login-btn"));
        WebElement NotificationError=driver.findElement(By.id("js-notification-box"));
        Username.sendKeys("kavyashekarvijaya@gmail.com");
        Password.sendKeys("kavya6437889990");
        submitbutton.click();
        Thread.sleep(5000);
        System.out.println(NotificationError.getText());
        Assert.assertEquals(NotificationError.getText(), "Your email, password, IP address or location did not match");


    }
    @Description("Verify that, User are not able to login with username that contains a Upper letter and lower letter Username and valid password")
    @Test(priority = 16, groups = "negative")
    public void TestNegative16() throws InterruptedException {
        driver.get("https://app.vwo.com");
        WebElement Username=driver.findElement(By.id("login-username"));
        WebElement Password=driver.findElement(By.name("password"));
        WebElement submitbutton=driver.findElement(By.id("js-login-btn"));
        WebElement NotificationError=driver.findElement(By.id("js-notification-box"));
        Username.sendKeys("KAVYASHEKARVIJAYA@gmail.com");
        Password.sendKeys("Hari@20010110");
        submitbutton.click();
        Thread.sleep(5000);
        System.out.println(NotificationError.getText());
        Assert.assertEquals(NotificationError.getText(), "Your email, password, IP address or location did not match");


    }
    @Description("Verify that, User are not able to login with username that contains Valid and Upperletter and lower letter password")
    @Test(priority = 17, groups = "negative")
    public void TestNegative17() throws InterruptedException {
        driver.get("https://app.vwo.com");
        WebElement Username=driver.findElement(By.id("login-username"));
        WebElement Password=driver.findElement(By.name("password"));
        WebElement submitbutton=driver.findElement(By.id("js-login-btn"));
        WebElement NotificationError=driver.findElement(By.id("js-notification-box"));
        Username.sendKeys("kavyashekarvijaya@gmail.com");
        Password.sendKeys("hARI@20010110");
        submitbutton.click();
        Thread.sleep(5000);
        System.out.println(NotificationError.getText());
        Assert.assertEquals(NotificationError.getText(), "Your email, password, IP address or location did not match");


    }
    @Description("Verify that, User are not able to login with username that contains a mix of Lower letter and upper letter password")
    @Test(priority = 18, groups = "negative")
    public void TestNegative18() throws InterruptedException {
        driver.get("https://app.vwo.com");
        WebElement Username=driver.findElement(By.id("login-username"));
        WebElement Password=driver.findElement(By.name("password"));
        WebElement submitbutton=driver.findElement(By.id("js-login-btn"));
        WebElement NotificationError=driver.findElement(By.id("js-notification-box"));
        Username.sendKeys("KAVYASHEKARVIJAYA@gmail.com");
        Password.sendKeys("hARI@20010110");
        submitbutton.click();
        Thread.sleep(5000);
        System.out.println(NotificationError.getText());
        Assert.assertEquals(NotificationError.getText(), "Your email, password, IP address or location did not match");


    }
    @Description("Verify that, User are not able to login with username (over 30 characters) and valid  password")
    @Test(priority = 19, groups = "negative")
    public void TestNegative19() throws InterruptedException {
        driver.get("https://app.vwo.com");
        WebElement Username=driver.findElement(By.id("login-username"));
        WebElement Password=driver.findElement(By.name("password"));
        WebElement submitbutton=driver.findElement(By.id("js-login-btn"));
        WebElement NotificationError=driver.findElement(By.id("js-notification-box"));
        Username.sendKeys("avyakjhadskehfkjma;ldk;kmdzkncjbkjsdnlkcfnlksnklanskl@gmail.com");
        Password.sendKeys("Hari@20010110");
        submitbutton.click();
        Thread.sleep(5000);
        System.out.println(NotificationError.getText());
        Assert.assertEquals(NotificationError.getText(), "Your email, password, IP address or location did not match");


    }
        @Description("Verify that, User are able to login with valid username and a valid password")
       @Test(priority = 20, groups = "positive")
       public void TestPositive() throws InterruptedException {
               driver.get("https://app.vwo.com");
                WebElement Username=driver.findElement(By.id("login-username"));
               WebElement Password=driver.findElement(By.name("password"));
               WebElement submitbutton=driver.findElement(By.id("js-login-btn"));
               Username.sendKeys("kavyashekarvijaya@gmail.com");
                Password.sendKeys("Hari@20010110");
               submitbutton.click();
               Thread.sleep(5000);
               String url=driver.getCurrentUrl();
               Assert.assertEquals(url, "https://app.vwo.com/#/dashboard");
               System.out.println(url);

        }

    }


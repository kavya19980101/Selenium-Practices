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
        public void TestNegative() throws InterruptedException {
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
                Password.sendKeys("Hari");
                submitbutton.click();
                Thread.sleep(3000);
                System.out.println(NotificationError.getText());
                Assert.assertEquals(NotificationError.getText(), "Your email, password, IP address or location did not match");


        }
        @Description("Verify that, User are able to login with valid user name and valid password")
       @Test(priority = 3, groups = "positive")
       public void TestPositive() throws InterruptedException {
               driver.get("https://app.vwo.com");
                WebElement Username=driver.findElement(By.id("login-username"));
               WebElement Password=driver.findElement(By.name("password"));
               WebElement submitbutton=driver.findElement(By.id("js-login-btn"));
               Username.sendKeys("kavyashekarvijaya@gmail.com");
                Password.sendKeys("Hari@20010110");
               submitbutton.click();
               Thread.sleep(3000);
               String url=driver.getCurrentUrl();
               Assert.assertEquals(url, "https://app.vwo.com/#/dashboard");
               System.out.println(url);

        }

    }


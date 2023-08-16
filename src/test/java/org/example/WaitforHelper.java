package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitforHelper  {

    public WebDriver driver;

    public WaitforHelper(WebDriver driver){
    this.driver=driver;
    }



    public WebElement To_check_Present_of_Element_located(final By findElement){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
   return wait.until(ExpectedConditions.presenceOfElementLocated(findElement));

    }
    public WebElement To_Click_Element(final By findElement){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
      return wait.until(ExpectedConditions.elementToBeClickable(findElement));

    }

    public Boolean ElementSelectable(final By findElement){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
       return wait.until(ExpectedConditions.elementToBeSelected(findElement));
    }

    public WebElement ElementPresent(final By findElement){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
      return wait.until(ExpectedConditions.presenceOfElementLocated(findElement));
    }
}

package demo.pages;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleResult {

    public void getFirstLink(){
        WebElement firstlink = WebDriverInstance.driver.findElement(By.xpath("//*[@class='r']"));
        firstlink.click();
    }

}
